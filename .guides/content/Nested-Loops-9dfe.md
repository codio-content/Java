---

A **nested loop** is a loop that exists inside of another loop. An advantage of using nested loops is that the loops can work together to create unique and complex outputs. However, due to their complexity potential, it is rare to see the implementation of more than two nested loops. If possible, it is recommended that you re-factor your code to reduce this complexity.

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
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 1)

|||challenge
## What happens if you:
* Replace `row < 10` with `row < 5` in the code above?
* Replace `col < 10` with `col < 20` in the code above?

|||

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 2)

### Nested Loop Coding Challenge 1
Using nested loops, write some code that outputs the following:

```java
###########
###########
###########
###########
###########
###########
###########
```

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 3)

<details><summary><b>Hint</b></summary>The output is the same character (<code>#</code>). Make sure that your nested loops have the right numbers in the boolean expressions to get the appropriate number of rows and columns.</details>

### Nested Loop Coding Challenge 2
Using nested loops, write some code that outputs the following:

```java
<<<<<<<<<<
>>>>>>>>>>
<<<<<<<<<<
>>>>>>>>>>
<<<<<<<<<<
```

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 4)

<details><summary><b>Hint</b></summary>The output is a <code>&lt;</code> when the outer loop variable is even (0, 2, 4) and a <code>&gt;</code> when the outer loop variable is odd (1, 3).</details>

### Nested Loop Coding Challenge 3
Using nested loops, write some code that outputs the following:

```java
1
22
333
4444
55555
```

[Code Visualizer](open_tutor code/loops/NestedLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/NestedLoops.java java -cp code/loops/ NestedLoops 5)
  
<details><summary><b>Hint</b></summary>Note how the pattern goes from <code>1</code> to <code>5</code> starting on line 1 (through line 5) and prints the line number equal to the amount of times as that numbered line. First, the outer loop should start at <code>1</code>. Second, the inner loop should run the same amount of times as the row number up to the row number's limit.</details>
  
<table><tbody ><tr><td><details><summary>
	<b>Sample Solutions</b>
</summary><br>
  There are <i>multiple</i> ways to solve the challenges above but here are some sample solutions using various combinations of <code>for</code> and <code>while</code> loops:
  
```java
int row = 0;
while (row < 7) {
  int col = 0;
  while (col < 11) {
    System.out.print("#");
    col++;
  }
 System.out.println("");
  row++;
}
```

```java
for (int row = 0; row < 5; row++) {
  if (row % 2 == 0) {
    int col = 0;
    while (col < 10) {
      System.out.print("<");
      col++;
    }
    System.out.println("");
  }
  else {
    int col = 0;
    while (col < 10) {
      System.out.print(">");
      col++;
    }
    System.out.println("");
  }
}
```
  
```java
for (int row = 1; row <= 5; row++) {
  for (int col = 1; col <= row; col++) {
    System.out.print(row);
  }
  System.out.println("");
}
```

</details></td></tr></tbody>
</table>
  
{Check It!|assessment}(multiple-choice-1201450033)
