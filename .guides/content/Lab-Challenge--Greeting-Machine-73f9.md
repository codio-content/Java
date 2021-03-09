----------

## Create a Greeting Machine
You are going to develop a method that takes an ArrayList of strings as a parameter, iterates through that ArrayList and greets every element in it with `"Hello"` followed by a **newline**.

**Existing Code:**
```java
import java.util.*; 

public class LabChallenge {
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    ArrayList<String> names = new ArrayList<String>();
    for (String s : args) {
      names.add(s);
    }
    sayHello(names);
  }
  
}
```

<details>
  <summary><strong>Hint</strong></summary>
  You can start your method with <code>public static void sayHello(ArrayList&lt;String&gt; variable)</code>. Then iterate through <code>variable</code> using a loop in order to print <code>Hello</code> to each element in <code>variable</code>. You can also review the reading question in <strong>"Alternative Parameters"</strong> in the <strong>"Parameters"</strong> assignment.
</details>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You can use **any** number of additional methods you'd like but you **must** include at least the method called `sayHello()` in your code.

### Compile and test your code with a few different values

{Compile and test with Alan & Bob}(sh .guides/methods/labchallenge.sh Alan Bob)
<details><summary><b>Expected Output</b></summary><code>Hello Alan</code><br><code>Hello Bob</code></details><br>

{Compile and test with 1, 2 & 3}(sh .guides/methods/labchallenge.sh 1 2 3)
<details><summary><b>Expected Output</b></summary><code>Hello 1</code><br><code>Hello 2</code><br><code>Hello 3</code></details><br>

{Compile and test with Codio}(sh .guides/methods/labchallenge.sh Codio)
<details><summary><b>Expected Output</b></summary><code>Hello Codio</code></details><br>

{Check It!|assessment}(code-output-compare-2170460350)
