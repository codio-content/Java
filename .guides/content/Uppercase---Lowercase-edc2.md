----------

## The toUpperCase() Method

The `toUpperCase()` method returns a copy of the original string with all uppercase characters. **Note** that there is no parameter for this method.

![.guides/img/StringToUpperCase](.guides/img/StringToUpperCase.png)

**Translation:** Convert all the characters of `my_string` to uppercase.

```java
String my_string = "the big brown dog";

System.out.println(my_string.toUpperCase());
```

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 1)

|||challenge
## What happens if you:
* Set `my_string` to `"ThE bIg BrOwN dOg"`?
* Set `my_string` to `"THE BIG BROWN DOG"`?
* Set `my_string` to `"123!@#"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 2)

## The toLowerCase() Method

The `toLowerCase()` method creates a copy of a string, and returns the copy with all lowercase characters. Like the `toUpperCase()` method, the `toLowerCase()` does not take any parameters either.

```java
String my_string = "THE BIG BROWN DOG";

System.out.println(my_string.toLowerCase());
```

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 3)

|||challenge
## What happens if you:
* Set `my_string` to `"tHe BiG bRoWn DoG"`?
* Set `my_string` to `"the big brown dog"`?
* Set `my_string` to `"214%#%"`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/UpperLowerCase.java java -cp code/strings/ UpperLowerCase 4)

{Check It!|assessment}(multiple-choice-3480569100)
