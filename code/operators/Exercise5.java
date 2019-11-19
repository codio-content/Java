import java.util.Scanner;

public class Exercise5 {
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Type the first whole number and press Enter:");
    String firstNum = sc.nextLine();
    System.out.print("Type the second whole number and press Enter:");
    String secondNum = sc.nextLine();
    
    //fix code below this line
    
    String sum = firstNum + secondNum;
    System.out.println( firstNum + " + " + secondNum + " = " + sum);
    
    //fix code above this line

  }
}