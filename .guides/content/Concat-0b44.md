---

## The concat() Method
An alternative way to **concatenate** or combine strings is to use the `concat()` method. The `concat()` method works in the same way as adding literal strings together using the `+` operator.

```java
String a = "High";
String b = " Five";

System.out.println(a.concat(b));
```

{Try it}(sh .guides/bg.sh javac code/strings/StringConcat.java java -cp code/strings/ StringConcat 1)

|||challenge
## What happens if you:
* Change the print statement to `System.out.println(a.concat(b + "!"));`?
* Replace `String b = " Five";` with `int b = 5;`?
* Change the print statement back to `System.out.println(a.concat(b));`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringConcat.java java -cp code/strings/ StringConcat 2)

|||important
## IMPORTANT
**NOTE** that the `concat()` method is exclusively for strings. Thus, you cannot include other data types like `int`s when using `concat()` unless they are converted to strings first. In the example above, the statement `System.out.println(a.concat(b + "!"));` causes the system to internally convert `b`, which is an `int`, into a string `"5"`. This conversion makes it possible to add `a` and `b` together.

|||

{Check It!|assessment}(multiple-choice-3726193520)
