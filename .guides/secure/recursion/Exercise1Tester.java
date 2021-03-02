import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;
import java.util.ArrayList;

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
    String methodHeader = "public static int recursiveSum";
    boolean hasRecursion = false;
    ArrayList<String> code = new ArrayList<String>();
    
    // read student file into ArrayList
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String currentLine = reader.readLine();
      while(currentLine != null) {
        code.add(currentLine);
        currentLine = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    }
    
    // find index of recursive method definition
    int index = 0;
    for (int i = 0; i < code.size(); i++) {
      if (code.get(i).contains(methodHeader)) {
        index = i;
      }
    }
    
    // starting at method definion, check for recursive method call
    for (int j = index + 1; j < code.size(); j++) {
      if (code.get(j).contains(methodName)) {
        hasRecursion = true;
      }
    }
    
    assertTrue(hasRecursion);
  }

}