----------

Boolean operators are operators that return a boolean value (true or false).

## Equal To

Python uses the `==` operator to determine equality. Beginners often confuse the `=` and the `==` operators. Remember, `=` is the assignment operator.

```java
int a = 5;
int b = 5;
System.out.println(a == b);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundEquality.java java -cp code/operators/ PlaygroundEquality 1 )

|||challenge
## What happens if you:
* Change `b` to `1`?
* Change `a` to `boolean a = true;` and `b` to `1`?
* Change `b` to `boolean b = false;`?

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundEquality.java java -cp code/operators/ PlaygroundEquality 2 )

## Not Equal To

The `!=` operator checks to see if two values are not equal.

```java
int a = 5;
int b = 5;
System.out.println(a != b);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundEquality.java java -cp code/operators/ PlaygroundEquality 3 )

|||challenge
## What happens if you:
* Change `b` to `1`?
* Change `a` to `boolean a = true;` and `b` to `1`?
* Change `b` to `boolean b = false;`?

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundEquality.java java -cp code/operators/ PlaygroundEquality 4 )

{Check It!|assessment}(fill-in-the-blanks-1997792767)
