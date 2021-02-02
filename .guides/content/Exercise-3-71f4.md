----------

## Exercise 3

**Problem**
Write a program that accepts input from the user and creates another string that contains either a `u`, `l`, or `-` for each character of the original string. Use `u` when the character is uppercase, and use `l` when the character is lowercase. If the character is neither uppercase nor lowercase, use `-`. Print the `original` string first, then print the `modified` string.

Here is what you have so far:
```java
public class Exercise3 {
  public static void main(String args[]) {
    
    String original = args[0];
    String modified = "";
    char ch;
    
    //add code below this line
    

    
    //add code above this line
  }
}
```

**Examples**
* If the user inputs `cat`, then the output will be:
```java
cat
lll
```
* If the user inputs `HouSE`, then the output will be:
```java
HouSE
ulluu
```

### Click to compile your code
{Compile Code}(javac code/strings/Exercise3.java)

### Test your code with a few different values

{Test with cat}(java -cp code/strings/ Exercise3 cat)
<details><summary><b>Expected Output</b></summary><code>cat</code><br><code>lll</code></details><br>

{Test with HouSE}(java -cp code/strings/ Exercise3 HouSE)
<details><summary><b>Expected Output</b></summary><code>HouSE</code><br><code>ulluu</code></details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of string methods and/or conditionals to produce the desired output.

{Check It!|assessment}(code-output-compare-267012679)
