import java.io.*;
import java.util.ArrayList;

public class Lab1 {
  public static void main(String args[]) {
    
    //add code below this line
    
        //add code below this line
    String path = "studentFolder/labs/filesLab1.txt";
    ArrayList<String> text = new ArrayList<String>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while (reader.ready()) {
        text.add(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.\n");
    }
    
    System.out.println(text.get(0) + "\n");
    //add code above this line 
    
    //add code above this line 
  }
}