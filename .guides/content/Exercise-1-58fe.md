---

## Follow the Turtle

Imagine that you have a Turtle object called `tina`. You want `tina` to move around on a screen and leave a trail that draws a triangle like below.

![.guides/img/TurtleExercise1](.guides/img/TurtleExercise1.gif)

<details><summary><i>Turtle Graphics Review</i></summary><ul><li><code>tina.forward(n)</code> - Where <code>n</code> represents the number of pixels.</li><li><code>tina.backward(n)</code> - Where <code>n</code> represents the number of pixels.</li><li><code>tina.right(d)</code> - Where <code>d</code> represents the number of degrees.</li><li><code>tina.left(d)</code> - Where <code>d</code> represents the number of degrees.</li><li><code>tina.penColor("COLOR")</code> - Where <code>COLOR</code> represents the track or line color you want tina to leave behind.</li><li><code>tina.shape("SHAPE")</code> - Where <code>SHAPE</code> represents the shape tina takes.</li><li><code>tina.speed(s)</code> - Where <code>s</code> represents how many milliseconds tina takes to perform an action.</li></ul></details>

{Try it|terminal}(bash .guides/turtle.sh javac Exercise1.java java Exercise1)

Using a `for` loop, direct `tina` to follow the **exact** same path as above. Your code **must** include the following in order for you to receive credit for your work.

### Requirements:
* `tina` must move exactly as shown in the graphic above.
* You must include a `for` loop.
* You must declare an iterating variable `i` and initialize it to **zero** (e.g. `int i = 0`).
* Your loop **header** must include `i++`. In other words, `i` gets incremented by `1` after each iteration.
* Each edge or line of the triangle that `tina` creates must be exactly **100 pixels**.
* Each angle of the triangle must be exactly **60 degrees** .

**Hint:** The angle turned by `tina` and the angle of the triangle are supplementary to each other. **Supplementary** angles add up to **180 degrees**.

{Check It!|assessment}(test-4111672069)
