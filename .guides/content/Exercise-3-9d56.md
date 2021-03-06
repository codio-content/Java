---

## Consecutive Sums

You are trying to produce a program that takes in two **integer** arguments from the user and then prints the **consecutive sum** of all numbers between those integers inclusively. For example, arguments `5` and `8` will result in a sum of `26` (5 + 6 + 7 + 8 = 26). If the integer arguments are the same value, the program will simply print that value as the sum.

### Requirements
* Declare and initialize a variable to keep tracking of your **sum**.
* Use **any** loop to find the **consective sum** between the integer variables `a` and `b`.
* If `a` and `b` are the same integers, then print *either* `a` *or* `b` as the sum.

<details><summary>What does the <code>if (a > b)</code> conditional in the code do?</summary>The <code>if</code> conditional enables the program to sort the arguments from the user from smaller to larger. For example, if the user types <code>8</code> and <code>5</code>, the conditional will rearrange the arguments so that <code>a</code> takes on the smaller argument of <code>5</code> and <code>b</code> takes on the larger argument of <code>8</code>.</details>

### Click to compile your code
{Compile Code}(javac code/loops/Exercise3.java)

### Test your code with a few different values

{Test with 5 & 8}(java -cp code/loops/ Exercise3 5 8)

{Test with 1 & 1}(java -cp code/loops/ Exercise3 1 1)

{Test with 9 & 3}(java -cp code/loops/ Exercise3 9 3)

{Test with -3 & -4}(java -cp code/loops/ Exercise3 -3 -4)

{Check It!|assessment}(code-output-compare-124790676)
