## Calling a Method

Copy the entire code below into the text editor to your left. Then click the `TRY IT` button to see what happens.

```java
public class MethodCall {

  public static void greetTwice() {
    System.out.println("Hello");
    System.out.println("Hello");
  }

}
```

{Try it}(sh .guides/bg.sh javac code/methods/MethodCall.java java -cp code/methods/ MethodCall 1)

You'll notice that an error is produced. This happens because when running Java programs, a `main` class is required. Let's go ahead and add `public static void main(String args[])` to the code like so.

```java
public class MethodCall {

  public static void greetTwice() {
    System.out.println("Hello");
    System.out.println("Hello");
  }

  public static void main(String args[]) {

  }

}
```

{Try it}(sh .guides/bg.sh javac code/methods/MethodCall.java java -cp code/methods/ MethodCall 2)

Nothing is outputted when the program is executed. This happens because creating a method alone does not cause Java to run it. You have to explicitly call the method if you want it to run. Methods are usually called within the `main` class. To call a method, simply start with its name, provide any parameters if needed, and end with a semicolon.

```java
public class MethodCall {

  public static void greetTwice() {
    System.out.println("Hello");
    System.out.println("Hello");
  }

  public static void main(String args[]) {
    greetTwice(); //method call to greetTwice
  }

}
```

{Try it}(sh .guides/bg.sh javac code/methods/MethodCall.java java -cp code/methods/ MethodCall 3)

|||challenge
## What happens if you:
* Call `greetTwice` again by adding another `greetTwice();` to the `main()` method?
* Modify `greetTwice` by adding the line `System.out.println("Goodbye");` underneath the second `System.out.println("Hello");`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/MethodCall.java java -cp code/methods/ MethodCall 4)

## Order of Method Definitions

The order of method definitions is important in Java. If the code is changed to the following, what do you think will be outputted?

```java
public class MethodCall {

  public static void greetTwice() {
    System.out.println("Goodbye");
    System.out.println("Hello");
    System.out.println("Hello");
  }

  public static void main(String args[]) {
    greetTwice();
    greetTwice();
  }

}
```

{Try it}(sh .guides/bg.sh javac code/methods/MethodCall.java java -cp code/methods/ MethodCall 5)

Like how a regular Java program runs, the method is executed line by line from top to bottom. Thus, the order of statements within the method will determine what actions are performed first, second, etc.

## Order of Method and Main

On the other hand, the order of the classes themselves, `main()` versus `greetTwice()`, does not matter. What happens if you swap the position of `main()` with `greetTwice()` and vice versa?

```java
public class MethodCall {
  
  public static void main(String args[]) {
    greetTwice();
    greetTwice();
  }

  public static void greetTwice() {
    System.out.println("Goodbye");
    System.out.println("Hello");
    System.out.println("Hello");
  }

}
```

{Try it}(sh .guides/bg.sh javac code/methods/MethodCall.java java -cp code/methods/ MethodCall 6)

{Check It!|assessment}(multiple-choice-3096310326)
