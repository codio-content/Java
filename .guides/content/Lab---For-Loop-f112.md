---

## Tutorial Lab 1: Using the For Loop
Copy the code below into the text editor on the left. Then click on the `TRY IT` button to see the resulting output and ++Code Visualizer++ link (below) to see how the program runs line by line.

```java
for (int x = 0; x < 11; x++) {
  if (x % 2 == 0) {
    System.out.println("Even");
  }
  else {
    System.out.println("Odd");
  }
}
```

[Code Visualizer](open_tutor code/loops/LabForLoop.java)
{Try it}(sh .guides/bg.sh javac code/loops/LabForLoop.java java -cp code/loops/ LabForLoop 1)

### Program Summary
1) The `for` loop runs through all the values of the variable `x` from 0 to 10 as specified in the loop header.
2) For each value of `x`, an expression is evaluated using a conditional `if` statement.
3) If `x` modulo `2` evaluates to 0, then print `Even` with a newline character.
4) If `x` modulo `2` *does not* evaluate to 0, then print `Odd` instead with a newline character.

{Check It!|assessment}(parsons-puzzle-554878332)
