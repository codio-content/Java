---

## Methods Exercise 5

Like in Exercise 4, your task is to develop a method called `isPalindrome()` that takes a **string** as a parameter. If the string is a palindrome (a word that is spelled the same forward and backward), then the method will return a **boolean** of `true`. If the string is not a palindrome, then `false` is returned. The difference between this exercise and Exercise 4, however, is that you will need to use a helper method called `reverse()` within `isPalindrome()`. The `reverse()` method takes a **string** as a parameter and reverses it. Then the reversed string is returned.

Remember that **capitalization** matters. For example, `"Level"` would not be considered a palindrome because uppercase `"L"` and lowercase `"l"` are not the same.

**Existing Code:**
```java
import java.util.*;

public class Exercise5 {

  public static String reverse(String x) {
    String y = "";
    for (int i = x.length() - 1; i >= 0; i--) {
      y += x.charAt(i);
    }
    return y;
  }
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    String x = args[0];
    System.out.println(isPalindrome(x));
  }
  
}
```

<details><summary><b>Hint</b></summary>Consider creating a new empty string and populating it with characters of the specified string in reverse order. Then check the two strings for equality. Remember that the method should return a boolean, therefore, you should declare a boolean variable and have that boolean change based on certain conditions. Then return that variable.</details><br>

### Requirements
* You **should not** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You **must** include the helper method `reverse()` within your `isPalindrome()` method; otherwise, you will not receive credit for your work!

### Compile and test your code with a few different values
The button below will compile and test the code with `"Level"`.
{Compile and test}(sh .guides/methods/exercise5.sh Level)
<details><summary><b>Expected Output</b></summary><code>false</code></details><br>

The button below will compile and test the code with `"anna"`.
{Compile and test}(sh .guides/methods/exercise5.sh anna)
<details><summary><b>Expected Output</b></summary><code>true</code></details><br>

The button below will compile and test the code with `"022220"`.
{Compile and test}(sh .guides/methods/exercise5.sh 022220)
<details><summary><b>Expected Output</b></summary><code>true</code></details><br>

The button below will compile and test the code with `"10"`.
{Compile and test}(sh .guides/methods/exercise5.sh 10)
<details><summary><b>Expected Output</b></summary><code>false</code></details><br>

{Check It!|assessment}(test-229697381)
