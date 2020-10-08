## Tutorial Lab 3: Fundamentals Challenge

In the code to the left, we see that there are a series of declared and initialized variables. Use these variables to print out a custom message to customers who open a chat client.

Your output should look something like this:
```
Hello! Today is Wednesday, May 4.
The current wait time is 4 minutes.
```

<details><summary><b>Hint from upcoming section</b></summary>In the <code>operators</code> unit you will learn about String concatenation. For now, all you need to know is you can connect or merge Strings using the <code>+</code>. For example, <code>System.out.println("Hello, " + name + "!");</code> where name is a variable.</details><br>

The pattern is as follows. The `*` indicates variables:
```java
*greeting* Today is *dayOfWeek*, *month* *day*.
The current wait time is *currentWaitMinutes* minutes.
```

To test the code, first compile and then check the output of a few different test cases:

{Compile}(javac code/fundamentals/Lab_Challenge.java)
{Test1}(java -cp code/fundamentals/ Lab_Challenge Hello! Monday July 4 9)
{Test2}(java -cp code/fundamentals/ Lab_Challenge Howdy! Tuesday December 15 2)
{Test3}(java -cp code/fundamentals/ Lab_Challenge Greetings! Friday March 13 39)

{Check It!|assessment}(code-output-compare-2085987884)
