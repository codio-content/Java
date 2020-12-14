import java.io.*;

public class MoreWriting {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice2.txt";
    try(FileWriter writer = new FileWriter(path)) {
      String text = "Once upon a time\nIn a land far, far away\nLived a king and queen";
      writer.write(text);
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a file.");
    }
    //add code above this line 
  }
}