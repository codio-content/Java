----------

## Lexicographical Order

In Java, strings can be compared lexicographically, meaning they can be compared according to how they will appear in the dictionary. You can use the `compareTo()` method to determine which of two strings comes first. A return value of a **negative** integer means the first string comes first, a return value of a **positive** integer means the second string comes first, and a return value of `0` means the strings are equal and neither comes first.

```java
String string1 = "apple";
String string2 = "cat";

if (string1.compareTo(string2) < 0) {
  System.out.println("string1 comes first");
}
else if (string1.compareTo(string2) > 0) {
  System.out.println("string2 comes first");
}
else {
  System.out.println("the strings are equal");
}
```

{Try it}(sh .guides/bg.sh javac code/strings/CompareTo.java java -cp code/strings/ CompareTo 1)

|||challenge
## What happens if you:
* Change `string2` to `"apple"`?
* Change `string2` to `"10"`?
* Change `string1` to `"2"` in your current code?

|||

{Try it}(sh .guides/bg.sh javac code/strings/CompareTo.java java -cp code/strings/ CompareTo 2)

## Why Does "10" Come Before "2"?

When Java compares strings lexicographically, it compares each character of the strings one by one from left to right. Since the first character in `10` is `1`, and `1` comes before `2`, `10` is considered to come before `2` even though numerically `2` is supposed to come first. 

```java
String string1 = "123";
String string2 = "9";

if (string1.compareTo(string2) < 0) {
  System.out.println("string1 comes first");
}
else if (string1.compareTo(string2) > 0) {
  System.out.println("string2 comes first");
}
else {
  System.out.println("the strings are equal");
}
```

{Try it}(sh .guides/bg.sh javac code/strings/CompareTo.java java -cp code/strings/ CompareTo 3)

|||challenge
## What happens if you:
* Change `string1` to `"apple"`?
* Change `string2` to `"Apple"` in your current code?
* Change `string1` to an empty string `""` in your current  code?

|||

{Try it}(sh .guides/bg.sh javac code/strings/CompareTo.java java -cp code/strings/ CompareTo 4)

## Letters vs. Numbers vs. Empty Strings
Lexicographically speaking, empty strings always come first, followed by numbers, then uppercase letters, and finally lowercase letters.

{Check It!|assessment}(multiple-choice-539043705)
