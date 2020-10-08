----------

## Floating Point numbers
Floating point numbers (often called floats) are numbers with a decimal. They can be positive or negative.

```java
double fraction = 0.5;
System.out.print(fraction);
```

<details><summary><b>Why is float called double?</b></summary>In Java, there is a data type called <b>float</b> but as it only uses 4 bytes it is insufficient for most math. Instead, we use <b>double</b> which uses 8 bytes or double the space of a float.</details>

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundVariables3.java java -cp code/fundamentals/ PlaygroundVariables3 1 )
  
|||challenge
## What happens if you:
* Change the variable to `50.`?
* Change the variable to `.001`?

|||

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundVariables3.java java -cp code/fundamentals/ PlaygroundVariables3 2 )

{Check It!|assessment}(fill-in-the-blanks-3784696113)

