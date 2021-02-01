----------

## Parameters

If a method contains parameters within its definition, they are required to be present when the method is called. In the example below, the method, `add()`, adds two integer parameters together. Parameters are the types or values located in between the parentheses. Multiple parameters are separated by commas. 

![.guides/img/Parameters1](.guides/img/Parameters1.png)

Copy and paste the following method into the text editor to your left between the lines `//add method definitions below this line` and `//add method definitions above this line`. **DO NOT** modify `main()` yet, or the code will not print correctly!

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
```

{Try it}(sh .guides/bg.sh javac code/methods/Parameters.java java -cp code/methods/ Parameters 1)

|||challenge
## What happens if you:
* Change the method call in `main()` to `add(5, "seven");`?
* Change the method call to `add();` without any parameters?
* Change the method call to `add(5, 10, 15);`?
* Change the entire method to...
```java
public static void add(int num1, int num2, int num3) {
  System.out.println(num1 + num2 + num3);
}
```

|||

{Try it}(sh .guides/bg.sh javac code/methods/Parameters.java java -cp code/methods/ Parameters 2)

|||important
## IMPORTANT
* The **number** of arguments within `main()` should match the number of parameters specified in the method. If there are three parameters, then there should be three arguments as well.
* The argument **type** should also match the parameter type. If the method requires three integers, then the arguments should also consist of three integers. You cannot provide a string argument for an integer parameter, etc.

|||

## Order of Parameters

![.guides/img/Parameters2](.guides/img/Parameters2.png)

Much like how Java programs run code from left to right and then top to bottom, parameters are also read the same way. Because of this, the order of parameters is important. The first argument in the method call will be matched with the first parameter in the method header, the second argument from the method call will be the second parameter in the method header, etc. Copy the entire code below into the text editor and then click `TRY IT`. What do you predict the output will be?

```java
public class Parameters {
  
  /**
   * This method adds the first two integers together,
   * then subtracts the third integer
   * 
   * @param num1 The first integer
   * @param num2 The second integer
   * @param num3 The third integer
   */
  public static void addSub(int num1, int num2, int num3) {
    System.out.println(num1 + num2 - num3);
  }
  
  public static void main(String args[]) {
    addSub(5, 10, 15);
  }
  
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Parameters.java java -cp code/methods/ Parameters 3)

|||challenge
## What happens if you:
* Change the method call in `main()` to `addSub(10, 15, 5)`?
* Change the method call in `main()` to `addSub(15, 5, 10)`?
* Change the method call in `main()` to `addSub(10 + 5, 20 / 4, 5 * 2)`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/Parameters.java java -cp code/methods/ Parameters 4)

{Check It!|assessment}(fill-in-the-blanks-4180499661)
