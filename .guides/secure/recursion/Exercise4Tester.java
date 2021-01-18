import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise4Tester {
  @Test
  public void testPower1() {
    assertEquals(Exercise4.reverseString("calvin"), "nivlac");
  }
  
  @Test
  public void testPower2() {
    assertEquals(Exercise4.reverseString("hobbes"), "sebboh");
  }
  
  @Test
  public void testPower3() {
    assertEquals(Exercise4.reverseString("grateful dead"), "daed lufetarg");
  }
  
  @Test
  public void testPower4() {
    assertEquals(Exercise4.reverseString("steal your face"), "ecaf ruoy laets");
  }
}