import java.util.Arrays;

public class Exercise2 {
  public static void main(String[] args) {

    //add code below this line
    int[] myList = {10, 12, 10, 7};
    System.out.println(listSum(myList));
    
    //add code above this line
  }

  //add method definitions below this line
  
  public static int listSum(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      int lastIndex = nums.length;
      int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
      return nums[0] + listSum(tail);
    }
  }
  
  //add method definitions above this line
}