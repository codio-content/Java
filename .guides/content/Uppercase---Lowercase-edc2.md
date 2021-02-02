----------

## The toUpperCase() Method

The `toUpperCase()` method returns a copy of the original string with all uppercase characters. **Note** that there is no parameter for this method.

![.guides/img/StringToUpperCase](.guides/img/StringToUpperCase.png)

**Translation:** Convert all the characters of `myString` to uppercase.

```java
String myString = "the big brown dog";

System.out.println(myString.toUpperCase());
```

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 1)

|||challenge
## What happens if you:
* Set `myString` to `"ThE bIg BrOwN dOg"`?
* Set `myString` to `"THE BIG BROWN DOG"`?
* Set `myString` to `"123!@#"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 2)

## The toLowerCase() Method

The `toLowerCase()` method creates a copy of a string, and returns the copy with all lowercase characters. Like the `toUpperCase()` method, the `toLowerCase()` does not take any parameters either.

```java
String myString = "THE BIG BROWN DOG";

System.out.println(myString.toLowerCase());
```

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 3)

|||challenge
## What happens if you:
* Set `myString` to `"tHe BiG bRoWn DoG"`?
* Set `myString` to `"the big brown dog"`?
* Set `myString` to `"214%#%"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 4)

{Check It!|assessment}(multiple-choice-3480569100)
