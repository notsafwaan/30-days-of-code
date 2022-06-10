# Nimm is an ancient game of strategy that is named after the old German word for "take." 
# It is also called Tiouk Tiouk in West Africa and Tsynshidzi in China.
# Players alternate taking stones until there are zero left.
# The game of Nimm goes as follows:
# The game starts with a pile of 20 stones between the players.
# The two players alternate turns.
# On a given turn, a player may take either 1 or 2 stone from the center pile.
# The two players continue until the center pile has run out of stones.
# The last player to take a stone loses.

NO_OF_STONES = 20 
def main(): 
    player_no = 1
    stones_left = NO_OF_STONES
    while stones_left != 0 :
        print("There are {} stones left".format(stones_left))
        stones_to_remove = int(input("Player {} would you like to remove 1 or 2 stones? ".format(player_no)))
        while stones_to_remove > 2 or stones_to_remove < 0:
            print("That's illegal. You can only take 1 or 2 stones. Stick to the rules!\n")
            stones_to_remove = int(input("Player {} would you like to remove 1 or 2 stones? ".format(player_no)))
        stones_left = stones_left - stones_to_remove 
        print("")      
        if player_no == 1:
            player_no = 2
        else:
            player_no = 1
    print("Player {} wins!".format(player_no))
    
if __name__ == '__main__':
    main()
