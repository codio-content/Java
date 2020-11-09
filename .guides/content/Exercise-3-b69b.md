---

## Print Backwards
You are writing a program that adds three String arguments into an ArrayList called `reverse`.
```java
import java.util.ArrayList;

public class Exercise3 {
  public static void main(String args[]) {
    
    ArrayList<String> reverse = new ArrayList<String>();
    reverse.add(args[0]);
    reverse.add(args[1]);
    reverse.add(args[2]);
    
    //add code below this line



    //add code above this line
    
    System.out.println(reverse);
    
  }
}
```

Then you want to modify the String arguments so that they are printed in reverse order. For example, if the three String arguments are `one`, `two`, and `three`, then the program will print:
```java
[three, two, one]
```

### Click to compile your code
{Compile Code}(javac code/arrays/Exercise3.java)

### Test your code with a few different values

{Test with 1, 2, 3}(java -cp code/arrays/ Exercise3 1 2 3)
<details><summary><b>Expected Output</b></summary><code>[3, 2, 1]</code></details><br>

{Test with today, is, great}(java -cp code/arrays/ Exercise3 today is great)
<details><summary><b>Expected Output</b></summary><code>[great, is, today]</code></details><br>

{Test with do, re, mi}(java -cp code/arrays/ Exercise3 do re mi)
<details><summary><b>Expected Output</b></summary><code>[mi, re, do]</code></details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of ArrayList methods to modify `reverse` so that the arguments print in reverse order.

{Check It!|assessment}(code-output-compare-2597383171)
