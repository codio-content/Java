import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;
import java.util.ArrayList;

public class Exercise3Tester {
  
  Exercise3 studentCode;
  
  @Before
  public void setup() {
    studentCode = new Exercise3();
  }
  
  @Test
  public void check1() {
    assertEquals(studentCode.bunnyEars(10), 20);
  }
  
  @Test
  public void check2() {
    assertEquals(studentCode.bunnyEars(29), 58);
  }
  
  @Test
  public void check3() {
    assertEquals(studentCode.bunnyEars(14), 28);
  }
  
  @Test
  public void check4() {
    assertEquals(studentCode.bunnyEars(200), 400);
  }
  
  @Test 
  public void checkForRecursion() {
    
    String path = "code/recursion/Exercise3.java";
    String methodName = "bunnyEars";
    String methodHeader = "public static int bunnyEars";
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
    
    String path = "code/recursion/Exercise3.java";
    String bannedWord = "*";
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