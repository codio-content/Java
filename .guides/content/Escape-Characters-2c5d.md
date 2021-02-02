----------

## Escape Characters

An escape character is a character that has a different interpretation than what you see in a string. Escape characters always start with a backslash (`\`). The most common escape character is the newline character (`\n`) which causes Java to print on the next line.

```java
String myString = "Hello\nworld";
System.out.println(myString);
```

{Try it}(sh .guides/bg.sh javac code/strings/StringEscape.java java -cp code/strings/ StringEscape 1)

|Escape Character|Description|Example|
|----------------|-----------|-------|
|**\\\\**|Prints a backslash|`System.out.println("\\")`|
|**\\\'**|Prints a single quote|`System.out.println("\'")`|
|**\\\"**|Prints a double quote|`System.out.println("\"")`|
|**\\t**|Prints a tab (spacing)|`System.out.println("Hello\tworld")`|

|||challenge
## What happens if you:
* Use `\n\n` instead of `\n` in the original code?
* Replace `\n\n` in your current code with `\t`?
* Replace `\t` in your current code with `\"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringEscape.java java -cp code/strings/ StringEscape 2)

## Quotes Inside Quotes

Imagine that you have this small bit of dialog, `And then she said, "Hi there."` and want to store it as a string. Typing `"And then she said, "Hi there.""` would cause an error.

![.guides/img/StringQuotes](.guides/img/StringQuotes.png)

When you use a `"` to start a string, Java looks for the next `"` to end it. To avoid syntax errors, you can use a double quote to start your string, single quotes for the inner quote, and end the string with a double quote.

```Java
String myString = "And then she said, 'Hi there.'";
System.out.println(myString);
```

{Try it}(sh .guides/bg.sh javac code/strings/StringEscape.java java -cp code/strings/ StringEscape 3)

|||challenge
## What happens if you:
* Replace single quotes (`'`) with double quotes (`"`) and double quotes(`"`) with single quotes (`'`) in the original code?
* Change all quotes to double quotes (`"`)?
* Use the escape character `\"` for the inner quotation marks that surround `Hi there.` (e.g. `"And then she said, \"Hi there.\""`)?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringEscape.java java -cp code/strings/ StringEscape 4)

{Check It!|assessment}(multiple-choice-951427295)
