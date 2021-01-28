----------

## Purpose of Helper Methods
When a method calls another method, it is using that method to help it perform a particular action. **Helper** methods provide users with more flexibility when it comes to developing methods. Additionally, helper methods help reduce code repetition because the same action only has to be written once. Let's start by creating a few helper methods that will help us with other methods later.

```java
/**
 * This method returns the difference in y values
 * 
 * @param y1 A double of the first y-coordinate
 * @param y2 A double of the second y-coordinate
 * @return The difference of y1 and y2 as a double
 */
public static double getRise(double y1, double y2) {
  return y2 - y1;
}

/**
 * This method returns the difference in x values
 * 
 * @param x1 A double of the first x-coordinate
 * @param x2 A double of the second x-coordinate
 * @return The difference of x1 and x2 as a double
 */
public static double getRun(double x1, double x2) {
  return x2 - x1;
} 
```

Above, we have two methods. One that calculates the *rise* of a slope and another that calculates the *run* of a slope. These two helper methods will come in handy in out later slope calculations.

## Using Helper Methods

```java
/**
 * This method returns the slope in decimal form
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A double expression of the slope
 */
public static double getSlopeDecimal(double x1, double y1, 
                                     double x2, double y2) {
    return getRise(y1, y2) / getRun(x1, x2);
}

/**
 * This method returns the slop in fraction form
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A String expression of the slope in rise / run format
 */
public static String getSlopeFraction(double x1, double y1, 
                                      double x2, double y2) {
    return getRise(y1, y2) + " / " + getRun(x1, x2);
}
```

Notice how within the two methods above `getSlopeWhole()` and `getSlopeFraction()`, the previous helper methods `getRise()` and `getRun()` are called. Having 4 methods at our disposal provides us with a flexibility that a single method cannot offer. In this program, we can get the slope in its decimal form and its fraction form in addition to the rise and run individually. If we wanted, we can continue to build more into this program.

## Complete and Run the Program
Copy over the rest of the program and then test it.

```java
static double input1;
static double input2;
static double input3;
static double input4;
  
/**
 * This method returns the difference in y values
 * 
 * @param y1 A double of the first y-coordinate
 * @param y2 A double of the second y-coordinate
 * @return The difference of y1 and y2 as a double
 */
public static double getRise(double y1, double y2) {
  return y2 - y1;
}

/**
 * This method returns the difference in x values
 * 
 * @param x1 A double of the first x-coordinate
 * @param x2 A double of the second x-coordinate
 * @return The difference of x1 and x2 as a double
 */
public static double getRun(double x1, double x2) {
  return x2 - x1;
} 

/**
 * This method returns the slope in decimal form
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A double expression of the slope
 */
public static double getSlopeDecimal(double x1, double y1, 
                                     double x2, double y2) {
    return getRise(y1, y2) / getRun(x1, x2);
}

/**
 * This method returns the slop in fraction form
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A String expression of the slope in rise / run format
 */
public static String getSlopeFraction(double x1, double y1, 
                                      double x2, double y2) {
    return getRise(y1, y2) + " / " + getRun(x1, x2);
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
  
  System.out.print("Rise: ");
  System.out.println(getRise(input2, input4));
  System.out.print("Run: ");
  System.out.println(getRun(input1, input3));
  System.out.print("Calculated form: ");
  System.out.println(getSlopeDecimal(input1, input2, input3, input4));
  System.out.print("Slope form: ");
  System.out.println(getSlopeFraction(input1, input2, input3, input4));
}
```

{Compile|terminal}(javac code/methods/LabHelperMethods.java)
{Run|terminal}(java -cp code/methods/ LabHelperMethods )

{Check It!|assessment}(parsons-puzzle-621579554)
