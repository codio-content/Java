import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class Exercise3Tester {
  
  Exercise3 studentCode;
  
  @Before
  public void setup() {
    studentCode = new Exercise3();
  }
  
  @Test
  public void check1() {
    assertEquals(studentCode.bunnyEars(10), 20);
  }
  
  @Test
  public void check2() {
    assertEquals(studentCode.bunnyEars(29), 58);
  }
  
  @Test
  public void check3() {
    assertEquals(studentCode.bunnyEars(14), 28);
  }
  
  @Test
  public void check4() {
    assertEquals(studentCode.bunnyEars(200), 400);
  }
  
  @Test 
  public void checkForRecursion() {
    
    String path = "code/recursion/Exercise3.java";
    String methodName = "bunnyEars";
    int methodCount = 0;
    String code = "";
    
    // read student file into the variable code
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String currentLine = reader.readLine();
      while(currentLine != null) {
        code += currentLine;
        currentLine = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    }
    
    // turn code into array of tokens; iterate over them
    String[] tokens = code.split(" ");
    for (String token : tokens) {
      if (token.contains(methodName)) {
        methodCount++;
      }
    }
    
    assertTrue(methodCount > 1);
  }
  
  @Test
  public void checkForBanned() {
    
    String path = "code/recursion/Exercise3.java";
    String bannedWord = "*";
    int bannedCount = 0;
    String studentCode = "";
    
    // read student file into the variable code
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String currentLine = reader.readLine();
      while(currentLine != null) {
        studentCode += currentLine;
        currentLine = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    }
    
    // turn code into array of tokens; iterate over them
    String[] tokens = studentCode.split(" ");
    for (String token : tokens) {
      if (token.contains(bannedWord)) {
        bannedCount++;
      }
    }
    
    assertTrue(bannedCount == 0);
  }

}