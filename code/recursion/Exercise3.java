public class Exercise3 {
  public static void main(String[] args) {

    //add code below this line

    System.out.println(bunnyEars(0));
    
    //add code above this line
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