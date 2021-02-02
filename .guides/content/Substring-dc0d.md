## The substring() Method

The `substring()` method returns a portion of the string. Within parentheses `()`, provide the index at which you want the string to start followed by a comma followed by the index at which you want the string to stop. **Note** that the *start* index is **inclusive** but the *stop* index is **not inclusive**. The `substring()` method does not modify the original string. Instead, it returns a partial copy of the original string.

![.guides/img/StringSubstring](.guides/img/StringSubstring.png)

```java
String myString = "The brown dog jumps over the lazy fox.";
String mySlice = myString.substring(4, 9);

System.out.println(mySlice);
```

{Try it}(sh .guides/bg.sh javac code/strings/Substring.java java -cp code/strings/ Substring 1)

|||challenge
## What happens if you:
* Change `mySlice` to be `myString.substring(1, 2)`?
* Change `mySlice` to be `myString.substring(0, myString.length())`?
* Change `mySlice` to be `myString.substring(1, 1)`?
* Change `mySlice` to be `myString.substring(2)`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/Substring.java java -cp code/strings/ Substring 2)

<details>
  <summary><strong><code>substring()</code> default stop index</strong></summary>
  If only one index number is present, such as <code>myString.substring(2)</code>, Java will force the start index to that index number and the end index number will be the index of the last character of the string + 1. Essentially, <code>myString.substring(2)</code> will become <code>myString.substring(2, myString.length())</code> which is also the same as <code>myString.substring(2, 38)</code>.
</details>

{Check It!|assessment}(multiple-choice-2182641556)
