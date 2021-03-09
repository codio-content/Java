----------

## The Slope Formula
You are going to write a method that takes in 4 **doubles** as parameters. These parameters represent two sets of coordinate points labeled as `x1`, `y1`, `x2`, and `y2`. The method will then use these points to calculate the slope that their line creates and then prints that slope to the user.

## Method Header
First, we need to set up the method header. Per usual we will start off with `public static` followed by our return type. Since the result is simply printing the slope, we will use `void` as the return type. Additionally, we'll name the name `getSlope()`.

```java
public static void getSlope() {
}
```

## Parameters
The method should take 4 **doubles** as parameters named `x1`, `y1`, `x2`, and `y2`.

```java
public static void getSlope(double x1, double y1, double x2, double y2) {
}
```

## Printing the Slope
The final step is to print the slope, but we'll need the slope formula in order to do that. The slope formula is defined as `(y2 - y1) / (x2 - x1)`.

```java
System.out.println((y2 - y1) / (x2 - x1));
```

## Testing the Method
In order to use a method, you'll need to call it by specifying its name within the `main()` method. Note that the method requires parameters so we'll need to provide some arguments in order for the method to work properly. Let's use the points `(3, 2)` and `(5, 6)` as our coordinates which correspond to `(x1, y1)` and `(x2, y2)` respectively.

```java
public static void main(String args[]) {
  getSlope(3, 2, 5, 6);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/LabParameters.java java -cp code/methods/ LabParameters 1)

The `getSlope()` method will apply the slope formula `(6 - 2) / (5 - 3)` and print the result `2.0` to the user. Make sure to also include documentation so that other users can understand your method.

<details>
  <summary><strong>Code</strong></summary>
  
  ```java
  /**
   * This method prints the slope between two sets
   * of coordinate points
   * 
   * @param x1 A double of the first x-coordinate
   * @param y1 A double of the first y-coordinate
   * @param x2 A double of the second x-coordinate
   * @param y2 A double of the second y-coordinate
   * @return No return value
   */
  public static void getSlope(double x1, double y1, double x2, double y2) {
    System.out.println((y2 - y1) / (x2 - x1));
  }

  public static void main(String args[]) {
    getSlope(3, 2, 5, 6);
  }
  ```
  
</details>

{Check It!|assessment}(multiple-choice-3835726565)
