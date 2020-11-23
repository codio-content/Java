---

## Row and Column Sums
Given the current code:
```java
public class Exercise4 {
  public static void main(String args[]) {
    
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);
    int[][] nums = new int[3][3];
    
    //add code below this line



    //add code above this line
    
    for (int row = 0; row < nums.length; row++) {
      for (int col = 0; col < nums[0].length; col++) {
        if (col == 2) {
          System.out.println(nums[row][col]);
        }
        else {
          System.out.print(nums[row][col]);
        }
      }
    }
  }
}
```

Complete the program so that it takes in 4 integers (`a`, `b`, `c`, and `d`) as arguments, stores them in the 2D array `nums`, and then prints their row, column, and total sums . For example, arguments `1`, `2`, `3`, and `4` will produce the output:
```java
1 2 3
3 4 7
4 6 20
```
where `3` and `7` are row sums, `4` and `6` are column sums, and `20` is the total sum.

Arguments `9`, `8`, `7`, and `6` will produce the output:
```java
9 8 17
7 6 13
16 14 60  
```
where `17` and `13` are row sums, `16` and `14` are column sums, and `60` is the total sum.

### Click to compile your code
{Compile Code}(javac code/arrays/Exercise4.java)

### Test your code with a few different values

{Test with 1, 2, 3, 4}(java -cp code/arrays/ Exercise4 1 2 3 4)
<details><summary><b>Expected Output</b></summary><code>1 2 3</code><br><code>3 4 7</code><br><code>4 6 20</code></details><br>

{Test with 9, 8, 7, 6}(java -cp code/arrays/ Exercise4 9 8 7 6)
<details><summary><b>Expected Output</b></summary><code>9 8 17</code><br><code>7 6 13</code><br><code>16 14 60</code></details><br>

{Test with -2, 4, 6, -12}(java -cp code/arrays/ Exercise4 -2 4 6 -12)
<details><summary><b>Expected Output</b></summary><code>-2 4 2</code><br><code>6 -12 -6</code><br><code>4 -8 -8</code></details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You should access and modify the 2D array by **assigning** the correct sums to each row and column indices pair.

{Check It!|assessment}(code-output-compare-1856445250)
