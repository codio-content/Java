import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class LabChallengeTester {
  
  LabChallenge studentCode;
  
  @Before
  public void setup() {
    studentCode = new LabChallenge();
  }
  
  @Test
  public void check2And3() {
    assertEquals(studentCode.recursivePower(2, 3), 8);
  }
  
  @Test
  public void check7And4() {
    assertEquals(studentCode.recursivePower(7, 4), 2401);
  }
  
  @Test
  public void check3And7() {
    assertEquals(studentCode.recursivePower(3, 7), 2187);
  }
  
  @Test
  public void check5And0() {
    assertEquals(studentCode.recursivePower(5, 0), 1);
  }
  
  @Test 
  public void checkForRecursion() {
    
    String path = "code/recursion/LabChallenge.java";
    String methodName = "recursivePower";
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
    
    String path = "code/recursion/LabChallenge.java";
    String bannedWord = "Math.pow";
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