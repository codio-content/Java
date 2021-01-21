----------

## The indexOf() Method

Similar to the `startsWith()` method, the `indexOf()` method searches a specific character in a string. The difference, however, is that `indexOf()` returns an index number, not boolean. If the word or character is found, the index of the first letter of the occurring character will be returned. If not, `-1` is returned. You can tell `indexOf()` where to start the search by specifying an index as an optional second parameter. By default, `indexOf()` will search the entire string.

![.guides/img/StringIndexOf](.guides/img/StringIndexOf.png)

<details>
  <summary><strong>The lastIndexOf() method</strong></summary>
  You can use the <code>lastIndexOf()</code> method to search for a specific character(s) in a string that occurs last. Here is an example, given the string <code>this is his string</code>, <code>my_string.lastIndexOf("his")</code> will return <code>8</code>. If you don't want the system to search the whole string, you can specify an index as a second parameter to direct the system where to start searching.
</details><br>

```java
String string1 = "The brown dog jumps over the lazy fox.";
String string2 = "brown";

System.out.println(string1.indexOf(string2));
```

{Try it}(sh .guides/bg.sh javac code/strings/IndexOf.java java -cp code/strings/ IndexOf 1)

|||challenge
## What happens if you:
* Set `string2` to `"zebra"`?
* Change `string2` back to `"brown"` and change the `print` statement to `System.out.println(string1.indexOf(string2, 10))`?
* Set `string2` to `"he"` and change the `print` statement to `System.out.println(string1.indexOf(string2, 4))`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/IndexOf.java java -cp code/strings/ IndexOf 2)

{Check It!|assessment}(parsons-puzzle-2534949745)
