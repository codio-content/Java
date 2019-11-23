----------

## Switch Case vs If Else

Java allows you to use either `switch case` or a series of `if else` to handle decisions with multiple outcomes. There are a few places where you would use one over the other.

### If Else is used for ranges - Switch Case is for values



### If Else is used for handling multiple variables




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
