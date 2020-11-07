---

## Breaking the Loop

The following program (also shown in the text editor on the left) contains one or more infinite loops that prevent the program from printing the desired output. 

```java
public class Exercise4 {
  public static void main(String args[]) {
    
    for (int i = 100; i <= 100; i--) {
      while (true) {
        System.out.println("Print me!");
      }
    }
  }
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/Exercise1.java java -cp code/arrays/ Exercise1 1)

[Code Visualizer](open_tutor code/arrays/Exercise1.java)

Using what you know about `break` statements, fix the program so that it runs, prints correctly, and terminates successfully.

### Requirements
* You **cannot** make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
* You need to add **two and only two** `break;` statements to the program.
* The program's expected output is: `Print me!`
