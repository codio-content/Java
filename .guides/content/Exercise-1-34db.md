----------

## Strings Exercise 1

**Problem**
Write a program that takes input from a user and prints the first character of the input and the last character with some context. For example, if `baseball` is the string, then the program will output `b is the first character and l is the last character`. If `cat` is the string, then `c is the first character and t is the last character` will be printed.

```java
public class Exercise1 {
  public static void main(String args[]) {
    
    String myString = args[0];
    
    //add code below this line
    

    
    //add code above this line
  }
}
```

### Click to compile your code
{Compile Code}(javac code/strings/Exercise1.java)

### Test your code with a few different values

{Test with baseball}(java -cp code/strings/ Exercise1 baseball)
<details><summary><b>Expected Output</b></summary><code>b is the first character and l is the last character</code></details><br>

{Test with cat}(java -cp code/strings/ Exercise1 cat)
<details><summary><b>Expected Output</b></summary><code>c is the first character and t is the last character</code></details><br>

{Test with 123!}(java -cp code/strings/ Exercise1 123!)
<details><summary><b>Expected Output</b></summary><code>1 is the first character and ! is the last character</code></details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of string methods and/or conditionals to produce the desired output.

{Check It!|assessment}(code-output-compare-388959606)
