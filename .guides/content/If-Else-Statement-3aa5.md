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

You will find yourself needing to test the same variable multiple times. To simplify this, you can **nest** if-else statements -- which means you can put an if-else structure inside of another if-else structure (as shown on the right). 

![.guides/img/efficiency-if-else](.guides/img/efficiency-if-else.png)

This nesting drastically changes the way to program flows once the correct case is found. On the left, the program checks *every* case no matter the value of the variable. On the right, the **nested** structure causes the program to jump out of the structure once the case is found (because the other cases are inside the `else` which is only run when the boolean expression is false).

```
int grade = 62;
if(grade < 60) {
    System.out.println("F"); }
else if(grade < 70) {
    System.out.println("D"); }
else if(grade < 80) {
    System.out.println("C"); }
else if(grade < 90) {
    System.out.println("B"); }
else if(grade <= 100) {
    System.out.println("A"); }
```


[Code Visualizer](open_tutor code/conditionals/PlaygroundIfElse.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundIfElse.java java -cp code/conditionals/ PlaygroundIfElse 3)

{Check It!|assessment}(parsons-puzzle-3652686275)

