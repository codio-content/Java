----------

## If Else Statement

The if else statement is used when you want something to specific to happen if the boolean expression is true and if you want something else to happen if it is false. 

```java
boolean my_bool = true;

if (my_bool) {
    System.out.println("The value of my_bool is true");
}
else{
    System.out.println("The value of my_bool is false");
}
```

[Code Visualizer](open_tutor code/conditionals/PlaygroundIfElse.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundIfElse.java java -cp code/conditionals/ PlaygroundIfElse )

|||challenge
## What happens if you:
* Change the value of `my_bool` to `false`?
* Change the value of `my_bool` to `! true && ! false`?

|||

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundIfElse.java java -cp code/conditionals/ PlaygroundIfElse 2)


## Testing Multiple Cases

You will find yourself needing to test the same variable multiple times.

![.guides/img/efficiency elif - Java](.guides/img/efficiency elif - Java.png)










{Check It!|assessment}(parsons-puzzle-3652686275)

