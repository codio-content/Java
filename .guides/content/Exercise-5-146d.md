----------

## Recursion Exercise 5

**Problem**
Write a recursive method called `getMax` that takes an array of integers as a parameter. Return the largest integer in the array. **Do not** alter the code on lines 7 to 11; this is needed for the evaluation.

<details>
  <summary><strong>Hint</strong></summary>
  Use the static method <code>Arrays.copyOfRange(array, start, stop)</code> to create a smaller array. <code>start</code> represents the starting index of the new array, and <code>stop</code> represents the ending element of the new array. In addition, use the <code>Math.max(int1, int2)</code> method to return the larger of two integers.
</details><br>

**Expected Output**
* If the `getMax` method is called with the array `{1, 2, 3, 4, 5}` then it would return `5`
* If the `getMax` method is called with the array `{11, 22, 3, 41, 15}` then it would return `41`

[Code Visualizer](open_tutor code/recursion/Exercise5.java)
{Try with 1, 2, 3, 4, 5}(sh .guides/bg.sh javac code/recursion/Exercise5.java java -cp code/recursion/ Exercise5 1 2 3 4 5)
{Try with 11, 22, 3, 41, 15}(sh .guides/bg.sh javac code/recursion/Exercise5.java java -cp code/recursion/ Exercise5 11 22 3 41 15)

