import java.io.*;

public class Multiline {
  public static void main(String args[]) {
    
    //add code below this line
    
        //add code below this line
    String path = "studentFolder/text/practice2.txt";
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(path));
      String text1 = "Hello there";
      String text2 = "my friend";
      writer.write(text1);
      writer.write(text2);
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a file.");
    }
    //add code above this line 
    
    //add code above this line 
  }
}