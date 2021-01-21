## Global vs. Local Scope

If a variable is declared and initialized both locally and globally, that variable will retain its content depending on how it is used. In the example below, `myVar` is declared and initialized globally as `global scope` and locally as `local scope`. Since the variable has differing scopes, it retains its value when called or printed.

```java
static String myVar = "global scope";

public static void printScope() {
  String myVar = "local scope";
  System.out.println(myVar);
}

public static void main(String args[]) {
  printScope();
  System.out.println(myVar);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/LocalGlobal.java java -cp code/methods/ LocalGlobal 1)

The exception to this rule is when a method modifies a global variable. In such a case, the content of the global variable is changed.

```java
static String myVar = "global scope";

public static void printScope() {
  myVar = "local scope";
  System.out.println(myVar);
}

public static void main(String args[]) {
  printScope();
  System.out.println(myVar);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/LocalGlobal.java java -cp code/methods/ LocalGlobal 2)


|||challenge
## What happens if you:
* Change the code to:
```java
static String myVar = "global scope";

public static void printScope(String myVar) {
  myVar = "local scope";
  System.out.println(myVar);
}

public static void main(String args[]) {
  printScope(myVar);
  System.out.println(myVar);
}
```

|||

{Try it}(sh .guides/bg.sh javac code/methods/LocalGlobal.java java -cp code/methods/ LocalGlobal 3)

When a global variable is also a method parameter, it is considered to be the same as if the method declared and initialized its own local variable. In this case, the variable has both a local and global scope and will retain its value depending on its scope.

{Check It!|assessment}(fill-in-the-blanks-158451930)
