---

## 2D Array Iteration
To iterate through a 2D array, we can use two `for` loops, one **nested** inside another. The outer `for` loop is for the rows while the inner `for` is for the columns.

```java
int[][] digits = { {1, 2, 3},
                   {4, 5, 6}, 
                   {7, 8, 9} };

for (int i = 0; i < digits.length; i++) {
  for (int j = 0; j < digits[0].length; j++) {
    System.out.println(digits[i][j]);
  }
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayIterate.java java -cp code/arrays/ TwoDArrayIterate 1)

[Code Visualizer](open_tutor code/arrays/TwoDArrayIterate.java)

|||challenge
## What happens if you:
* change `digits[0].length` in the inner `for` loop to `digits[1].length`
* change `println` in the print statement to `print`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayIterate.java java -cp code/arrays/ TwoDArrayIterate 2)

[Code Visualizer](open_tutor code/arrays/TwoDArrayIterate.java)

Note that all of the rows' lengths are the same, they each have three elements. Therefore, it doesn't matter if we use `digits[0].length`, `digits[1].length`, or `digits[2].length`. Also note that using `println` prints the elements vertically while `print` prints the elements horizontally. To print the elements so that the columns stay together but the rows separate, we can try something like this:

```java
int[][] digits = { {1, 2, 3},
                   {4, 5, 6}, 
                   {7, 8, 9} };

for (int i = 0; i < digits.length; i++) {
  for (int j = 0; j < digits[0].length; j++) {
    if (j == digits[0].length - 1) {
      System.out.println(digits[i][j]);
    }
    else {
      System.out.print(digits[i][j] + " ");
    }
  }
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayIterate.java java -cp code/arrays/ TwoDArrayIterate 3)

[Code Visualizer](open_tutor code/arrays/TwoDArrayIterate.java)

The `if` conditional forces the elements to be printed with a newline every time the iterating variable reaches the end of the column index. Otherwise, the elements will be printed with a space instead.

## 2D Array with Enhanced For Loop
Like arrays and ArrayLists, 2D arrays can also make use of the **enhanced** `for` loop. 

```java
int[][] digits = { {1, 2, 3},
                   {4, 5, 6}, 
                   {7, 8, 9} };

for (int[] i : digits) {
  for (int j : i) {
    if ((j == 3) | (j == 6) | (j == 9)) {
      System.out.println(j);
    }
    else {
      System.out.print(j + " ");
    }
  }
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayIterate.java java -cp code/arrays/ TwoDArrayIterate 4)

[Code Visualizer](open_tutor code/arrays/TwoDArrayIterate.java)

Note that we cannot use an enhanced `for` loop to manipulate array indices. Our iterating variable goes through the 2D array and takes on each element value rather than each element index. This is why we have the conditional statement `if ((j == 3) | (j == 6) | (j == 9))` rather than `if (j == digits[0].length - 1)`. Additionally, since we have an array inside of another array, our iterating variable `i` is of type `int[]` rather than just `int`.

{Check It!|assessment}(fill-in-the-blanks-2789344707)
