----------
**Nested loops** are loops inside of another loop. If you have three nested loops, this adds a lot of complexity. If possible, you should re-factor your code to reduce this complexity.

### Syntax
The code below will draw a rectangle of 100 `#` in a 10 x 10 grid. The first loop controls the row of output, while the second loop prints 10 `#` to the screen.

```java
for(int row = 0; row < 10; row++){
    for(int col = 0; col < 10; col++) {
        System.out.print("#");
    }
    System.out.println(""); //adds new line
}
```

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops )

|||challenge
## What happens if you:
* Change the first loop boolean expression to `row < 5`?
* Change the second loop boolean expression to `col < 20`?

|||

### Nested Loop Coding Challenge 1
Using nested loops, write some code that outputs the following:

```
##########
##########
##########
##########
##########
```

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 2)
<details><summary>**Hint**</summary>The output is the same character (`#`). Make sure that your nested loops have the right numbers in the boolean expressions to get the appropriate number of rows and columns.</details>

### Nested Loop Coding Challenge 2
Using nested loops, write some code that outputs the following:

```
##########
**********
##########
**********
##########
```

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 3)
<details><summary>**Hint**</summary>The output is a `#` when the outer loop variable is even (0, 2, 4) and a `*` when the outer loop variable is odd (1, 3).</details>

### Nested Loop Coding Challenge 3
Using nested loops, write some code that outputs the following:

```
1
22
333
4444
55555
```

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 4)
<details><summary>**Hint**</summary>First, the outer loop does not start with 0. Second, the inner loop runs the same amount of times as the row number.</details>