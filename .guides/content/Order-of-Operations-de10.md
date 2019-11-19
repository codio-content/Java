----------

## Order of Operations

Java uses the PEMDAS method for determining order of operations.

![PEMDAS](.guides/img/pemdas.png)

The code below should output `10.0`.

```java
int a = 2;
int b = 3;
int c = 4;
double result = 3 * a - 2 / (b + 5) + c;
System.out.println(result);
```

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundOrder.java java -cp code/operators/ PlaygroundOrder 1 )

<details><summary><b>Explanation</b></summary><ul><li>The first step is to compute `b + 5` (which is `8`) because it is surrounded by parentheses.</li><li>Next, do the multiplication and division going from left to right. `3 * a` is `6`.</li><li>`2` divided by `8` is `0` (remember, the `/` operator returns an `int` when you use two `int`s so `0.25` becomes `0`).</li><li>Next, addition and subtraction from left to right -  `6 - 0` to get `6`.</li><li>Finally, add `6` and `4` together to get `10.0`.</li></ul></details>

|||challenge
## Mental Math
* `5 + 7 - 10 * 3 /0.5`
<details><summary>Solution</summary>-48.0</details>
* `(5 * 8) - 7 % 2 - (-1 * 18)`
<details><summary>Solution</summary>57.0</details>
* `9 / 3 + (100 % 0.5) - 3`
<details><summary>Solution</summary>0.0</details>

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundOrder.java java -cp code/operators/ PlaygroundOrder 2 )

{Check It!|assessment}(multiple-choice-2569485715)