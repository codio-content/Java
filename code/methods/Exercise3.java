import java.util.*;

public class Exercise3 {
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    String x = args[0];
    ArrayList<String> y = new ArrayList<String>();
    for (int i = 1; i < args.length; i++) {
      y.add(args[i]);
    }
    System.out.println(findTerm(x, y));
  }
  
}