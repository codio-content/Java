----------

## Conditionals Exercise 5

**Problem**
Use the variable `x` as you write this program. `x` will represent a string. Write a program that determines if `x` is a vowel (*a, e, i, o,* and *u* ). If yes, print `_ is a vowel`, where the blank is the value of `x`. If no, print `_ is not a vowel`, where the blank is the value of `x`.

**Expected Output**
* If `x` is `a`, then the output would be: `a is a vowel`.
* If `x` is `z`, then the output would be: `z is not a vowel`.

<details><summary><b>Comparing Strings</b></summary>If you choose to directly compare Strings, you may be tempted to write `x == "a"`. However, this won't behave as expected. Instead, use `.equals()`. For example, `x.equals("a")`.</details>

### Compile code after you make changes

{Compile Code}(javac code/conditionals/Exercise5.java)

### Test your code with a few different values

{Test with "a"}(java -cp code/conditionals/ Exercise5 a)

{Test with "z"}(java -cp code/conditionals/ Exercise5 z)

{Check It!|assessment}(code-output-compare-334334839)
