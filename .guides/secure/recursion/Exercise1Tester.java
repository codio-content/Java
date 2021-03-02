import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class Exercise1Tester {
  
  Exercise1 studentCode;
  
  @Before
  public void setup() {
    studentCode = new Exercise1();
  }
  
  @Test
  public void check20() {
    assertEquals(studentCode.recursiveSum(20), 210);
  }
  
  @Test
  public void check100() {
    assertEquals(studentCode.recursiveSum(100), 5050);
  }
  
  @Test
  public void check34() {
    assertEquals(studentCode.recursiveSum(34), 595);
  }
  
  @Test
  public void check0() {
    assertEquals(studentCode.recursiveSum(0), 0);
  }
  
  @Test 
  public void checkForRecursion() {
    
    String path = "code/recursion/Exercise1.java";
    String methodName = "recursiveSum";
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

}