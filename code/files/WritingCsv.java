import java.io.*;
import java.util.*;
import com.opencsv.*;
import org.apache.commons.lang3.ObjectUtils;

public class WritingCsv {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/csv/writePractice.csv";
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(path));
      
      List<String[]> greetings = new ArrayList<String[]>(); 
      greetings.add(new String[] {"Greeting", "Language"});
      greetings.add(new String[] {"Hello", "English"});
      greetings.add(new String[] {"Bonjour", "French"});
      greetings.add(new String[] {"Hola", "Spanish"});
      greetings.add(new String[] {"Namaste", "Hindi"});
      
      writer.writeAll(greetings);
      
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a CSV");
    }
    //add code above this line
  }
}