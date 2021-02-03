----------

## Immutability

You now know how to reference each character of a string. What do you think the code below will do?

```java
String myString = "House";
myString.charAt(0) = "M";
System.out.println(myString);
```

{Try it}(sh .guides/bg.sh javac code/strings/Immutability.java java -cp code/strings/ Immutability 1)

If you thought the code above would print `Mouse`, that would be a logical guess. However, you see an error. Unlike arrays where the characters can be manipulated, strings are immutable. That means you cannot change their value.

## Yes, but...

The code below works just fine. Isn't this an example of changing the value of a string?

```java
String myString = "House";
myString = "Mouse";
System.out.println(myString);
```

{Try it}(sh .guides/bg.sh javac code/strings/Immutability.java java -cp code/strings/ Immutability 2)

In Java, strings cannot be manipulated, thus they are considered immutable. However, strings like other data types can be re-assigned. The first example on this page is about mutability. That is, changing just a part of a whole. The second example is about the assignment operator. Re-assignment replaces the entire value of a variable with a new value. So, you can replace an entire string (re-assignment), but you cannot change part of a string (immutability).

![.guides/img/StringImmutability](.guides/img/StringImmutability.png)

{Check It!|assessment}(multiple-choice-2985524921)
