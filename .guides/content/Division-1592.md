----------

## Division

Division in Python is done with the `/` operator

```java
double a = 25;
double b = 4;
System.out.println(a / b);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundDivision.java java -cp code/operators/ PlaygroundDivision 1 )

|||challenge
## What happens if you:
* Change `b` to `0`?
* Change `b` to `0.5`?
* Change the code to
```java
double a = 25;
double b = 4;
double a /= b;
System.out.println(a);
```

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundDivision.java java -cp code/operators/ PlaygroundDivision 2 )

<details><summary><b>Hint</b></summary><code>/=</code> works similar to <code>+=</code> and <code>-=</code></details>

## Integer Division

Normally, you use `double` in Java division since the result usually involves decimals. If you use integers, the division operator returns an `int`. This "integer division" does not round up, nor round down. It removes the decimal value from the answer.

![.guides/img/intDivision](.guides/img/intDivision.png)

```java
int a = 5;
int b = 2;
System.out.println(a / b);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundDivision.java java -cp code/operators/ PlaygroundDivision 3 )

{Check It!|assessment}(multiple-choice-3182685241)

