----------

## Helper Methods

Helper methods are methods that are called from within other methods. Take, for example, the formula for calculating the area of a circle:
$$A = \pi r^2$$

It would be quite easy to write a Java method to calculate the area of a circle. However, instead of knowing the radius of the circle, you have the X/Y coordinates for a point at the center of the circle and another point on the circle. The distance formula (which is based on the Pythagorean Theorem) can calculate the radius of the circle.
$$\sqrt{(x2 - x1)^2 + (y2 - y1)^2}$$

![.guides/img/Radius](.guides/img/Radius.png)

The `findRadius()` method uses the distance formula to calculate the distance between 2 pairs of points. The `findArea()` method finds the area of a circle by relying on the `findRadius()` method. Therefore, the `findRadius()` method is a helper method. Helper methods help shorten how much code is needed to accomplish certain tasks.

```java
/**
 * This method finds the radius of a circle given 
 * two coordinate points
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return The radius of a circle in double
 */
public static double findRadius(double x1, double y1, double x2, double y2) {
  return(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
}

/**
 * This method finds the area of a circle given 
 * two coordinate points
 * 
 * @param x1 A double of the first x-coordinate
 * @param y1 A double of the first y-coordinate
 * @param x2 A double of the second x-coordinate
 * @param y2 A double of the second y-coordinate
 * @return The area of a circle in double
 */
public static double findArea(double x1, double y1, double x2, double y2) {
  return(Math.PI * Math.pow(findRadius(x1, y1, x2, y2), 2));
}

public static void main(String args[]) {
  System.out.println(findArea(0.0, 0.0, 4.0, 4.0));
}
```

{Try it}(sh .guides/bg.sh javac code/methods/HelperMethods.java java -cp code/methods/ HelperMethods 1)

|||info
## Math Methods
Note that in order to perform certain methods such as finding a square or an exponent, we imported the `Math` class as specified in the program header by `import java.lang.Math;`. If you remove the program header, the math methods associated with the `Math` class such as `Math.pow()` and `Math.PI()` will no longer work. In essence, these methods also serve as helper methods.

|||

{Check It!|assessment}(multiple-choice-2501190990)
