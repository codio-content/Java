import java.util.*;

public class Exercise2 {
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    boolean x = Boolean.parseBoolean(args[0]);
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i < args.length; i++) {
      y.add(Integer.parseInt(args[i]));
    }
    getOddsEvens(x, y);
  }
  
}