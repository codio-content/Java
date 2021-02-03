----------

## The trim() Method

The `trim()` method removes white space characters from the beginning and end of a string. `trim()` will return a modified copy of the original string.

```java
String myString = "    Hello    world    ";
System.out.println(myString.trim());
```

{Try it}(sh .guides/bg.sh javac code/strings/TrimRemove.java java -cp code/strings/ TrimRemove 1)

**Note** that the `trim()` method only removes leading and trailing white spaces and not the ones that are located in between characters.

## The replace() Method

Contrary to the `trim()` method, the `replace()` method is much more flexible and can replace whites spaces and characters **anywhere** within the string. To use the `replace()` method, specify the characters you want to be replaced as the first parameter and the new characters as the second parameter. This will cause the second parameter characters to replace all occurrences of the first parameter characters.

![.guides/img/StringReplace](.guides/img/StringReplace.png)

The image above showcases the usage of the `replace()` method where the string `Codio` will replace all occurrences of the string `world`.

Let's try some of the examples.

```java
String string1 = "    Hello    world    ";
String string2 = string1.replace(" ", "");
//replace all whitespaces with no spaces
//string2 now becomes "Helloworld"

String string3 = "Codio";
String string4 = string1.replace("world", "Codio");
//replace all occurences of "world" with "Codio"
//string 4 now becomes "HelloCodio"

System.out.println(string2); //print string2
```

{Try it}(sh .guides/bg.sh javac code/strings/TrimRemove.java java -cp code/strings/ TrimRemove 2)

|||challenge
## What happens if you:
* Change `String string2 = string1.replace(" ", "");` in the code to `String string2 = string1.replace("Hello", "Hi");`?
* Change the print statement to `System.out.println(string4);`?
* Add `String string5 = string4.replace(" ", "");` to the line **before** the print statement and change the print statement to `System.out.println(string5);`?
* Add another string `String string6 = string5.replace("oC", "o C");` **before** the print statement and change the print statement to `System.out.println(string6);`? **Note:** There is a whitespace between the `o` and the `c`.

|||

{Try it}(sh .guides/bg.sh javac code/strings/TrimRemove.java java -cp code/strings/ TrimRemove 3)

{Check It!|assessment}(multiple-choice-1128520187)
