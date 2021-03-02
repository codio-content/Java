import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class Exercise2Tester {
  
  Exercise2 studentCode;
  
  @Before
  public void setup() {
    studentCode = new Exercise2();
  }
  
  @Test
  public void check1() {
    int[] testList = {10, 20, 30, 40};
    assertEquals(studentCode.listSum(testList), 100);
  }
  
  @Test
  public void check2() {
    int[] testList = {-5, 5, -10, 10};
    assertEquals(studentCode.listSum(testList), 0);
  }
  
  @Test
  public void check3() {
    int[] testList = {40, 80, 160, 320};
    assertEquals(studentCode.listSum(testList), 600);
  }
  
  @Test
  public void check4() {
    int[] testList = {5, 10, 15, 20};
    assertEquals(studentCode.listSum(testList), 50);
  }
  
  @Test 
  public void checkForRecursion() {
    
    String path = "code/recursion/Exercise2.java";
    String methodName = "listSum";
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