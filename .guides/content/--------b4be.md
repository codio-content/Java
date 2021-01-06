----------

## Comparing with ==

The `==` operator can be used with strings just like it is with numbers or boolean values.

```java
String string1 = "It's Friday!";
String string2 = "It's Friday!";

System.out.println(string1 == string2);
```

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsEquals.java java -cp code/strings/ StringEqualsEquals 1)

|||challenge
## What happens if you:
* Change the value of `string1` to `"it's friday!"`?
* Change the value of `string2` to `"it\'s friday!"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsEquals.java java -cp code/strings/ StringEqualsEquals 2)

## Comparing with !=

You can also test for string inequality with the `!=` operator.

```java
String string1 = "It's Friday!";
String string2 = "It's Monday.";

System.out.println(string1 != string2);
```

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsEquals.java java -cp code/strings/ StringEqualsEquals 3)

|||challenge
## What happens if you:
* Change the value of `string2` to `"It's Friday"`?
* Change the value of `string2` to `"It's Friday!"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsEquals.java java -cp code/strings/ StringEqualsEquals 4)

{Check It!|assessment}(fill-in-the-blanks-3500325957)
