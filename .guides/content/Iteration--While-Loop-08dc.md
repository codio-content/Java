----------

## While Loop

String iteration is most often done with a `for` loop. However, a `while` can be used as well.

```java
String myString = "Calvin and Hobbes";
int i = 0;

while (i < myString.length()) {
  System.out.print(myString.charAt(i));
  i++;
}
```

{Try it}(sh .guides/bg.sh javac code/strings/StringWhileLoop.java java -cp code/strings/ StringWhileLoop 1)

[Code Visualizer](open_tutor code/strings/StringWhileLoop.java)

|||challenge
## What happens if you:
* Change the loop to `while (i <= myString.length())`?
* Copy the original code but change the `print` statement to `System.out.print(i)`?
* Copy the original code but remove `i++`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringWhileLoop.java java -cp code/strings/ StringWhileLoop 2)

## Comparing While & For Loops

```java
String myString = "Java";

for (int i = 0; i < myString.length(); i++) {
  System.out.print(myString.charAt(i));
}
```

```java
String myString = "Java";
int i = 0;

while (i < myString.length()) {
  System.out.print(myString.charAt(i));
  i++;
}
```

{Try it}(sh .guides/bg.sh javac code/strings/StringWhileLoop.java java -cp code/strings/ StringWhileLoop 2)

Above are two ways of iterating through a string. The first way uses the `for` loop and the second uses a `while` loop. Both produces the same result. However, the `for` loop is usually preferred because it requires less code to accomplish the same task.

{Check It!|assessment}(fill-in-the-blanks-443018017)
