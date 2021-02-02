----------

## Recursion Exercise 2

**Problem**
Write a recursive method called `listSum` that takes an array of integers as a parameter. Return the sum of all of the integers in the array. **Do not** alter the code on lines 7 to 11; this is needed for the evaluation.

<details>
  <summary><strong>Hint</strong></summary>
  Use the static method <code>Arrays.copyOfRange(array, start, stop)</code> to create a smaller array. <code>start</code> represents the starting index of the new array, and <code>stop</code> represents the ending element of the new array.
</details><br>

**Expected Output**
* If the `listSum` method is called with the array `{1, 2, 3, 4, 5}` then it would return `15`
* If the `listSum` method is called with the array `{10, 12, 10, 7}` then it would return `39`

[Code Visualizer](open_tutor code/recursion/Exercise2.java)
{Try with 1, 2, 3, 4, 5}(sh .guides/bg.sh javac code/recursion/Exercise2.java java -cp code/recursion/ Exercise2 1 2 3 4 5)
{Try with 10, 12, 10, 7}(sh .guides/bg.sh javac code/recursion/Exercise2.java java -cp code/recursion/ Exercise2 10 12 10 7)

{Check It!|assessment}(test-737721285)
