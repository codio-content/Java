public class Exercise3 {
  public static void main(String[] args) {

    //DO NOT alter code below this line
    System.out.println(bunnyEars(Integer.parseInt(args[0])));
    //DO NOT alter code above this line
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