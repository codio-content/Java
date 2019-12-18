import java.util.Random;

public class BreakStatement {
  
  static Random random = new Random();
  
  public static void main(String args[]){
     
    
    
    
    while(true){
        System.out.println("This is an infinite loop");
        int randNum = random.nextInt(100) + 1; // random integer between 1 and 100

        if(randNum > 75){
            System.out.println("The loop has ended");
            break; //stop the loop
        } //end if

     }//end while

    
    
    
  }
  
}