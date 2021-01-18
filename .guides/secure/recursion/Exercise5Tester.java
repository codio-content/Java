import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise5Tester {
  @Test
  public void testPower1() {
    int[] list1 = {10, 20, 30, 40};
    assertEquals(Exercise5.getMax(list1), 100);
  }
  
  @Test
  public void testPower2() {
    int[] list2 = {-5, 15, -10, 130};
    assertEquals(Exercise5.getMax(list1), 100);
  }
  
  @Test
  public void testPower3() {
    int[] list3 = {40, 80, 160, 320};
    assertEquals(Exercise5.getMax(list1), 100);
  }
  
  @Test
  public void testPower4() {
    int[] list4 = {15, 20, 5, 10};
    assertEquals(Exercise5.getMax(list1), 100);
  }
}