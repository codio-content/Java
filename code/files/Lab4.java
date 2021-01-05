import java.io.*;
import java.util.ArrayList;

public class Lab4 {
  public static void main(String args[]) {
    
    //add code below this line
    String readPath = "studentFolder/labs/source.txt";
    String writePath = "studentFolder/text/encrypted.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(readPath));
      BufferedWriter writer = new BufferedWriter(new FileWriter(writePath));
      
      writer.close();
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading and writing to a CSV file");
    }
    
    //add code above this line 
  }
}