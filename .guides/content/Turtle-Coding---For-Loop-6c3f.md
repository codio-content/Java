---

## Customize Your Turtle
The following table provides additional commands you can use to customize `tina` the Turtle.

|Command|Parameter|Examples|
|:-----:|:-------:|:---------:|
|`tina.penColor("COLOR")`|Where `COLOR` represents the track or line color you want tina to leave behind|red, orange, yellow, green, blue, purple|
|`tina.shape("SHAPE")`|Where `SHAPE` represents the shape tina takes|turtle, circle, square, arrow, triangle|
|`tina.speed(s)`|Where `s` represents how many milliseconds it takes tina to perform an action|1 (fastest) through positive infinity (the larger the number, the slower tina moves)|

## Turtle Challenges
Now that you know how to customize `tina`, try to recreate the images you see below using your knowledge of `for` loops.

### Challenge 1
![.guides/img/TurtleChallenge1](.guides/img/TurtleChallenge1.gif)
{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoopImages.java java TurtleLoopImages)

<details><summary>**Hint**</summary>There are multiple ways to accomplish this task but the trick lies within finding the **pattern** and then repeating it a **specific number of times**. One pattern in particular is to: <ol><li>Go forward (creating a long line).</li><li>Make a right turn.</li><li>Go forward (creating a small line).</li><li>Make a right turn.</li><li>Go forward (creating another small line).</li><li>Make a right turn.</li><li>Go forward (creating a final small line).</li><li>Repeat steps #1 through #7 three more times for a total of **four** iterations.</li></ol>The pattern should look something like this: <img src=".guides/img/TurtleChallenge1Pattern.png"/></details>

### Challenge 2
![.guides/img/TurtleChallenge2](.guides/img/TurtleChallenge2.gif)
{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoopImages.java java TurtleLoopImages)

<details><summary>**Hint**</summary>Since a circle has 360 degrees, you will need a loop that repeats 360 times. Be careful about how far the turtle moves forward and turns. The circle can get very big, very quickly.</details>

### Challenge 3
![.guides/img/TurtleChallenge3](.guides/img/TurtleChallenge3.gif)
{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoopImages.java java TurtleLoopImages)

<details><summary>**Hint**</summary>The pattern here is to move forward and make a right turn. <img src=".guides/img/TurtleChallenge3Pattern.png"/> 
The trick lies within the fact that the distance the turtle moves has to get larger as the loop advances. Think of some operators that you can use to make the loop iterator variable get bigger during each iteration.</details>

<table><tbody ><tr><td><details><summary>
	<b>Still having trouble with creating the outputs above?</b>
</summary><br>
Here are some sample solutions:
  
```java
  tina.penColor("blue");
  tina.shape("arrow");
  tina.speed(200);
  
  for (int i = 0; i < 4; i++) {
    tina.forward(75);
    tina.right(90);
    tina.forward(25);
    tina.right(90);
    tina.forward(25);
    tina.right(90);
    tina.forward(25);
  }
```

```java
  tina.penColor("red");
  tina.shape("square");
  tina.speed(10);
  
  for (int i = 0; i < 360; i++) {
    tina.forward(1);
    tina.right(1);
  }
```
  
```java
  tina.penColor("green");
  tina.shape("triangle");
  tina.speed(100);
  
  for (int i = 10; i <= 200; i+=10) {
    tina.forward(i);
    tina.right(90);
  }
```

</details></td></tr></tbody>
</table>

{Check It!|assessment}(fill-in-the-blanks-1183891837)
