import java.util.Arrays;

public class Exercise5 {
  public static void main(String[] args) {

    //DO NOT alter code below this line
    int[] nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      nums[i] = Integer.parseInt(args[i]);
    }
    System.out.println(getMax(nums));
    //DO NOT alter code above this line
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