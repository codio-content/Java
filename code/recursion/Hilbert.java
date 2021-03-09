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