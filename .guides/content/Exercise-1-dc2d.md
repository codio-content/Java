----------

## Conditionals Exercise 1

**Problem**
Use the variable `x` as you write this program. `x` will represent a positive integer. Write a program that determines if `x` is between 0 and 25 or between 75 and 100. If yes, print the message:`_ is between 0 and 25 or 75 and 100`, where the blank would be the value of `x`. The program should do nothing if the value of `x` does not fit into either range.

Note: These are *inclusive* ranges - 0, 25, 75 and 100 should print out the message.

<details><summary><b>Type Casting</b></summary>Use the <code>String.valueOf(x)</code> command to type cast the variable <code>x</code> as a string.</details><br>

**Expected Output**
* If `x` is `8`, then the output would be: `8 is between 0 and 25 or 75 and 100`.
* If `x` is `80`, then the output would be: `80 is between 0 and 25 or 75 and 100`.
* If `x` is `100`, then the output would be: `100 is between 0 and 25 or 75 and 100`.


### Compile code after you make changes

{Compile Code}(javac code/conditionals/Exercise1.java)

### Test your code with a few different values

{Test with 8}(java -cp code/conditionals/ Exercise1 8)

{Test with 80}(java -cp code/conditionals/ Exercise1 80)

Note: This should output nothing. You should see Codio's default output of `Command was successfully executed`
{Test with 50}(java -cp code/conditionals/ Exercise1 50)

{Check It!|assessment}(code-output-compare-80440528)
