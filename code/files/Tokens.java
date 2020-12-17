import java.io.*;
import java.util.*;

public class Tokens {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line = reader.readLine();
      StringTokenizer tokens = new StringTokenizer(line, " ");
      while (tokens.hasMoreTokens()) {
        System.out.println(tokens.nextToken());
      }
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
  }
}