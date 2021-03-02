import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class Exercise5Tester {
  
  Exercise5 studentCode;
  
  @Before
  public void setup() {
    studentCode = new Exercise5();
  }
  
  @Test
  public void check1() {
    int[] testList = {10, 20, 30, 40};
    assertEquals(studentCode.getMax(testList), 40);
  }
  
  @Test
  public void check2() {
    int[] testList = {130, -5, 15, 30};
    assertEquals(studentCode.getMax(testList), 130);
  }
  
  @Test
  public void check3() {
    int[] testList = {40, 320, 80, 160};
    assertEquals(studentCode.getMax(testList), 320);
  }
  
  @Test
  public void check4() {
    int[] testList = {15, 10, 20, 5};
    assertEquals(studentCode.getMax(testList), 20);
  }
  
  @Test 
  public void checkForRecursion() {
    
    String path = "code/recursion/Exercise5.java";
    String methodName = "getMax";
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