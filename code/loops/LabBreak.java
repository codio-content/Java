import java.util.Scanner;

public class LabBreak {
  public static void main(String args[]) {
    
    //add code below this line
    
double result = 0;
String input;
Scanner sc = new Scanner(System.in);

while (true) {
  System.out.print("Enter a number to add to sum. ");
  System.out.println("Or enter a non-number to quit and calculate sum.");
  input = sc.nextLine();
  
  if (input instanceof double) {
    result += input;
  }
  else {
    System.out.println("Sum = " + result);
    break;
  }
}
    
    //add code above this line
  }
}