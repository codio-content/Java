---

## The valueOf() Method
In a previous module, you were introduced to the `valueOf()` method. The `valueOf()` method returns a string of a specified data type. To use this method, you'll need the keyword `String`, followed by `valueOf`, followed by the data you want to convert in parentheses `()`.

```java
int a = 5;
String b = "Five";

System.out.println(String.valueOf(a) + b);
```

{Try it}(sh .guides/bg.sh javac code/strings/ValueOf.java java -cp code/strings/ ValueOf 1)

|||challenge
## What happens if you:
* Replace `int a = 5;` with `double a = 5.5;`?
* Replace `double a = 5.5;` in your current code with `boolean a = true;`?
* Replace `System.out.println(String.valueOf(a) + b);` in your current code with `System.out.println(a + b);`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/ValueOf.java java -cp code/strings/ ValueOf 2)

**Note** that if you do not convert the data appropriately to strings, you will not be able to combine them!

{Check It!|assessment}(multiple-choice-929826638)
