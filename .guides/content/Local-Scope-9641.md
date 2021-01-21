----------

## Local Scope

Take a look at the code below. The first method declares the variable `myVar` and then prints it. The second method also prints `myVar`. What do you think the output will be?

```java
public static void myMethod1() {
  String myVar = "Hello";
  System.out.println(myVar);
}

public static void myMethod2() {
  System.out.println(myVar);
}

public static void main(String args[]) {
  myMethod1();
  myMethod2();
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Local.java java -cp code/methods/ Local 1)

Java returns an error such as `error: cannot find symbol` at the line containing `System.out.println(myVar);` within the second method. This happens because variables declared inside a method have **local** scope. Variables with local scope can **only** be used within that method. Outside of that method, those local variables cannot be accessed. In the image below, the light blue box represents the scope of `myVar`. Since `myMethod2` (denoted in a light red box) is outside the scope of `my_var`, an error occurs.

![.guides/img/LocalScope](.guides/img/LocalScope.png)

|||challenge
## What happens if you:
* Change `myMethod2` to look like this:
```java
public static void myMethod2() {
  String myVar2 = "Hello";
  System.out.println(myVar2);
}
```

|||

{Try it}(sh .guides/bg.sh javac code/methods/Local.java java -cp code/methods/ Local 2)

## More Local Scope

Each method has its own local scope. That means you can declare two variables with the same name as long as they are in separate methods. The blue `myVar` exists only in the light blue box, and the red `myVar` exists only in the light red box. The boundaries of local scope keep Java from overwriting the value of the first variable with the contents of the second.

![.guides/img/LocalScope2](.guides/img/LocalScope2.png)

```java
public static void myMethod1() {
  String myVar = "Hello";
  System.out.println(myVar);
}

public static void myMethod2() {
  String myVar = "Bonjour";
  System.out.println(myVar);
}

public static void main(String args[]) {
  myMethod1();
  myMethod2();
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Local.java java -cp code/methods/ Local 3)

|||challenge
## What happens if you:
* Declare `myMethod3()` as:
```java
public static void myMethod3() {
  String myVar = "Hola";
  System.out.println(myVar);
}
```
and call it by including `myMethod3();` within the `main()` method.

|||

{Try it}(sh .guides/bg.sh javac code/methods/Local.java java -cp code/methods/ Local 4)

{Check It!|assessment}(fill-in-the-blanks-2523601916)
