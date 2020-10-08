----------

## For Loop Syntax
Before you can start writing a loop, you need to be able to spot the pattern. Let's take something simple:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

The pattern is `System.out.println("Hello");`, and it is repeated five times. Since we know that the loops needs to run exactly five times, a for loop is the way to go. Here is how you write a for loop that repeats five times. Use the code [visualizer](open_tutor code/loops/ForLoops.java) to see how a for loop works.

```java
for(int i=0; i < 5; i++) {
    System.out.println("Hello");
}
```

[Code Visualizer](open_tutor code/loops/ForLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/ForLoops.java java -cp code/loops/ ForLoops )
Like **conditionals**, for loops are code blocks. In addition to a **boolean** statement, you declare, intialize and increment a **variable** called the loop *iterator*. All of the code that will be repeated needs to be between curly braces `{}`.

## Understanding the loop header
Enter the code below and run it.

```java
for(int i = 0; i < 5; i++) {
    System.out.println("Loop #" + i);
}
```

[Code Visualizer](open_tutor code/loops/ForLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/ForLoops.java java -cp code/loops/ ForLoops 2)

The loop ran five times, but the variable `i` did not start with 1. Instead it started with 0. Java, like most programming languages, starts counting with 0. Java will continue counting up to, but not including 5.

|||challenge
## What happens if you:
* Change the print statement to `System.out.println("Loop #" + i + 1);`?
* Change the loop header to `i < 6` and the print statement to `System.out.println("Loop #" + i);`?
* Change the loop header to `i <= 5`?
* Change the loop header to `i--`?

|||

[Code Visualizer](open_tutor code/loops/ForLoops.java)
{Try it}(sh .guides/bg.sh javac code/loops/ForLoops.java java -cp code/loops/ ForLoops 3)

<details><summary><b>Infinite Loops</b></summary>If you aren't careful, you can wind up with an <b>infinite loop</b>. This means that you have a never ending loop. In the example above, if you change <code>i++</code> to <code>i--</code> then <code>i</code> will decrease, never reaching the value needed to make the boolean expression false.</details>

{Check It!|assessment}(multiple-choice-3084493133)
