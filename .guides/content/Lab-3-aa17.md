## Lab 3 - Sierpinski Triangle

![Sierpinski Triangle](.guides/img/sierpinski_triangle.png)

If you start to zoom in on fractals, you will see the same shapes repeat themselves. Fractals are said to be self-similar, which means they can be drawn with recursion. This lab will walk you though drawing a [Sierpinski triangle](https://en.wikipedia.org/wiki/Sierpi%C5%84ski_triangle). Start by creating a turtle object. Sierpinski triangles can become quite complex, so increase the turtle's speed to 10 (the maximum).

```java
    //add code below this line

    Turtle t = new Turtle(0, 0);
    t.speed(10);
    
    //add code above this line
```

The building block of this fractal is the triangle. Create a method (with parameters for length and a turtle) to draw a triangle. The turtle will be walking all over the screen, so it is important to make sure that the turtle is facing a consistent position before drawing the triangle. `t.setDirection(180)` ensures the turtle is facing to the left.

```java
  //add method definitions below this line

  /**
  * @param integer length
  * @param Turtle t
  * @return draws a triangle
  */  
  public static void drawTriangle(int length, Turtle t) {
    t.setDirection(180);
    for (int i = 0; i < 3; i++) {
      t.right(120);
      t.forward(length);
    }
  }
  
  //add method definitions above this line
```

Call the `drawTriangle` method to make sure that it words as expected.

```java
    //add code below this line

    Turtle t = new Turtle(0, 0);
    t.speed(10);
    drawTriangle(50, t);
    
    //add code above this line
```

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Sierpinski.java java Sierpinski 1)

Look closely at a Sierpinski triangle, and you will see clusters of three triangles that make up clusters of triangles and so forth.

![Sierpinski Triangle Evolution](.guides/img/Sierpinski_triangle_evolution.png)

You are now going to create a recursive method that draws this cluster of three triangles. Define the method `sierpinski` that takes `length`, `n`, and `t` as parameters. The base case is if `n` is equal to 1. If so, draw a triangle of size `length`. If `n` is not equal to 1, then you are going to call `sierpinski` again, but with `n-1`. These new triangles need to be in a different position, so move the turtle after drawing each turtle. 

```java
  //add method definitions below this line
  
  /**
  * @param integer length
  * @param integer n
  * @param Turtle t
  * @return draws triangles in the fractal pattern
  */
  public static void sierpinski(int length, int n, Turtle t) {
    if (n == 1) {
      drawTriangle(length, t);
    } else {
      sierpinski(length, n - 1, t);
      t.right(120);
      t.forward(length);
      sierpinski(length, n - 1, t);
      t.left(120);
      t.forward(length);
      sierpinski(length, n - 1, t);
      t.forward(length);
    }
  }

  /**
  * @param integer length
  * @param Turtle t
  * @return draws a triangle
  */  
  public static void drawTriangle(int length, Turtle t) {
    t.setDirection(180);
    for (int i = 0; i < 3; i++) {
      t.right(120);
      t.forward(length);
    }
  }
  
  //add method definitions above this line
```

Finally, replace the `drawTriangle` method call with `sierpinski(50, 1, t)`.

```java
    //add code below this line

    Turtle t = new Turtle(0, 0);
    t.speed(10);
    sierpinski(50, 1, t);
    
    //add code above this line
```

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Sierpinski.java java Sierpinski 2)

|||challenge
## What happens if you:
* Change the method call to `sierpinski(50, 2, t);`?
* Change the method call to `sierpinski(50, 3, t);`?
* Change the method call to `sierpinski(50, 4, t);`?

|||

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Sierpinski.java java Sierpinski 3)

The triangles are clustered together, but the Sierpinski triangle has larger triangle-shaped voids. An adjustment needs to be made to the distance the turtle moves between calls to the `sierpinski` method. Instead of moving forward the distance of `length`, the turtle will move forward `length * (n-1)`. 

```java
  /**
  * @param integer length
  * @param integer n
  * @param Turtle t
  * @return draws triangles in the fractal pattern
  */
  public static void sierpinski(int length, int n, Turtle t) {
    if (n == 1) {
      drawTriangle(length, t);
    } else {
      sierpinski(length, n - 1, t);
      t.right(120);
      t.forward(length * (n - 1));
      sierpinski(length, n - 1, t);
      t.left(120);
      t.forward(length * (n - 1));
      sierpinski(length, n - 1, t);
      t.forward(length * (n - 1));
    }
  }
```

Change the `sierpinski` method call to `sierpinski(20, 4, t);`.

```java
    //add code below this line

    Turtle t = new Turtle(0, 0);
    t.speed(10);
    sierpinski(20, 4, t);
    
    //add code above this line
```

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Sierpinski.java java Sierpinski 4)

The fractal is getting better, but there are a few areas where the program can be improved. Change the distance the turtle goes forward. Instead of multiplying `length` by `n - 1`, multiply `length` by `2` to the power of `n - 2`. Exponents are represented with `Math.pow`.

```java
  /**
  * @param integer length
  * @param integer n
  * @param Turtle t
  * @return draws triangles in the fractal pattern
  */
  public static void sierpinski(int length, int n, Turtle t) {
    if (n == 1) {
      drawTriangle(length, t);
    } else {
      sierpinski(length, n - 1, t);
      t.right(120);
      t.forward(length * Math.pow(2, n - 2));
      sierpinski(length, n - 1, t);
      t.left(120);
      t.forward(length * Math.pow(2, n - 2));
      sierpinski(length, n - 1, t);
      t.forward(length * Math.pow(2, n - 2));
    }
  }
```

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Sierpinski.java java Sierpinski 5)

|||challenge
## What happens if you:
* Change the `sierpinski` method call to `sierpinski(5, 6, t);`?
* Change the `sierpinski` method call to `sierpinski(5, 8, t);`?

|||

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Sierpinski.java java Sierpinski 6)

<details>
  <summary><strong>Solution</strong></summary>
  
  ```java
  import java.lang.Math;

  public class Sierpinski {
    public static void main(String[] args) {

      //add code below this line

      Turtle t = new Turtle(0, 0);
      t.speed(10);
      sierpinski(20, 4, t);

      //add code above this line
    }

    //add method definitions below this line

    /**
    * @param integer length
    * @param integer n
    * @param Turtle t
    * @return draws triangles in the fractal pattern
    */
    public static void sierpinski(int length, int n, Turtle t) {
      if (n == 1) {
        drawTriangle(length, t);
      } else {
        sierpinski(length, n - 1, t);
        t.right(120);
        t.forward(length * Math.pow(2, n - 2));
        sierpinski(length, n - 1, t);
        t.left(120);
        t.forward(length * Math.pow(2, n - 2));
        sierpinski(length, n - 1, t);
        t.forward(length * Math.pow(2, n - 2));
      }
    }

    /**
    * @param integer length
    * @param Turtle t
    * @return draws a triangle
    */  
    public static void drawTriangle(int length, Turtle t) {
      t.setDirection(180);
      for (int i = 0; i < 3; i++) {
        t.right(120);
        t.forward(length);
      }
    }

    //add method definitions above this line
  }
  ```
  
</details>
  
{Check It!|assessment}(multiple-choice-3127395084)
