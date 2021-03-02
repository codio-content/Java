public class Exercise3 {
  public static void main(String[] args) {

    //call recursive method below this line
    
    
    
    //call recursive method above this line
  }

  //add method definitions below this line
  
  public static int bunnyEars(int n) {
    if (n == 0) {
      return 0;
    } else {
      return 2 + bunnyEars(n - 1);
    }
  }
  
  //add method definitions above this line
}