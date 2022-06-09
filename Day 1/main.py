import os
import os.path
from datetime import date
from shutil import rmtree
import stat

details = { "timeLimit" : 5,
"historyPath": 'your-path'}

def calc_btwn_days(d1, d2):
    date1 = date(d1.year, d1.month, d1.day)
    date2 = date(d2.year, d2.month, d2.day)
    return (date2 - date1).days

def file_remove_check(no_of_days, file):
    if no_of_days >= details["timeLimit"]:
        if os.path.isfile(file):
            os.remove(file)
            with open(details["historyPath"], 'a') as histFile:
                histFile.write("{},{},file\n".format(date.today(), file))
        else:
            rmtree(file)
            with open(details["historyPath"], 'a') as histFile:
                histFile.write("{},{},Folder\n".format(date.today(), file))
    else:
        return None
def main():
    folderPath = details["folderPath"]
    os.chdir(folderPath)
    folderContent = os.listdir()
    
    count = len(folderContent)
    i = -1 
    while count != 0:
        i += 1
        file = folderContent[0]
        currentDate = date.today()
        fileCreationDate = (date.fromtimestamp(os.stat(file).st_ctime))
        daysBetween = calc_btwn_days(fileCreationDate, currentDate)
        file_remove_check(daysBetween, file)
        folderContent.pop(0)
        count = len(folderContent)
        
if __name__ == '__main__':
    main()
