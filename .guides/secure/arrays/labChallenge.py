import sys

with open('code/arrays/LabChallenge.java') as subfile:
  subtext = subfile.read()
  
  if subtext.count('String[][] chessboard = new String[8][8];') !=1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
  if subtext.count('for (int row = 0; row < chessboard.length; row++) {') != 1 or \
  subtext.count('for (int col = 0; col < chessboard[0].length; col++) {') != 1 or \
  subtext.count('if (col == chessboard[0].length - 1) {') != 1 or \
  subtext.count('System.out.println(chessboard[row][col]);') != 1 or \
  subtext.count('System.out.print(chessboard[row][col]);') != 1:
    print("You cannot make any changes to the existing code!")
    sys.exit(1)
    
sys.exit(0)