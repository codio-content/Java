## Lab 2 - The Hilbert Curve

![Hilbert Curve](.guides/img/hilbert_curve.png)

The [Hilbert Curve](https://en.wikipedia.org/wiki/Hilbert_curve) is a fractal, space-filling curve. Start by creating a turtle object, and write the method header for the recursive method `hilbert`. The parameters for the method are the distance the turtle will travel, the rule to be used, an angle (determines how tight the fractal is), depth (how intricate the fractal is), and the turtle object.

```java
public class Hilbert {
  public static void main(String[] args) {
    
    //add code below this line
    
    Turtle t = new Turtle(0, 0);
    
    //add code above this line
  }
  
  //add method definitions below this line

  /**
  * @param integer dist
  * @param integer rule
  * @param integer angle
  * @param integer depth
  * @param Turtle t
  * @return draws a section of the Hilber Curve
  */
  public static void hilbert(int dist, int rule, int angle, int depth, Turtle t) {
    
  }
  
  //add method definitions above this line
}
```

The base case for the method is when `depth` is 0. Another way to think about the base case is that if `depth` is greater than 0, keep drawing the fractal. Use `if (depth > 0)` as the base case. Also, there are two rules for the turtle. Ask if `rule` is equal to 1 or if it is equal to 2.

```java
  //add method definitions below this line

  /**
  * @param integer dist
  * @param integer rule
  * @param integer angle
  * @param integer depth
  * @param Turtle t
  * @return draws a section of the Hilber Curve
  */
  public static void hilbert(int dist, int rule, int angle, int depth, Turtle t) {
    if (depth > 0) {
      if (rule == 1) {
        
      }
      if (rule == 2) {
        
      }
    }
  }
  
  //add method definitions above this line
```

If `rule` is equal to 1, then the turtle is going to turn left, recursively call the `hilbert` method with `rule` set to 2, go forward, turn right, recursively call the `hilbert` method with `rule` set to 1, go forward, recursively call the `hilbert` method with `rule` set to 1, turn right, and finally move forward. Because the base case is based on `depth`, it must be reduced by 1 each time the `hilbert` method is called recursively.

```java
      if (rule == 1) {
        t.left(angle);
        hilbert(dist, 2, angle, depth - 1, t);
        t.forward(dist);
        t.right(angle);
        hilbert(dist, 1, angle, depth - 1, t);
        t.forward(dist);
        hilbert(dist, 1, angle, depth - 1, t);
        t.right(angle);
        t.forward(dist);
        hilbert(dist, 2, angle, depth - 1, t);
        t.left(angle);
      }
```

If `rule` is equal to 2, then the code is almost the inverse of when `rule` is equal to 1. The turtle will still go forward, but left turns become right turns, right turns become left turns, and recursive calls to `hilbert` will use 2 instead of 1 for the `rule` parameter (and vice versa).

```java
      if (rule == 2) {
        t.right(angle);
        hilbert(dist, 1, angle, depth - 1, t);
        t.forward(dist);
        t.left(angle);
        hilbert(dist, 2, angle, depth - 1, t);
        t.forward(dist);
        hilbert(dist, 2, angle, depth - 1, t);
        t.left(angle);
        t.forward(dist);
        hilbert(dist, 1, angle, depth - 1, t);
        t.right(angle);
      }
```

Finally, call the `hilbert` method and run the program to see the fractal.

```java
    //add code below this line
    
    Turtle t = new Turtle(0, 0);
    hilbert(5, 1, 90, 5, t);
    
    //add code above this line
```

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Hilbert.java java Hilbert 1)

<details>
  <summary><strong>Speeding up the turtle</strong></summary>
  The Hilbert Curve can be slow to draw. You can change the speed of the turtle with the following command <code>t.speed(10);</code> before calling the <code>hilbert</code> method.
</details>

|||challenge
## What happens if you:
* Change the `dist` parameter?
* Start with the `rule` parameter as 2?
* Increase or decrease the `angle` parameter?
* Increase or  decrease the `depth` parameter?

|||

{Try it|terminal}(bash .guides/turtleRecursion.sh javac Hilbert.java java Hilbert 2)

<details>
  <summary><strong>Solution</strong></summary>
  
  ```java
  public class Hilbert {
    public static void main(String[] args) {

      //add code below this line

      Turtle t = new Turtle(0, 0);
      t.speed(10);
      hilbert(5, 1, 90, 5, t);

      //add code above this line
    }

    //add method definitions below this line

    /**
    * @param integer dist
    * @param integer rule
    * @param integer angle
    * @param integer depth
    * @param Turtle t
    * @return draws a section of the Hilber Curve
    */
    public static void hilbert(int dist, int rule, int angle, int depth, Turtle t) {
      if (depth > 0) {
        if (rule == 1) {
          t.left(angle);
          hilbert(dist, 2, angle, depth - 1, t);
          t.forward(dist);
          t.right(angle);
          hilbert(dist, 1, angle, depth - 1, t);
          t.forward(dist);
          hilbert(dist, 1, angle, depth - 1, t);
          t.right(angle);
          t.forward(dist);
          hilbert(dist, 2, angle, depth - 1, t);
          t.left(angle);
        }
        if (rule == 2) {
          t.right(angle);
          hilbert(dist, 1, angle, depth - 1, t);
          t.forward(dist);
          t.left(angle);
          hilbert(dist, 2, angle, depth - 1, t);
          t.forward(dist);
          hilbert(dist, 2, angle, depth - 1, t);
          t.left(angle);
          t.forward(dist);
          hilbert(dist, 1, angle, depth - 1, t);
          t.right(angle);
        }
      }
    }

    //add method definitions above this line
  }
  ```
  
</details>

{Check It!|assessment}(parsons-puzzle-2130962492)
