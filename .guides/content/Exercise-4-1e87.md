---

## Three Points
Given the current code:
```java
public class Exercise4 {
  public static void main(String args[]) {
    
    int x1 = Integer.parseInt(args[0]);
    int y1 = Integer.parseInt(args[1]);
    int x2 = Integer.parseInt(args[2]);
    int y2 = Integer.parseInt(args[3]);
    int x3 = Integer.parseInt(args[4]);
    int y3 = Integer.parseInt(args[5]);
    int[][] points = new int[3][2];
    
    //add code below this line



    //add code above this line
    
  }
}
```

Complete the program so that it takes in 3 pairs of coordinate points as arguments, stores it in the 2D array `points`, and then prints the points in correct coordinate-point format. For example, arguments `1`, `2`, `3`, `4`, `5`, and `6` will produce the output:
```java
(1, 2)
(3, 4)
(5, 6)
```

### Click to compile your code
{Compile Code}(javac code/arrays/Exercise4.java)

### Test your code with a few different values

{Test with 1, 2, 3, 4, 5, 6}(java -cp code/arrays/ Exercise4 1 2 3 4 5 6)
<details><summary><b>Expected Output</b></summary><code>(1, 2)</code><br><code>(3, 4)</code><br><code>(5, 6)</code></details><br>

{Test with -2, 4, 6, -12, -24, -42}(java -cp code/arrays/ Exercise4 -2 4 6 -12 -24 -42)
<details><summary><b>Expected Output</b></summary><code>(-2, 4)</code><br><code>(6, -12)</code><br><code>(-24, -42)</code></details><br>

{Test with 0, 10, 20, 40, 80, 160}(java -cp code/arrays/ Exercise4 0 10 20 40 80 160)
<details><summary><b>Expected Output</b></summary><code>(0, 10)</code><br><code>(20, 40)</code><br><code>(80, 160)</code></details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** 2D array methods to store and print the elements in correct coordinate-point format.

{Check It!|assessment}(code-output-compare-1856445250)
