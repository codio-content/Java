----------

## Local and Global Variables
For this lab, we are going to be adding local and global variables to our previously created `findSlope()` method. Remember that **global** variables exist *outside* of methods while **local** variables exist *inside* methods. Depending on how you declare your local and global variables, they will behave differently per situation.

## Global Variables
First, let's add some global variables to our program.

```java
double input1;
double input2;
double input3;
double input4;
```

## The findSlope() Method
As from before, the method will still take 4 **doubles** as parameters named `x1`, `y1`, `x2`, and `y2`. However, we're going to implement two different calculations within the method. Specifically, we are going to calculate the difference between the **y** coordinates first, then calculate the difference between the **x** coordinates. These calculations will then be assigned to **local** variables called `yChange` and `xChange`. Finally, the method will print the quotient between `yChange` and `xChange`, which is also the slope itself.

```java
public static void getSlope(double x1, double y1, double x2, double y2) {
  double yChange = y2 - y1;
  double xChange = x2 - x1;
  System.out.println(yChange / xChange);
}
```

## Testing the Method
To make things more dynamic, we'll actually make use of a `scanner` within the `main()` method. The `scanner` will take in inputs from the user and assign them to our 4 global variables `input1`, `input2`, `input3`, and `input4`. These inputs will later correspond to `x1`, `y1`, `x2`, and `y2`. Having the scanner enables the user to decide what the coordinate points will be.

```java
public static void main(String args[]) {
  Scanner input = new Scanner (System.in);
  System.out.println("Enter first x coordinate: ");
  input1 = input.nextDouble();
  System.out.println("Enter first y coordinate: ");
  input2 = input.nextDouble();
  System.out.println("Enter second x coordinate: ");
  input3 = input.nextDouble();
  System.out.println("Enter second y coordinate: ");
  input4 = input.nextDouble();
  input.close();
  
  getSlope(input1, input2, input3, input4);
}
```

Before we can test the code, however, we need to include one important keyword or the code will not compile. That important keyword is `static`. Recall that the variables `input1`, `input2`, `input3`, and `input4` were declared previously as global variables. Now we are trying to manipulate those variables within `main()`. We cannot do this however because static methods cannot access non-static variables. Therefore, we must include `static` before all of the variables we had declared globally. 

```java
static double input1;
static double input2;
static double input3;
static double input4;
```

**Side note:** In Java, *static* local variables do not exist.

You'll notice that you have access to the Terminal which you will use to input any coordinate points you want. If you enter `3`, `2`, `5`, and `6` respectively, you should still get `2.0`. Click the `COMPILE` button first to compile the program, and then click `RUN` to run the program and enter inputs.

{Compile|terminal}(javac code/methods/LabScope.java)
{Run|terminal}(java -cp code/methods/ LabScope )

<details>
  <summary><strong>Code</strong></summary>
  
  ```java
  static double input1; //global
  static double input2; //global
  static double input3; //global
  static double input4; //global
  
  /**
   * This method prints the slope between two sets
   * of coordinate points by calculating their coordinate
   * changes separately
   * 
   * @param x1 A double of the first x-coordinate
   * @param y1 A double of the first y-coordinate
   * @param x2 A double of the second x-coordinate
   * @param y2 A double of the second y-coordinate
   * @return No return value
   */
  public static void getSlope(double x1, double y1, double x2, double y2) {
    double yChange = y2 - y1; //local
    double xChange = x2 - x1; //local
    System.out.println(yChange / xChange);
  }
  
  public static void main(String args[]) {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter first x coordinate: ");
    input1 = input.nextDouble();
    System.out.println("Enter first y coordinate: ");
    input2 = input.nextDouble();
    System.out.println("Enter second x coordinate: ");
    input3 = input.nextDouble();
    System.out.println("Enter second y coordinate: ");
    input4 = input.nextDouble();
    input.close();
  
    getSlope(input1, input2, input3, input4);
  }
  ```
  
</details>

|||info
## Program Flow
After the program is initiated, the global variables will be created first. Next, `main()` will run. Although commonly written last, `main()` will always be the first method to run by default in Java. The lines of code within `main()` will be executed in the order of their appearance.

|||

{Check It!|assessment}(fill-in-the-blanks-303524134)
