----------

## The `&&` Operator

The `&&` operator allows for compound (more than one) boolean expressions. All boolean expressions **must** be true in order for the whole thing to be true. If only one boolean expressions is false, then the whole thing is false.

```java
boolean a = true;
boolean b = true;
boolean c = false;
System.out.println(a && b);
```

<details><summary><b>How do I type `&&`?</b></summary> It is towards the top of the keyboard, above the number `7`. This means you must hold shift and press the `7` key to type `&`. </details>

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundAnd.java java -cp code/operators/ PlaygroundAnd 1)

|||challenge
## What happens if you:
* Change the code to `System.out.println(a && c);`?
* Change the code to `System.out.println(c && b);`?

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundAnd.java java -cp code/operators/ PlaygroundAnd 2)

## Multiple `&&` Statements

You can chain several `&&` statements together. They are evaluated in a left-to-right manner.

```java
boolean a = true;
boolean b = true;
boolean c = false;
System.out.println(a && b && c);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundAnd.java java -cp code/operators/ PlaygroundAnd 3)

|||challenge
## What happens if you:
* Change the code to `System.out.println(a && b && a && b && a);`?
* Change the code to `System.out.println(a && b && a && b && c);`?

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundAnd.java java -cp code/operators/ PlaygroundAnd 4)

{Check It!|assessment}(fill-in-the-blanks-2191103233)

