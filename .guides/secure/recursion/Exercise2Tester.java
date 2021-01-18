import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Exercise2Tester {
  @Test
  public void testPower1() {
    int[] list1 = {10, 20, 30, 40};
    assertEquals(Exercise2.listSum(list1), 100);
  }
  
  @Test
  public void testPower2() {
    int[] list2 = {-5, 5, -10, 10};
    assertEquals(Exercise2.listSum(list2), 0);
  }
  
  @Test
  public void testPower3() {
    int[] list3 = {40, 80, 160, 320};
    assertEquals(Exercise2.listSum(list3), 600);
  }
  
  @Test
  public void testPower4() {
    int[] list4 = {5, 10, 15, 20};
    assertEquals(Exercise2.listSum(list4), 50);
  }
}