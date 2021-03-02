----------

## The Return Keyword

Instead of just **printing** data, methods can also **return** data. Think of the `length` and `length()` methods. They return the length (in integer) of an array and string respectively. So the return value of these methods is of type `int`. Both `length` and `length()` do not print anything to the screen, they just return a number. From here on out, user-defined methods will avoid just printing to the screen. Instead, they will return a value. To return a value, simply use the `return` keyword.

```java
/**
 * This method adds adds 5 to an integer
 * 
 * @param num An integer
 * @return The integer added to 5
 */
public static int addFive(int num) {
  return(num + 5);
}

public static void main(String args[]) {
  addFive(10);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Return.java java -cp code/methods/ Return 1)

You'll notice the program no longer prints anything to the screen. That is because the method only adds `5` to whatever parameter is passed to the method and then returns it *internally*. To *see* the result, explicitly tell Java to print the return value of the method to the screen.

```java
/**
 * This method adds adds 5 to an integer
 * 
 * @param num An integer
 * @return The integer added to 5
 */
public static int addFive(int num) {
  return(num + 5);
}

public static void main(String args[]) {
  int newNum = addFive(10);
  System.out.println(newNum);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Return.java java -cp code/methods/ Return 2)

|||challenge
## What happens if you:
* Remove all lines of code within `main()` and replace them with just `System.out.println(addFive(10));`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/Return.java java -cp code/methods/ Return 3)

<details>
  <summary><strong>What is the return value for methods that use <code>System.out.println()</code>?</strong></summary>
  If each method in Java has a return value, what is the return value for methods that use <code>System.out.println()</code>? Actually, you've seen it before and it is <code>void</code>. Methods that do not return a value are considered to be <code>void</code> methods.
  
  ```java
  /**
 * This method prints "Hello"
 * 
 * @param No parameter
 * @return No return value
 */
  public static void printHello() { //void method
    System.out.println("Hello");
  }
  
  public static void main(String args[]) { //void method
    printHello();
  }
  ```
  
</details>

## Returning Values

Methods can return any value in Java — ints, doubles, strings, ArrayLists, etc.

```java
/**
 * This method adds two integers together
 * 
 * @param x The first integer
 * @param y The second integer
 * @return x added to y
 */
public static int returnInt(int x, int y) { //int method
  return(x + y);
}

/**
 * This method adds two doubles together
 * 
 * @param x The first double
 * @param y The second double
 * @return x added to y
 */
public static double returnDouble(double x, double y) { //double method
  return(x + y);
}

/**
 * This method adds two strings together
 * 
 * @param x The first string
 * @param y The second string
 * @return x added to y
 */
public static String returnString(String x, String y) { //String method
  return(x + y);
}

public static void main(String args[]) { //void method
  System.out.println(returnInt(1, 2));
  System.out.println(returnDouble(1, 2));
  System.out.println(returnString("1", "2"));
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Return.java java -cp code/methods/ Return 4)

|||challenge
## Can you write a method that returns an ArrayList?
If you want to return an ArrayList, one possible approach is to have an ArrayList be passed as a parameter. You can then modify the ArrayList in some way, and then return it to the system.
<details>
  <summary><strong>Sample Code</strong></summary>
  The code below takes an ArrayList of numbers as a parameter for the method <code>multiplyFive()</code>. The method creates a new empty ArrayList, multiplies each element of the parameter ArrayList by 5, and then adds those new products to the new ArrayList. Finally, the new ArrayList is returned.
  
  ```java
  
  public static ArrayList<Integer> multiplyFive(ArrayList<Integer> myList) {
    ArrayList<Integer> newList = new ArrayList<Integer>();
    for (Integer i : myList) {
      newList.add(i * 5);
    }
    return newList;
  }
  
  public static void main(String args[]) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
  
    System.out.println(multiplyFive(numbers));
  }
  ```
  
</details>

|||

{Try it}(sh .guides/bg.sh javac code/methods/Return.java java -cp code/methods/ Return 5)

{Check It!|assessment}(multiple-choice-3464223914)
