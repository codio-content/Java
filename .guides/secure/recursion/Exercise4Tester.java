import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;
import java.util.ArrayList;

public class Exercise4Tester {
  
  Exercise4 studentCode;
  
  @Before
  public void setup() {
    studentCode = new Exercise4();
  }
  
  @Test
  public void check1() {
    assertEquals(studentCode.reverseString("calvin"), "nivlac");
  }
  
  @Test
  public void check2() {
    assertEquals(studentCode.reverseString("hobbes"), "sebboh");
  }
  
  @Test
  public void check3() {
    assertEquals(studentCode.reverseString("jerry"), "yrrej");
  }
  
  @Test
  public void check4() {
    assertEquals(studentCode.reverseString("wormwood"), "doowmrow");
  }
  
  @Test 
  public void checkForRecursion() {
    
    String path = "code/recursion/Exercise4.java";
    String methodName = "reverseString";
    String methodHeader = "public static String reverseString";
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