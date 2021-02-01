---

## Methods Exercise 1

Write a method called `getAvg()` that takes two **double** parameters and **returns** the average of these two parameters as **doubles**. If either of the parameters is not a double or an integer, the program will catch an exception and print `One or more arguments is not a double or an int.`.

**Existing Code:**
```java
import java.util.*;

public class Exercise1 {
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    try {
      double x = Double.parseDouble(args[0]);
      double y = Double.parseDouble(args[1]);
      System.out.println(getAvg(x, y));
    }
    catch (Exception e) {
      System.out.println("One or more arguments is not a double or an int.");
    }
  }
  
}
```

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of methods, loops, and/or conditionals to produce the desired output.

### Compile and test your code with a few different values

{Compile and test with 10 & 25}(sh .guides/methods/exercise1.sh 10 25)
<details><summary><b>Expected Output</b></summary><code>17.5</code></details><br>

{Compile and test with 10 & cat}(sh .guides/methods/exercise1.sh 10 cat)
<details><summary><b>Expected Output</b></summary><code>One or more arguments is not a double or an int.</code></details><br>

{Compile and test with 2.5 & 3.5}(sh .guides/methods/exercise1.sh 2.5 3.5)
<details><summary><b>Expected Output</b></summary><code>3.0</code></details><br>

{Check It!|assessment}(test-667592639)
