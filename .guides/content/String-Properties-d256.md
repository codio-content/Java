----------

## String Length

We have already seen strings in the "Fundamentals"section. We are going to dig a little deeper with this data type. All strings have the following characteristics:

1) **Characters** - Strings are made up of characters between quotation marks (previously covered in the "Fundamentals" section).
2) **Length** - Each string has a length (total number of characters).
3) **Index** - Each character in a string has a position, called an index.

 To calculate the length of a string, use the `length()` method. This method will return an integer that is the sum of all of the characters between the quotation marks.

```java
String my_string = "Hello";
int len_string = my_string.length();
System.out.println(len_string);
```

{Try it}(sh .guides/bg.sh javac code/strings/StringProperties.java java -cp code/strings/ StringProperties 1)

|||challenge
## What happens if you:
* Change `my_string` to `"Hello world!"`?
* Change `my_string` to `""`?
* Change `my_string` to `"-1"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringProperties.java java -cp code/strings/ StringProperties 2)

## String Index

Previously in the **arrays** module, we learned that an array has elements that reside in each of its position or **index**. A string too has indices that correspond to the position where each of its character resides. Like array indices, string indices also start at 0.

![.guides/img/StringIndex](.guides/img/StringIndex.png)

<details>
  <summary><strong>Strings & Quotation Marks</strong></summary>
  Quotation marks are required to declare the value of a string. However, quotation marks are not a part of the string itself. That is why quotation marks are not counted with the <code>length()</code> function and why they do not have an index.
</details><br>

To reference a character, use the string name followed by the `charAt()` method. Within parentheses `()`, provide the index number of the character you want the system to return.

![.guides/img/StringCharAt](.guides/img/StringCharAt.png)

```java
String my_string = "Hello!";
char character = my_string.charAt(1);
System.out.println(character);
```

{Try it}(sh .guides/bg.sh javac code/strings/StringProperties.java java -cp code/strings/ StringProperties 3)

|||challenge
## What happens if you:
* Change `char character` to `my_string.charAt(my_string.length())`?
* Change `char character` to `my_string.charAt(my_string.length()-1)`?
* Change `char character` to `my_string.charAt(-1)`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringProperties.java java -cp code/strings/ StringProperties 4)

{Check It!|assessment}(fill-in-the-blanks-2834384865)
