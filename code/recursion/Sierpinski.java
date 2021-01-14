public class Sierpinski {
  public static void main(String[] args) {

    //add code below this line

    Turtle t = new Turtle(0, 0);
    t.speed(10);
    drawTriangle(50, t);
    
    //add code above this line
  }

  //add method definitions below this line

  /**
  * @param integer length
  * @param Turtle t
  * @return draws a triangle
  */  
  public static void drawTriangle(int length, Turtle t) {
    t.setheading(180);
    for (int i = 0; i < 3; i++) {
      t.right(120);
      t.forward(length);
    }
  }
  
  //add method definitions above this line
}