## Tutorial Lab 4: Boolean Operators

Boolean operators are those operators which will return either true or false.

|Operation|Symbol|Notes|
|---------|------|-----|
|Equal to| `==`| The `=` operator is assignment operator, not the equality operator|
|Not equal to| `!=`| |
|Less than| `<`| |
|Less than or equal to| `<=`| |
|Greater than| `>`| |
|Greater than or equal to| `>=`| |
|And | `&&` | Compares two boolean expressions. Both must be true for the whole to be true. Everything else is false.|
|Or | <code>&#124;&#124;</code> | Compares two boolean expressions. Both must be false for the whole to be false. Everything else is true.|
|Not | `!` | Returns the opposite of a boolean expression.|

Use the text editor open in the left pane, and enter the following code:

```java
System.out.println((5 > 7) && (false || 1 < 9) || 4 != 5 && ! (2 >= 3));
```

{Try it}(sh .guides/bg.sh javac code/operators/LabBoolean.java java -cp code/operators/ LabBoolean )

Below are the steps that Java talks when evaluating the code above.

### Evaluate all arithmetic operators according to PEMDAS
1) `(5 > 7) && (false || 1 < 9) || 4 != 5 && ! (2 >= 3)`
1) <code><b>false</b> && (false || 1 < 9) || 4 != 5 && ! (2 >= 3) </code>
1) <code>false && (false || <b>true</b>) || 4 != 5 && ! (2 >= 3) </code>
1) <code>false && (false || true) || <b>true</b> && ! (2 >= 3) </code>
5) <code>false && (false || true) || true && ! <b>false</b> </code>
  
### Evaluate all boolean operators (order: parenthesis, not, and, or)
6) <code>false && <b>true</b> || true && ! false </code>
7) <code>false && true || true && <b>true</b> </code>
8) <code><b>false</b> || true && true </code>
9) <code>false || <b>true</b></code>
10) <code><b>true</b></code>

{Check It!|assessment}(multiple-choice-3834665657)

