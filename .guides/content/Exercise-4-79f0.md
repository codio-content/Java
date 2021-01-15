----------

## Recursion Exercise 4

**Problem**
Write a recursive method called `reverseString` that takes a string as a parameter. Return the string in reverse order. **Hint**, the `slice` operator will be helpful when solving this problem.

**Expected Output**
* If the function call is `reverseString("cat")`, then the function would return `tac`
* If the function call is `reverseString("house")`, then the function would return `esuoh`

[Code Visualizer](open_tutor code/recursion/Exercise4.java)
{Try it}(sh .guides/bg.sh javac code/recursion/Exercise4.java java -cp code/recursion/ Exercise4 1)

<details>
  <summary><strong>Hint</strong></summary>

  The recursive pattern is to take the last character from the string and pass the string (minus the last character) to the function.
</details>