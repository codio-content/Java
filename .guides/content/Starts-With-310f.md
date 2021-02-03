----------

## The startsWith() Method

The `startsWith()` method returns either `true` or `false` depending on whether a string starts a specific character(s). For example, `myString.startsWith("this")` will return `true` if `myString` starts with `"this"`. If not, it will return `false`. The `startsWith()` method has two parameters. The first parameter, a string, is mandatory. `startsWith` will start the comparison with the first character in the string by default. However, you can change where the comparison starts and ends with an optional second parameter. **Remember** that string indices start at `0`, which corresponds with the first letter in the string!

![.guides/img/StringStartsWith](.guides/img/StringStartsWith.png)

<details>
  <summary><strong>The endsWith() method</strong></summary>
  You can use the <code>endsWith()</code> method to see if a string ends with a specific character(s). Unlike the <code>startsWith()</code> method, there is no optional second parameter. Here is an example, given the string <code>this is a string</code>, <code>myString.endsWith("ring")</code> will return <code>true</code>.
</details><br>

```java
String myString = "this is a string";
boolean myBool = myString.startsWith("this");

System.out.println(myBool);
```

{Try it}(sh .guides/bg.sh javac code/strings/StartsWith.java java -cp code/strings/ StartsWith 1)

|||challenge
## What happens if you:
* Set `myBool` to `myString.startsWith("This")`?
* Set `myBool` to `myString.startsWith("is", 2)`?
* Set `myBool` to `myString.startsWith("is", 4)`?
* Set `myBool` to `myString.startsWith("is", 5)`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StartsWith.java java -cp code/strings/ StartsWith 2)

{Check It!|assessment}(fill-in-the-blanks-2517337307)
