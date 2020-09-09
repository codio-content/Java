----------

## Infinite Loops Are Bad, Right?
Well, that depends. If an infinite loop is caused because the counting variable isn't incremented, then it's a bug. However, some programmers purposely create a condition that will always evaluate to true. Therefore, the loop will always run. In such cases, a `break` statement is used to stop the loop at a particular point in the program.

Take a look at the following program (also shown in the text editor on the left).
```java
import java.util.Random;

public class BreakStatement {
  
  static Random random = new Random();
  
  public static void main(String args[]){
    
    while(true){
      System.out.println("This is an infinite loop");
      int randNum = random.nextInt(100) + 1; // random integer between 1 and 100

      if(randNum > 75){
        System.out.println("The loop has ended");
        break; // stop and exit the loop
      } // close if condition
    } // close while loop
  }
}
```
Then click on the `TRY IT` button below *a few times* to run the code and see the resulting outputs. You can also click on the ++Code Visualizer++ link below to see how the code runs behind-the-scenes.

[Code Visualizer](open_tutor code/loops/BreakStatement.java)
{Try it}(sh .guides/bg.sh javac code/loops/BreakStatement.java java -cp code/loops/ BreakStatement )

Even though `while(true)` will always evaluate as a true statement, the loop never becomes infinite because of the `break;` statement.

|||challenge
## What happens if you:
* Remove the `break;` statement?
* Add `break;` to the line before `System.out.println("The loop has ended");`?

|||

### Comparing While Loops
The `while` loops introduced on the previous pages look different from the `while` loop covered on this page; however, they both have the same components and behave similarly.

![While Loop Comparison](.guides/img/WhileLoopComparison.png)

{Check It!|assessment}(multiple-choice-247291117)
