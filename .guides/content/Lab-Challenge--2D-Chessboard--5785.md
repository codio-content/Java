---

## 2D Chessboard
You are trying to create a chessboard representation using the alphabetical **uppercase** letters `O` and `X`. The `O` represents the lighter spaces while the `X` represents the darker spaces.
```java
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
```

So far you have the following code within the text editor to your left:
```java
public class LabChallenge {
  public static void main(String args[]) {
    
    String[][] chessboard = new String[8][8];
    
    //add code below this line



    //add code above this line
    
    for (int row = 0; row < chessboard.length; row++) {
      for (int col = 0; col < chessboard[0].length; col++) {
        if (col == chessboard[0].length - 1) {
          System.out.println(chessboard[row][col]);
        }
        else {
          System.out.print(chessboard[row][col]);
        }
      }
    }
  }
}
```

## Chessboard Challenge
|||challenge
# Assignment:
For this challenge, you will use your knowledge of 2D arrays to produce the chessboard pattern:
```java
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
```

# Requirement:
Your program **cannot make any changes** to the existing code in the program. If you do, you will **not earn any credit** for this challenge. If you accidentally delete any existing code, you can copy the original code shown above back into your program.

**Hint:** It is probably much easier to use nested `for` loops in your code to populate the 2D array with either `O` or `X` than to go through each (row, column) index to modify the elements.

{Try it}(sh .guides/bg.sh javac code/arrays/LabChallenge.java java -cp code/arrays/ LabChallenge 1)

|||

{Check It!|assessment}(test-2213811040)
