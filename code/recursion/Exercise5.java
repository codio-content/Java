import java.util.Arrays;

public class Exercise5 {
  public static void main(String[] args) {

    //add code below this line
    int[] myList = {11, 22, 3, 41, 15};
    System.out.println(getMax(myList));
    
    //add code above this line
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