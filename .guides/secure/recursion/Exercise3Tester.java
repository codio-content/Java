import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise3Tester {
  @Test
  public void testPower1() {
    assertEquals(Exercise3.bunnyEars(10), 20);
  }
  
  @Test
  public void testPower2() {
    assertEquals(Exercise3.bunnyEars(29), 58);
  }
  
  @Test
  public void testPower3() {
    assertEquals(Exercise3.bunnyEars(14), 28);
  }
  
  @Test
  public void testPower4() {
    assertEquals(Exercise3.bunnyEars(200), 400);
  }
}