import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;
import java.util.ArrayList;

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
    String methodHeader = "public static int recursivePower";
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
  
  @Test
  public void checkForBanned() {
    
    String path = "code/recursion/LabChallenge.java";
    String bannedWord = "Math.pow";
    int bannedCount = 0;
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
      if (token.contains(bannedWord)) {
        bannedCount++;
      }
    }
    
    assertTrue(bannedCount == 0);
  }

}