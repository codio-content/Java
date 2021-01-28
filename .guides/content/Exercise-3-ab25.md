---

## Methods Exercise 3

Write a method called `findTerm()` that takes a **string** term and a **string ArrayList** as parameters. If the term exists inside the ArrayList, then a **boolean** value of `true` is **returned**. Else the term does not exist, `false` is returned. Note that **capitalization** matters. For example, `"cat"`and `"Cat"` are not considered the same term.

**Existing Code:**
```java
import java.util.*;

public class Exercise3 {
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    String x = args[0];
    ArrayList<String> y = new ArrayList<String>();
    for (int i = 1; i < args.length; i++) {
      y.add(args[i]);
    }
    System.out.println(findTerm(x, y));
  }
  
}
```

<details><summary><b>Hint</b></summary>The <code>main()</code> method's job is to take the first command and turn it into a boolean <code>x</code>. Then take the second command and every command after and turn those into integers. These integers are then added to an ArrayList <code>y</code>. Your task is to check whether the boolean is true or false and print only the relevant integers within the ArrayList that correspond to true or false.</details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of methods, loops, and/or conditionals to produce the desired output.

### Compile and test your code with a few different values

{Compile and test with uppercase Cat & lowercase dog, fish, cat}(sh .guides/methods/exercise3.sh Cat dog fish cat)
<details><summary><b>Expected Output</b></summary><code>false</code></details><br>

{Compile and test with lowercase toy & lowercase water, toy, house}(sh .guides/methods/exercise3.sh toy water toy house)
<details><summary><b>Expected Output</b></summary><code>true</code></details><br>

{Compile and test with lowercase mouse & lowercase box, car, hat, house}(sh .guides/methods/exercise3.sh mouse box car hat house)
<details><summary><b>Expected Output</b></summary><code>false</code></details><br>

{Check It!|assessment}(test-3156119608)
