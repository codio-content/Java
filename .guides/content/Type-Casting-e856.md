----------

## Type Casting
Type casting (or type conversion) is when you change the data type of a variable.

```java
int numerator = 40;
int denominator = 25;
System.out.println( numerator / denominator);
System.out.println( (double) numerator / denominator);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundCasting.java java -cp code/operators/ PlaygroundCasting 1 )

`numerator` and `denominator` are integers, but `(double)` converts `numerator` into a double.

|||challenge
## What happens if you:
* Cast only `denominator` to a double?
* Cast both `numerator` and `denominator` to a double?
* Cast the result to a double (i.e. `(double)(numerator / denominator)`)?

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundCasting.java java -cp code/operators/ PlaygroundCasting 2 )

<details><summary><b>More Info</b></summary>If either or both numbers in Java division are a <code>double</code>, then <code>double</code> division will occur. In the last example, numerator and denominator are both <code>int</code> when the division takes place - then the integer division result is converted to a double. </details>

## Parsing Strings
Do you know why the code below will not work?

```java
int a = 5;
String b = "3";
System.out.println(a + b);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundCasting.java java -cp code/operators/ PlaygroundCasting 3 )

You cannot add a string to an integer. You can convert `b` to an integer to fix the problem.

```java
int a = 5;
String b = "3";
System.out.println(a + Integer.parseInt(b));
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundCasting.java java -cp code/operators/ PlaygroundCasting 4 )

Data read from the keyboard or a file is always stored as a string. If you want to use this data, you will need to know how to convert it to the proper data type.

|||challenge
## What happens if you:
* Parse a String to a double using `Double.parseDouble()`
* Parse a String to a boolean using `Boolean.parseBoolean()`
* Convert a different type to a string with `String.valueOf()`

|||

{Check It!|assessment}(multiple-choice-2976548927)
