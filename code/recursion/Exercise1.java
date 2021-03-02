public class Exercise1 {
  public static void main(String[] args) {

    //DO NOT alter code below this line
    
    //DO NOT alter code above this line
  }

  //add method definitions below this line
  
  public static int recursiveSum(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n + recursiveSum(n - 1);
    }
  }
  
  //add method definitions above this line
}