----------
Instead of a for loop, recreate the images below using while loops. Remember, click on the tab that reads **Preview https/...** to see your output. Close the window with the turtle output to stop your program.

<details><summary>*Turtle Graphics Refresher*</summary><ul><li>`t.forward(10)` - Takes a number for the distance traveled</li><li>`t.backward(10)` - Takes a number for the distance traveled</li><li>`t.right(45)` - Takes a number for degrees turned</li><li>`t.left(45)` - Takes a number for degrees turned</li><li>`t.penColor("red")` - Takes a string for the [color](https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html)</li><li>`t.shape('turtle')` - Takes one of the following strings `"turtle"`, `"circle"`, `"square"`, `"arrow"`, or `"triangle"`.</li><li>`t.speed(1)` - how many milliseconds it takes to do one action</li></ul></details>

### Challenge 1
![Turtle Challenge 1](.guides/images/turtle-challenge-1.png)
{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoopImages.java java TurtleLoopImages)

<details><summary>**Hint**</summary>The trick is to find the pattern and then repeat it four times. The pattern is to go forward and then make a smaller square (with right turns) at the end. The pattern should look something like this: <img src=".guides/images/turtle-graphics-pattern-1.png"/></details>

### Challenge 2
![Turtle Challenge 2](.guides/images/turtle-challenge-2.png)
{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoopImages.java java TurtleLoopImages)

<details><summary>**Hint**</summary>Since a circle has 360 degrees, you will need a loop that repeats 360 times. Be careful about how far the turtle walks. The circle can get very big, very quickly.</details>

### Challenge 3
![Turtle Challenge 3](.guides/images/turtle-challenge-3.png)
{Try it|terminal}(bash .guides/turtle.sh javac TurtleLoopImages.java java TurtleLoopImages)

<details><summary>**Hint**</summary>The pattern here is to move forward and make a right turn. The trick is, the amount to move forward needs to get bigger as the loop advances. Think of some operators that you can use to make the loop variable get a little bit bigger each iteration.</details>