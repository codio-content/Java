----------

## Incrementing Variables
Incrementing a variable means to change the value of a variable by a set amount. You will most often have a counting variable, which means you will increment by 1.

```java
int a = 0;
a = a + 1;
System.out.print(a);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundIncrement.java java -cp code/operators/ PlaygroundIncrement 1 )

## How to Read `a = a + 1`
The variable `a` appears twice on the same line of code. But each instance of `a` refers to something different.

![How to Read a = a + 1](.guides/img/increment.png)

## The `++` and `+=` Operators
Incrementing is a common task for programmers. Many programming languages have developed a shorthand for `a = a + 1` because of this. `a ++` does the same thing as `a = a + 1`.

```java
int a = 0;
int b = 0;
a = a + 1;
b++;
System.out.println(a);
System.out.println(b);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundIncrement.java java -cp code/operators/ PlaygroundIncrement 2 )

In the cases you need to increment by a different number, you can specify it using the `+=` operator. You can replace `b++;` with `b+=1;` in the above code and get the same result.

|||challenge
## What happens if you:
* Change `b` such that `b += 2`?
* Change `b` such that `b += -1`?
* Change `b` such that `b -= 1`?

|||

Incrementing is a common task for programmers. Many programming languages have developed a shorthand for `a = a + 1` because of this. `a ++` does the same thing as `a = a + 1`.

```java
int a = 0;
int b = 0;
a = a + 1;
b++;
System.out.println(a);
System.out.println(b);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundIncrement.java java -cp code/operators/ PlaygroundIncrement 3 )

{Check It!|assessment}(fill-in-the-blanks-3212025220)

