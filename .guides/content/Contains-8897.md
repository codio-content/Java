----------

## The contains() Method
The `contains()` method tells you if a character or a string is present in another string. `contains()` returns a boolean value, either `true` if the string is present or `false` if it is not.

```java
String my_string = "The brown dog jumps over the lazy fox.";

System.out.println(my_string.contains("dog"));
```

{Try it}(sh .guides/bg.sh javac code/strings/StringContains.java java -cp code/strings/ StringContains 1)

|||challenge
## What happens if you:
* Change the `print` statement to be `System.out.println(my_string.contains("cat"));`?
* Change the `print` statement to be `System.out.println(my_string.contains("Dog"));`?
* Change the `print` statement to be `System.out.println(my_string.contains(" "));`?
* Change the `print` statement to be `System.out.println(my_string.contains(my_string));`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringContains.java java -cp code/strings/ StringContains 2)

{Check It!|assessment}(multiple-choice-449420830)
