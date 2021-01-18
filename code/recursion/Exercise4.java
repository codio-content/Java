public class Exercise4 {
  public static void main(String[] args) {

    //add code below this line

    System.out.println(reverseString("house"));
    
    //add code above this line
  }

  //add method definitions below this line
  
  public static String reverseString(String s) {
    if (s.length() == 1) {
      return s.substring(0, 1);
    } else {
      return s.substring(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
  }
  
  //add method definitions above this line
}