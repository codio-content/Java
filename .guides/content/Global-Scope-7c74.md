## Global Scope - Referencing Variables

When a variable is declared inside a method, it has local scope. When a variable is declared in the main program within **class**, it has global scope. Global variables are declared outside of methods, but can be referenced inside a method. Look at the image below. The yellow block holds everything within the program including the variable `greeting`. This enables all methods within the program to access that variable since it is considered to be **global**. Copy and paste the code below and then click `TRY IT`.

![.guides/img/GlobalScope](.guides/img/GlobalScope.png)

```java
static String greeting = "Hello";

public static void sayHello() {
  System.out.println(greeting);
}

public static void main(String args[]) {
  sayHello();
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Global.java java -cp code/methods/ Global 1)

Notice how the keyword `static` is used. This is due to the fact that both the `sayHello()` and `main()` method are `static` methods. Only **static** variables can be accessed by static methods.

|||challenge
## What happens if you:
* Remove the keyword `static` from `static String greeting = "Hello";`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/Global.java java -cp code/methods/ Global 2)


## Global Scope - Modifying Variables

Once a global variable (whether static or not) becomes available, a method can modify the content of that variable as needed.

```java
static String greeting = "Hello";

public static void sayHello() {
  greeting = "Bonjour";
  System.out.println(greeting);
}

public static void main(String args[]) {
  sayHello();
}
```

{Try it}(sh .guides/bg.sh javac code/methods/Global.java java -cp code/methods/ Global 3)

|||challenge
## What happens if you:
* Change `greeting = "Bonjour";` within `sayHello()` to `greeting = "Hola";`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/Global.java java -cp code/methods/ Global 4)

{Check It!|assessment}(multiple-choice-3527686902)
