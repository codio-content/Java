----------

## String Concatenation
String concatenation is the act of combining two strings together. This is done with the `+` operator.

```java
String a = "This is an ";
String b = "example string";
String c = a + b;
System.out.println(c);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundConcatenation.java java -cp code/operators/ PlaygroundConcatenation 1 )

|||challenge
## What happens if you:
* Concatenate two strings without an extra space (i.e. `a = "This is an"`)?
* Use the `+=` operator instead of the `+` operator (i.e. `a+=b;`)?
* Add `3` to a string?
* Add `"3"` to a string?

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundConcatenation.java java -cp code/operators/ PlaygroundConcatenation 2 )

{Check It!|assessment}(parsons-puzzle-1012342029)
