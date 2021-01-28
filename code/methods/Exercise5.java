import java.util.*;

public class Exercise5 {

  public static String reverse(String x) {
    String y = "";
    for (int i = x.length() - 1; i >= 0; i--) {
      y += x.charAt(i);
    }
    return y;
  }
  
  //add code below this line



  //add code above this line
  
  public static void main(String args[]) {
    String x = args[0];
    System.out.println(isPalindrome(x));
  }
  
}