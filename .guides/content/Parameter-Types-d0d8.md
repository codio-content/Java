----------

## Method with Different Parameters

In Java, you are allowed to define methods with the *same* name as long as the parameters are *different* in quantity or type. Copy the code below and `TRY IT`.

```java
/**
 * This method adds two integers together
 * 
 * @param num1 The first integer
 * @param num2 The second integer
 */
public static void add(int num1, int num2) {
  System.out.println(num1 + num2);
}

/**
 * This method adds three integers together
 * 
 * @param num1 The first integer
 * @param num2 The second integer
 */
public static void add(int num1, int num2, int num3) {
  System.out.println(num1 + num2 + num3);
}

public static void main(String args[]) {
  add(3, 14);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/ParameterTypes.java java -cp code/methods/ ParameterTypes 1)

|||challenge
## What happens if you:
* Change the method call to `add(3, 14, 9);`?
* Change the method call to `add(3, 14, 9, 2);`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/ParameterTypes.java java -cp code/methods/ ParameterTypes 2)

The two `add()` methods above differ in the number of parameters they have. Here is an example of two methods with the same name but different parameter types.

```java
/**
 * This method adds two integers together
 * 
 * @param num1 The first integer
 * @param num2 The second integer
 */
public static void add(int num1, int num2) {
  System.out.println(num1 + num2);
}

/**
 * This method adds an integer to a string
 * 
 * @param num1 The integer
 * @param num2 The string
 */
public static void add(int num1, String num2) {
  System.out.println(num1 + num2);
}

public static void main(String args[]) {
  add(3, 14);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/ParameterTypes.java java -cp code/methods/ ParameterTypes 3)

|||challenge
## What happens if you:
* Change the method call to `add(3, "14");`?
* Change the method call to `add("14", 3);`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/ParameterTypes.java java -cp code/methods/ ParameterTypes 4)

{Check It!|assessment}(fill-in-the-blanks-304882085)
