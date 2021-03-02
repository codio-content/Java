import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;
import java.util.ArrayList;

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
    String methodHeader = "public static int listSum";
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