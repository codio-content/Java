----------

## Recursion Exercise 4

**Problem**
Write a recursive method called `reverseString` that takes a string as a parameter. Return the string in reverse order. **Do not** alter the code on line 5; this is needed for the evaluation.

<details>
  <summary><strong>Hint</strong></summary>
  Use the <code>substring</code> string method to return a substring of another string. This method can take one or two arguments. If you are using only one argument, this represents the start of the substring and will include the remainder of the string. If you are using two parameters, the first number represents the start of the substring and the second number represents the end (exclusive) of the substring.
</details><br>

**Expected Output**
* If the method call is `reverseString("cat")`, then the method would return `tac`
* If the method call is `reverseString("house")`, then the method would return `esuoh`

[Code Visualizer](open_tutor code/recursion/Exercise4.java)
{Try with "cat"}(sh .guides/bg.sh javac code/recursion/Exercise4.java java -cp code/recursion/ Exercise4 cat)
{Try with "house"}(sh .guides/bg.sh javac code/recursion/Exercise4.java java -cp code/recursion/ Exercise4 house)

{Check It!|assessment}(test-2513534229)
