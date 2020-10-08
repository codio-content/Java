---

Instead of a `for` loop, recreate the images below using a `while` loop.

<details><summary><i>Turtle Graphics Review</i></summary><ul><li><code>tina.forward(n)</code> - Where <code>n</code> represents the number of pixels.</li><li><code>tina.backward(n)</code> - Where <code>n</code> represents the number of pixels.</li><li><code>tina.right(d)</code> - Where <code>d</code> represents the number of degrees.</li><li><code>tina.left(d)</code> - Where <code>d</code> represents the number of degrees.</li><li><code>tina.penColor("COLOR")</code> - Where <code>COLOR</code> represents the track or line color you want tina to leave behind.</li><li><code>tina.shape("SHAPE")</code> - Where <code>SHAPE</code> represents the shape tina takes.</li><li><code>tina.speed(s)</code> - Where <code>s</code> represents how many milliseconds tina takes to perform an action.</li></ul></details>

### Challenge 1
![.guides/img/TurtleChallenge1](.guides/img/TurtleChallenge1.gif)
{Try it|terminal}(bash .guides/turtle.sh javac WhileLoopImages.java java WhileLoopImages)

<details><summary><b>Hint</b></summary>The pattern is still the same: <ol><li>Go forward (creating a long line).</li><li>Make a right turn.</li><li>Go forward (creating a small line).</li><li>Make a right turn.</li><li>Go forward (creating another small line).</li><li>Make a right turn.</li><li>Go forward (creating a final small line).</li><li>Repeat steps #1 through #7 three more times for a total of <b>four</b> iterations.</li></ol>However, a <code>while</code> loop usually contains only a boolean expression(s) in its header. Thus, you must initialize a <b>counting variable</b> <i>before</i> the start of the <code>while</code> loop. Also, that counting variable should be <b>incremented</b> <i>inside</i> the body of the loop. The pattern you are trying to iterate is still the same: <img src=".guides/img/TurtleChallenge1Pattern.png"/></details>

### Challenge 2
![.guides/img/TurtleChallenge2](.guides/img/TurtleChallenge2.gif)
{Try it|terminal}(bash .guides/turtle.sh javac WhileLoopImages.java java WhileLoopImages)

<details><summary><b>Hint</b></summary>Since a circle has 360 degrees, you will need a loop that repeats 360 times. Be careful about how far the turtle moves forward and turns. The circle can get very big, very quickly.</details>

### Challenge 3
![.guides/img/TurtleChallenge3](.guides/img/TurtleChallenge3.gif)
{Try it|terminal}(bash .guides/turtle.sh javac WhileLoopImages.java java WhileLoopImages)

<details><summary><b>Hint</b></summary>The pattern here is to move forward and make a right turn. <img src=".guides/img/TurtleChallenge3Pattern.png"/> 
The trick lies within the fact that the distance the turtle moves has to get larger as the loop advances. Think of some operators that you can use to make the loop iterator variable get bigger during each iteration.</details>

<table><tbody ><tr><td><details><summary>
	<b>Sample Solutions</b>
</summary><br>
Here are some sample solutions using <code>while</code> loops:
  
```c++
  tina.penColor("blue");
  tina.shape("arrow");
  tina.speed(200);
  
  int i = 0;
  while (i < 4) {
    tina.forward(75);
    tina.right(90);
    tina.forward(25);
    tina.right(90);
    tina.forward(25);
    tina.right(90);
    tina.forward(25);
    i++;
  }
```

```c++
  tina.penColor("red");
  tina.shape("square");
  tina.speed(10);
  
  int i = 0;
  while (i < 360) {
    tina.forward(1);
    tina.right(1);
    i++;
  }
```
  
```c++
  tina.penColor("green");
  tina.shape("triangle");
  tina.speed(100);
  
  int i = 10;
  while (i <= 200) {
    tina.forward(i);
    tina.right(90);
    i+=10;
  }
```

</details></td></tr></tbody>
</table>

|||info
### NOTE
In **most** cases, `for` loops and `while` loops can be used interchangeably. It is up to you to decide which one is better suited for your task.

|||

{Check It!|assessment}(parsons-puzzle-6741937)
