import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise1Tester {
  @Test
  public void testPower1() {
    assertEquals(Exercise1.recursiveSum(20), 210);
  }
  
  @Test
  public void testPower2() {
    assertEquals(Exercise1.recursiveSum(100), 5050);
  }
  
  @Test
  public void testPower3() {
    assertEquals(Exercise1.recursiveSum(34), 595);
  }
  
  @Test
  public void testPower4() {
    assertEquals(Exercise1.recursiveSum(0), 0);
  }
}