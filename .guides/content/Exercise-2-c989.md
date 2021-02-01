---

## Methods Exercise 2

Write a method called `getOddsEvens()` that takes a **boolean** and an **Integer ArrayList** as parameters. If the boolean parameter is `true`, **print** only the **even** integers separated by a **newline**. If the boolean parameter is `false`, **print** only the **odd** integers separated by a **newline**.

**Existing Code:**
```java
import java.util.*;

public class Exercise2 {
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    boolean x = Boolean.parseBoolean(args[0]);
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i < args.length; i++) {
      y.add(Integer.parseInt(args[i]));
    }
    getOddsEvens(x, y);
  }
  
}
```

<details><summary><b>Hint</b></summary>The <code>main()</code> method's job is to take the first command and turn it into a boolean <code>x</code>. Then take the second command and every command after and turn those into integers. These integers are then added to an ArrayList <code>y</code>. Your task is to check whether the boolean is true or false and print only the relevant integers within the ArrayList that correspond to true or false.</details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of methods, loops, and/or conditionals to produce the desired output.

### Compile and test your code with a few different values

{Compile and test with true & 13, 22, 8, 31}(sh .guides/methods/exercise2.sh true 13 22 8 31)
<details><summary><b>Expected Output</b></summary><code>22</code><br><code>8</code></details><br>

{Compile and test with false & 13, 22, 8, 31}(sh .guides/methods/exercise2.sh false 13 22 8 31)
<details><summary><b>Expected Output</b></summary><code>13</code><br><code>31</code></details><br>

{Compile and test with true & 1, 2, 3, 4, 5}(sh .guides/methods/exercise2.sh true 1 2 3 4 5)
<details><summary><b>Expected Output</b></summary><code>2</code><br><code>4</code></details><br>

{Compile and test with false & 1, 2, 3, 4, 5}(sh .guides/methods/exercise2.sh false 1 2 3 4 5)
<details><summary><b>Expected Output</b></summary><code>1</code><br><code>3</code><br><code>5</code></details><br>

{Check It!|assessment}(test-186732078)
