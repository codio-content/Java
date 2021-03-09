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