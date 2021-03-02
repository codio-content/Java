import java.util.Arrays;

public class Exercise5 {
  public static void main(String[] args) {

    //call recursive method below this line
    
    
    
    //call recursive method above this line
  }

  //add method definitions below this line
  
  public static int getMax (int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      int lastIndex = nums.length;
      int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
      return Math.max(nums[0], getMax(tail));
    }
  }
  
  //add method definitions above this line
}