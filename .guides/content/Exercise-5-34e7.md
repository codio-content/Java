---

## Find the Average
You are working to create a program that continuously takes in integer inputs and adds them to an ArrayList called `numList`. If an input is not an integer type, then the program will iterate through `numList`, add each integer value to the `total`, and calculate the average (`avg`). Finally, the average is printed with a newline. Here is what you have so far:
```java
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise5 {
  public static void main(String args[]) {
    
    int input;
    int total = 0;
    double avg = 0;
    ArrayList<Integer> numList = new ArrayList<Integer>();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter integer to add to total, else find total average:");
    while (sc.hasNextInt()) {
      System.out.println("Enter integer to add to total, else find total average:");
      input = sc.nextInt();
      
      // add input into ArrayList
      
      
      
      // your code goes above
    }
    // iterate through ArrayList, add elements to total, then calculate average
    
    
    
    // your code goes above
    }
    System.out.println(avg);
  }
}
```

Follow the comments within the code to complete the program. When running your code, you should be able to continuously enter integers into the Terminal. If you enter a non-integer, the program should stop and print the average. If no integers are entered, then the program will print `0.0`.

### Click to compile and run your code
{Compile and run | terminal}(javac code/arrays/Exercise5.java && java -cp code/arrays/ Exercise5 )

### Sample Outputs:

**Sample 1**
`Enter integer to add to total, else find total average:`
`1`
`Enter integer to add to total, else find total average:`
`2`
`Enter integer to add to total, else find total average:`
`3`
`Enter integer to add to total, else find total average:`
`x`
`2.0`

**Sample 2**
`Enter integer to add to total, else find total average:`
`I am entering a non-integer`
`0.0`

**Sample 3**
`Enter integer to add to total, else find total average:`
`-14`
`Enter integer to add to total, else find total average:`
`14`
`Enter integer to add to total, else find total average:`
`-14`
`Enter integer to add to total, else find total average:`
`-14`
`Enter integer to add to total, else find total average:`
`14.0`
`-7.0`

{Check It!|assessment}(code-output-compare-1353242294)
