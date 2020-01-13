----------

## If Statement

If statements test to see if a certain condition is true. If yes, then a specific commands are run. The simple if statement does not do anything if the boolean expression is false.

```java
if (7 != 10){
    System.out.println("The above statement is true");
    System.out.println("The above statement is still true");
}
System.out.println("This is not related to the if statement");
```

[Code Visualizer](open_tutor code/conditionals/PlaygroundIf.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundIf.java java -cp code/conditionals/ PlaygroundIf )

|||challenge
## What happens if you:
* Change `!=` to `==`?
* Change `7 == 10` to `true`?
* Change `true` to `false`?
* Remove the curly braces `{}` with the condition set to `false`?

|||

[Code Visualizer](open_tutor code/conditionals/PlaygroundIf.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundIf.java java -cp code/conditionals/ PlaygroundIf 2)

## Testing Multiple Cases

You will find yourself needing to test the same variable multiple times. Be sure that you set up your conditionals to test **all** possible values of the variable.

```java
int grade = 90;

if(grade > 70) {
    System.out.println("Congrats, you passed the class");
}
    
if(grade < 70){
    System.out.println("Condolences, you did not pass the class");
}
```

[Code Visualizer](open_tutor code/conditionals/PlaygroundIf.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundIf.java java -cp code/conditionals/ PlaygroundIf 3)

|||challenge
## What happens if you:
* Change `grade` to `60`?
* Change `grade` to `70`?
* Change `grade > 70` to `grade >= 70`?

|||

[Code Visualizer](open_tutor code/conditionals/PlaygroundIf.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundIf.java java -cp code/conditionals/ PlaygroundIf 4)

{Check It!|assessment}(multiple-choice-952800372)

