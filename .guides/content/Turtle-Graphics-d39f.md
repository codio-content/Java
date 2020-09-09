----------
Before continuing with loops, we are going to learn how to create graphical output with the **Turtle Graphics** library. Like a pencil on paper, the Turtle object leaves a line as it moves around the screen.

## Turtle Syntax
The first step is to create a Turtle object to move around the screen.

```java

Turtle tina = new Turtle(); //creates a Turtle object called tina

```

Here are some basic commands to use with `tina` the Turtle object.

|Command|Parameter|Description|
|:-----:|:-------:|:---------:|
|`tina.forward(n)`|Where `n` represents the number of pixels|Move the turtle forward|
|`tina.backward(n)`|Where `n` represents the number of pixels|Move the turtle backward|
|`tina.right(d)`|Where `d` represents the number of degrees|Turn the turtle to the right|
|`tina.left(d)`|Where `d` represents the number of degrees|Turn the turtle to the left|

## Turtle Commands
Let's try this very simple command below. Copy it into the text editor on your left and then click the `TRY IT` button to see the graphical output.

```java
Turtle tina = new Turtle(0, 100); //change parameters to make tina visible
tina.forward(100);
```

{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoops.java java TurtleLoops)

### What does the `(0, 100)` inside `Turtle()` do?
The `(0, 100)` inside `Turtle()` enables you to set the latitude and longitude of `tina`. In the example, `tina` starts at `0` pixel latitude and `100` pixels longitude. Feel free to change these parameters so that `tina` the Turtle can be seen on your screen.

## Turtle Output
Below is an image highlighting what happens after the `TRY IT` button is clicked.

![.guides/img/JavaTurtleOutput](.guides/img/JavaTurtleOutput.png)

1. `TRY IT` button is clicked by the user.
2. The `Terminal` tab is opened.
3. The terminal runs the command to compile the program and to display the graphical output.
4. The output is displayed as a canvas on the bottom left panel.
5. Click on the `TurtleLoops.java` tab to go back to the text editor if you want to make changes to the program.
6. Click on the `x` icon to close the canvas and exit the program. Alternatively, you can also press the `Ctrl` and `z` keys (Windows) or the `control` and `z` keys (Mac).

{Check It!|assessment}(multiple-choice-3787725782)
