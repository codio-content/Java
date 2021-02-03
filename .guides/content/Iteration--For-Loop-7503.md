----------

## Iterating Over Strings

You have seen how you can make a copy of individual characters in a string with their index. Iterating over a string allows you to deal with each character of a string individually. You start with the character at index `0` and move through the end of the string.

```java
String myString = "Hello world";

for (int i = 0; i < myString.length(); i++) {
  System.out.print(myString.charAt(i));
}
```

{Try it}(sh .guides/bg.sh javac code/strings/StringForLoop.java java -cp code/strings/ StringForLoop 1)

|||challenge
## What happens if you:
* Change the value of `myString` to `"10, 11, 12, 13, 14"`?
* Change the value of `myString` to `"\u25A3\u25A8\u25D3\u25CC\u25A2"`?
* Change the `print` statement to `System.out.println(myString.charAt(i))`?
* Change the `print` statement to `System.out.print(myString)`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringForLoop.java java -cp code/strings/ StringForLoop 2)

## Behind the Scenes

Click on the code visualizer link below to open up the visualizer. Then, step through the code by continuously clicking the `Forward` button. Notice how the iterating variable `i` goes through each index from beginning to end.

[Code Visualizer](open_tutor code/strings/StringForLoop.java)

{Check It!|assessment}(fill-in-the-blanks-3929791507)
