----------
Before continuing with loops, we are going to learn how to create graphical output with the **turtle library**. Like a pencil on paper, the turtle object leaves a line as it moves around the screen.

## Turtle Syntax
The first step is to create a turtle object to move around the screen.

```java

Turtle tina = new Turtle();

```

Here are some basic commands to use with the turtle library.

|Command|Parameter|Description|
|:-----:|:-------:|:---------:|
|`tina.forward(n)`|Where `n` represents the number of pixels|Move the turtle forward|
|`tina.backward(n)`|Where `n` represents the number of pixels|Move the turtle backward|
|`tina.right(d)`|Where `d` represents the number of degrees|Turn the turtle to the right|
|`tina.left(d)`|Where `d` represents the number of degrees|Turn the turtle to the left|

Go ahead and get comfortable creating and moving a turtle around the screen before we start drawing with loops.

|||definition
### Turtle Output
Click the button below to run your code. You may have noticed that there is no `print` command used with turtle objects, so the output of your program does not appear as you would expect. Look for the tab that reads **Preview https/...** and click on it. You should see your turtle drawing there. Close the window with the turtle output to stop your program.

**Accidentally closed the whole tab?** Use the Play triangle on the top tool bar that says "Virtual Desktop".
|||

{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoops.java java TurtleLoops)
