----------

## Compound Conditional Statements

Conditional statements (if statements) are used to match an action with a condition being true. For example, print `Even` if a number is even. If you want to test for a number being even and greater than 10, you will need two conditionals.

```java
int num = 16;

if (num % 2 == 0 and num > 10) {
    System.out.println("Even and greater than 10");
}
```

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundCompoundConditionals.java java -cp code/conditionals/ PlaygroundCompoundConditionals )


|||challenge
## What happens if you:
* Change `num` to `8`?
* Change `&&` to `||`?
* Change `==` to `!=`?

|||

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundCompoundConditionals.java java -cp code/conditionals/ PlaygroundCompoundConditionals 2)

## Why Use Compound Conditionals

Both code snippets below do the same thing: Ask if `my_var` is greater than 15 and if `my_var` is less than 20. If both of these are true, then Java will print the value of `my_var`.

![.guides/img/compound-conditional](.guides/img/compound-conditional.png)

The code on the left is a **nested** if statement - which means an if statement is *inside* another if statement.

The code with the compound conditional (on the right) has fewer lines of code, and is easier for a human to read. In fact, it almost reads like a sentence.

{Check It!|assessment}(multiple-choice-1569129353)

