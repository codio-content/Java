----------

## Strings Exercise 2

**Problem**
Write a program that captures input from the user, prints the inputted string as many times as its length, and prints as many lines of this as the length of the input string.

Here is what you have so far:
```java
public class Exercise2 {
  public static void main(String args[]) {
    
    String myString = args[0];
    
    //add code below this line
    

    
    //add code above this line
  }
}
```

### Click to compile your code
{Compile Code}(javac code/strings/Exercise2.java)

### Test your code with a few different values

{Test with cat}(java -cp code/strings/ Exercise2 cat)
<details><summary><b>Expected Output</b></summary><code>catcatcat</code><br><code>catcatcat</code><br><code>catcatcat</code></details><br>

{Test with tree}(java -cp code/strings/ Exercise2 tree)
<details><summary><b>Expected Output</b></summary><code>treetreetreetree</code><br><code>treetreetreetree</code><br><code>treetreetreetree</code><br><code>treetreetreetree</code></details><br>

{Test with !@#^&}(java -cp code/strings/ Exercise2 !@#^&)
<details><summary><b>Expected Output</b></summary><code>!@#^&!@#^&!@#^&!@#^&!@#^&</code><br><code>!@#^&!@#^&!@#^&!@#^&!@#^&</code><br><code>!@#^&!@#^&!@#^&!@#^&!@#^&</code><br><code>!@#^&!@#^&!@#^&!@#^&!@#^&</code><br><code>!@#^&!@#^&!@#^&!@#^&!@#^&</code></details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of string methods and/or conditionals to produce the desired output.

{Check It!|assessment}(code-output-compare-2833772907)
