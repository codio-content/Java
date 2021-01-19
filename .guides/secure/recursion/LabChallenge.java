public class LabChallenge {
  public static void main(String[] args) {

    //DO NOT alter code below this line
    System.out.println(recursivePower(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    //DO NOT alter code above this line
  }

  //add method definitions below this line
  
    public static int recursivePower(int base, int exponent) {
    if (exponent == 0) {
      return 1;
    } else {
      return base * recursivePower(base, exponent - 1);
    }
  
  //add method definitions above this line
}