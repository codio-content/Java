import java.io.*;
import com.opencsv.*;
import org.apache.commons.lang3.ObjectUtils;

public class CsvFiles {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/csv/homeRuns.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      //reader.skip(1);
      for (String[] row : reader) {
        for (String item : row) {
          System.out.print(item + " ");
        }
        System.out.println();
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
  }
}