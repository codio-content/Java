----------

## Tutorial Lab 2: If Else Statements

The if else statement gives your program the ability to ask a question, perform actions if the answer is true, and perform another set of actions if the answer is false.

```java
int x = 10;

if(x > 50) {
    System.out.println(String.valueOf(x) + " is greater than 50"); }
else {
    System.out.println(String.valueOf(x) + " is less than 50"); }
```

[Code Visualizer](open_tutor code/conditionals/Lab_IfElse.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/Lab_IfElse.java java -cp code/conditionals/ Lab_IfElse )

The if part of the if else statement is written as before. The `else` keyword is **not** indented; it should be aligned with the `if` keyword. `else` is followed by a `{`. You do not use a boolean expression with `else`. All code that should run when the boolean expression is false should be before the closing curly brace `}`.

Be careful when expressing your boolean expression in terms of "less than or greater than". This does not take into account when the values being compared are equal. Consider the code from above, but with `x` having the value of `50`.

```java
int x = 50;

if(x > 50) {
    System.out.println(String.valueOf(x) + " is greater than 50"); }
else {
    System.out.println(String.valueOf(x) + " is less than 50"); }
```

[Code Visualizer](open_tutor code/conditionals/Lab_IfElse.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/Lab_IfElse.java java -cp code/conditionals/ Lab_IfElse 2)

The output of the program does not make sense. 50 is not less than 50. Sometimes using `<=` and `>=` need to be used. Be sure to think through all of the possible outcomes, and make sure your code can function properly in all of those scenarios.

{Check It!|assessment}(parsons-puzzle-2074845473)