## Checking Parameter Usage

Copy and paste the code below into the text editor and then `TRY IT`.

```java
/**
 * This method divides one integer by the other
 * 
 * @param num1 The first integer
 * @param num2 The second integer
 */
public static void divide(int num1, int num2) {
  System.out.println(num1 / num2);
}

public static void main(String args[]) {
  divide(5, 0);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/CheckParameters.java java -cp code/methods/ CheckParameters 1)

You'll notice that the code produces an **exception**. An exception occurs when an operation cannot be successfully completed because a rule is broken. For example, dividing by `0` results in an *undefined* answer. Thus when you try to divide `5` by `0`, you get an exception as a response. Not all exception messages are created equal. Some are more clear than others. However, you may choose to clearly define an exception by using a `try catch` block.

![.guides/img/TryCatchException](.guides/img/TryCatchException.png)

```java
/**
 * This method divides one integer by the other
 * 
 * @param num1 The first integer
 * @param num2 The second integer
 */
public static void divide(int num1, int num2) {
  try {
    System.out.println(num1 / num2);
  }
  catch (Exception e) {
    System.out.println("Cannot divide by zero.");
  }
}

public static void main(String args[]) {
  divide(5, 0);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/CheckParameters.java java -cp code/methods/ CheckParameters 2)

|||challenge
## What happens if you:
* Change the method call to `divide(5, 2)`?
* Change the method call to `divide(0, 2)`?
* Change the method call to `divide(14.5, 2)`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/CheckParameters.java java -cp code/methods/ CheckParameters 3)

|||important
## IMPORTANT
**Note** that you can only catch Java **exceptions**, not compilation **errors**. If you attempt to provide an argument that is not the same type as a specified parameter (i.e. `14.5` is a double and not an int), the compiler will simply fail and the compilation error will be returned. `Exception` is the generic exception keyword that will catch any exception produced. `e` is the variable name for which you are calling the exception by. For now, we will only focus on `Exception`. For a list of other exceptions, visit: [Java Exceptions](https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/).

|||

{Check It!|assessment}(multiple-choice-524437350)
