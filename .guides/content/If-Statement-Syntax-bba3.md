----------

## If Statement Syntax

Conditionals are pieces of code that make a decision about what the program is going to do next. The most common conditional is the if statement.

![.guides/img/if-statement-syntax](.guides/img/if-statement-syntax.png)

If statements in Java must contain the following items:
* the keyword `if`
* a boolean expression surrounded by parentheses
* curly braces around all lines of code that will run if the boolean expression is true

```java
if (5 > 4) {
    System.out.println("1st command if true");
    System.out.println("2nd command if true");
}
System.out.println("I will ALWAYS print!");
```

[Code Visualizer](open_tutor code/conditionals/PlaygroundIfSyntax.java)

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundIfSyntax.java java -cp code/operators/ PlaygroundIfSyntax )

{Check It!|assessment}(parsons-puzzle-4036047307)
