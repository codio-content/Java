----------

## Returning a Value
When the result of a method is simply a print statement, it is considered to be a `void` method. `void` methods do not have a return type, meaning they do not return data back to the user. To return data, use the keyword `return` followed by the data. Note that methods with `return` must be declared with same data type as the data that they return. For example, a method that returns an `double` must be declared in the header as a `double` method.


```java
public static double getSlope(double x1, double y1, 
                              double x2, double y2) { //replace void with double
  double yChange = y2 - y1;
  double xChange = x2 - x1;
  return yChange / xChange; //returns a double
}
```

## Modifying the Return Value
Notice that our method returns a single double, which is nice but not extremely helpful when it comes to determining *rise* and *run* for slopes (`rise / run`). Let's say we want instead to express the slope in the `rise / run` format. `rise` is the change in `y` values and `run` is the change in `x` values. Unfortunately, we can't simply do `return yChange + " / " + xChange`. Why? Because the `" / "` is a string which is not compatible with the current `return` value of `double`. One way around this is to convert the doubles into strings. Doing so will force us to change our `double` method into a `String` method.

```java
public static String getSlope(double x1, double y1, 
                              double x2, double y2) { //replace double with string
  double yChange = y2 - y1;
  double xChange = x2 - x1;
  return yChange + " / " + xChange; //returns a string
}
```

Notice how we did not have to do any conversion. This is due to the fact that we have ` + " / " +` with our return statement. When Java encounters concatenation that involves a string, it will automatically convert everything within that statement into a string.

## Completing the Program
Now just copy over the rest of the program that we had previously written.

```java
static double input1;
static double input2;
static double input3;
static double input4;
  
/**
 * This method returns the slope between two sets
 * of coordinate points by calculating their coordinate
 * changes separately
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A String expression of the slope in rise / run format
 */
public static String getSlope(double x1, double y1, 
                              double x2, double y2) {
  double yChange = y2 - y1;
  double xChange = x2 - x1;
  return yChange + " / " + xChange;
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

## Printing the Slope
If we try to run the program, we will not see anything printed to the screen. Why? Because there is no print statement anywhere within the code. All the program does is calculate and return values. Returning values and printing them are **not** the same thing. Therefore, we need to include a print statement if we want to actually see the output. However, we cannot just include a print statement within our method because it is a `String` method, not a `void` one. Fortunately, our `main()` method is `void` so we can just ask the system to print the output after the method is called.

```java
static double input1;
static double input2;
static double input3;
static double input4;
  
/**
 * This method returns the slope between two sets
 * of coordinate points by calculating their coordinate
 * changes separately
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return A String expression of the slope in rise / run format
 */
public static String getSlope(double x1, double y1, 
                              double x2, double y2) {
  double yChange = y2 - y1;
  double xChange = x2 - x1;
  return yChange + " / " + xChange;
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
  
  System.out.println(getSlope(input1, input2, input3, input4));
} //prints what is returned by the getSlope() method
```

{Compile|terminal}(javac code/methods/LabReturn.java)
{Run|terminal}(java -cp code/methods/ LabReturn )

{Check It!|assessment}(multiple-choice-1045027758)
