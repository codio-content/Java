public class Exercise4 {
  public static void main(String args[]) {
    
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int d = Integer.parseInt(args[3]);
    int[][] nums = new int[3][3];
    
    //add code below this line



    //add code above this line
    
    for (int row = 0; row < nums.length; row++) {
      for (int col = 0; col < nums[0].length; col++) {
        if (col == 2) {
          System.out.println(nums[row][col]);
        }
        else {
          System.out.print(nums[row][col] + " ");
        }
      }
    }
  }
}