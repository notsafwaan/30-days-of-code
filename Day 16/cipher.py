import string
def cipher(plain_txt, key):
    alpha = string.ascii_uppercase
    cipher_txt = ''
    for char in plain_txt:
        idx = (alpha.index(char) + key ) % 26
        cipher_txt += alpha[idx]
    return cipher_txt    
cip = cipher('SAFWAAN', 2)
print(cip)
