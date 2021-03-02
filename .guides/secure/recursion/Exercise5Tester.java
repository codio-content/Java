import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;
import java.util.ArrayList;

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
    String methodHeader = "public static int getMax";
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