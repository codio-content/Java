----------

## Conditionals Exercise 4

**Problem**
Use the variable `x` as you write this program. `x` will represent a string. Write a program that determines if `x` is a primary color (red, blue, or yellow). If yes, print `_ is primary color`, where the blank is the value of `x`. If no, print `_ is not a primary color`, where the blank is the value of `x`.

**Expected Output**
* If `x` is `red`, then the output would be: `red is a primary color`.
* If `x` is `teal`, then the output would be: `teal is not a primary color`.

<details><summary><b>Comparing Strings</b></summary>If you choose to directly compare Strings, you may be tempted to write `x == "red"`. However, this won't behave as expected. Instead, use `.equals()`. For example, `x.equals("red")`.</details>

### Compile code after you make changes

{Compile Code}(javac code/conditionals/Exercise4.java)

### Test your code with a few different values

{Test with "red"}(java -cp code/conditionals/ Exercise4 red)

{Test with "teal"}(java -cp code/conditionals/ Exercise4 teal)

{Check It!|assessment}(code-output-compare-1582349154)
