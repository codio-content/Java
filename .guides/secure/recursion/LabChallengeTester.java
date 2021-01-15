import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LabChallengeTester {
  @Test
  public void testPower1() {
    assertEquals(LabChallenge.recursivePower(2, 3), 8);
  }
  
  @Test
  public void testPower2() {
    assertEquals(LabChallenge.recursivePower(7, 4), 2401);
  }
  
  @Test
  public void testPower3() {
    assertEquals(LabChallenge.recursivePower(3, 7), 2187);
  }
  
  @Test
  public void testPower4() {
    assertEquals(LabChallenge.recursivePower(5, 0), 1);
  }
}