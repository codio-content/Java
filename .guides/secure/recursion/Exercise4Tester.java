import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

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

}