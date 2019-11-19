----------

## Subtraction

```java
int a = 10;
int b = 3;
int c = a - b;
System.out.println(c);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundSubtraction.java java -cp code/operators/ PlaygroundSubtraction 1 )

|||challenge
## What happens if you:
* Change `b` to `-3`?
* Change `c` to `c = a - -b`?
* Change `b` to `3.0`?

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundSubtraction.java java -cp code/operators/ PlaygroundSubtraction 2 )

## The `--` and `-=` Operators
Decrementing is the opposite of incrementing. Just like you can increment with `++`, you can decrement using `--`.

```java
int a = 10;
a--;
System.out.println(a);
```

Like `+=`, there is a shorthand for decrementing a variable - `-=`.

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundSubtraction.java java -cp code/operators/ PlaygroundSubtraction 3 )



## Subtraction and Strings
You might be able to concatenate strings with the `+` operator, but you cannot use the `-` operator with them.

```java
String a = "one two three";
String b = "one";
String c = a - b;
System.out.println(c);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundSubtraction.java java -cp code/operators/ PlaygroundSubtraction 4 )

{Check It!|assessment}(fill-in-the-blanks-436876892)

