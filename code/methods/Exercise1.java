import java.util.*;

public class Exercise1 {
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    try {
      double x = Double.parseDouble(args[0]);
      double y = Double.parseDouble(args[1]);
      System.out.println(getAvg(x, y));
    }
    catch (Exception e) {
      System.out.println("One or more arguments is not a double or an int.");
    }
  }
  
}