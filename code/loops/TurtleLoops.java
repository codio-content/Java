public class TurtleLoops
{
    public static void main(String[] args) 
    {

Turtle tina = new Turtle();
tina.speed(10);
for (int i = 0; i < 360; i++) {
  tina.forward(5);
  tina.right(1);
}
    }
}