----------

## Creating a "New" String

In Java, there are actually two common ways to create a string. One way is to create a string variable and assign string values to it such as `String string1 = "It's Friday!";`. Another way is to use the keyword `new` such as `String string2 = new String("It's Friday!");`. When strings of two *different* methods are compared, you *cannot* use `==` to compare them.

```java
String string1 = "It's Friday!"; 
String string2 = new String("It's Friday!");
String string3 = new String("It's Friday!");
String string4 = "It's Friday!";

System.out.println(string1 == string2);
```

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsMethod.java java -cp code/strings/ StringEqualsMethod 1)

|||challenge
## What happens if you:
* Change the print statement to `System.out.println(string1 == string4);`?
* Change the print statement to `System.out.println(string2 == string3);`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsMethod.java java -cp code/strings/ StringEqualsMethod 2)

|||important
## IMPORTANT
**NOTE** that the `new` string method in Java always creates a new **unique** string that is not comparable to any strings created before it. Thus, even if two strings contain the same characters but are created using the `new` method, they will still be incomparable.

|||

## The equals() Method

The `equals()` method in Java enables you to compare strings regardless of how they were created.

```java
String string1 = "It's Friday!"; 
String string2 = new String("It's Friday!");
String string3 = new String("It's Friday!");
String string4 = "It's Friday!";
String string5 = "It's Friday.";

System.out.println(string1.equals(string2));
```

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsMethod.java java -cp code/strings/ StringEqualsMethod 3)

|||challenge
## What happens if you:
* Change the print statement to `System.out.println(string1.equals(string4));`?
* Change the print statement to `System.out.println(string2.equals(string3));`?
* Change the print statement to `System.out.println(string2.equals(string4));`?
* Change the print statement to `System.out.println(string4.equals(string5));`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringEqualsMethod.java java -cp code/strings/ StringEqualsMethod 4)

{Check It!|assessment}(multiple-choice-703200342)
