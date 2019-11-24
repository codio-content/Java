----------

## Tutorial Lab 3: Switch Statement

The switch statement gives your program the ability to perform different actions based on the value of a given variable.

```java
int size = 3;

switch(size) {
  case 1: System.out.print("Short"); break;
  case 2: System.out.print("Tall"); break;
  case 3: System.out.print("Grande"); break;
  case 4: System.out.print("Venti"); break;
  case 5: System.out.print("Trenta"); break;
  default: System.out.print("Grande");
}
```

[Code Visualizer](open_tutor code/conditionals/Lab_Switch.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/Lab_Switch.java java -cp code/conditionals/ Lab_Switch )

The variable used to make the decision is in parentheses following the `switch` keyword. Inside curly braces, the cases listing the different values to check are followed by a `:` and then the code that should run if the variable is equal to that case's value. The last case, `default` runs if none of the other cases are true. Each code segment except the last one ends with `break;` to signal the program to jump to the end curly brace. 

Be careful to remember `break;` statements at the end of each case. Check out what happens when you remove them.

```java
int size = 3;

switch(size) {
  case 1: System.out.print("Short");
  case 2: System.out.print("Tall");
  case 3: System.out.print("Grande");
  case 4: System.out.print("Venti");
  case 5: System.out.print("Trenta");
  default: System.out.print("Grande");
}
```

[Code Visualizer](open_tutor code/conditionals/Lab_Switch.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/Lab_Switch.java java -cp code/conditionals/ Lab_Switch 2)

The output of the program does not make sense as it continues through the test of the code segments.

{Check It!|assessment}(fill-in-the-blanks-330785356)

