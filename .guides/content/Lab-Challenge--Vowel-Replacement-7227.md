----------

## Replacing Vowels with a *
You are going to write a program that takes a string called `myString` and returns the string but with a `*` in the place of vowels. Assume that vowels are upper and lowercase `a, e, i, o, u`. For example, if `myString = "Hello"`, then your program will print `"H*ll*"`.

Some of the code has already been filled out for you. Your task is to complete the program so that it produces some of the sample output below. If  you accidentally change anything from the original code, you can copy and paste the code back into the text editor.

```java
public class LabChallenge {
  public static void main(String args[]) {
    
    String myString = args[0];
    char ch;
    
    //add code below this line
    

    
    //add code above this line
  }
}
```

### Click to compile your code
{Compile Code}(javac code/strings/LabChallenge.java)

### Test your code with a few different values

{Test with Hello}(java -cp code/strings/ LabChallenge Hello)
<details><summary><b>Expected Output</b></summary><code>H*ll*</code></details><br>

{Test with Apple}(java -cp code/strings/ LabChallenge Apple)
<details><summary><b>Expected Output</b></summary><code>*ppl*</code></details><br>

{Test with Watermelon!}(java -cp code/strings/ LabChallenge Watermelon!)
<details><summary><b>Expected Output</b></summary><code>W*t*rm*l*n!</code></details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of string methods and conditionals to produce the desired output.

{Check It!|assessment}(code-output-compare-1980739544)
