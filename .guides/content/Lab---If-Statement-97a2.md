----------

## Tutorial Lab 1: If Statements

The if statement allows for your program to make a decision about what it should do. It asks a simple question, is this condition true? If yes, then the computer will execute certain commands.

```java
int x = 5;

if (x < 10) {
    System.out.println("Less than 10");
}
```

[Code Visualizer](open_tutor code/conditionals/Lab_IfStatement.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/Lab_IfStatement.java java -cp code/conditionals/ Lab_IfStatement )

An if statement is comprised of the keyword `if`, followed by a boolean expression surrounded by parentheses. Any code that should run if the boolean expression is true is surrounded by curly braces `{}`. It is best practice to indent this code, but it does not effect how the code runs.

If the boolean expression is false, the code in curly braces is skipped, and the program continues as normal.

```java
int x = 20;

if (x < 10) {
    System.out.println("Less than 10");
}
    
System.out.println("And the program continues...");
```

[Code Visualizer](open_tutor code/conditionals/Lab_IfStatement.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/Lab_IfStatement.java java -cp code/conditionals/ Lab_IfStatement 2)

{Check It!|assessment}(multiple-choice-3649559415)
