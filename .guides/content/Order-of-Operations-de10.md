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

<details><summary><b>Explanation</b></summary><ul><li>The first step is to compute <code>b + 5</code> (which is <code>8</code>) because it is surrounded by parentheses.</li><li>Next, do the multiplication and division going from left to right. <code>3 * a</code> is <code>6</code>.</li><li><code>2</code> divided by <code>8</code> is <code>0</code> (remember, the <code>/</code> operator returns an <code>int</code> when you use two <code>int</code>s so <code>0.25</code> becomes <code>0</code>).</li><li>Next, addition and subtraction from left to right -  <code>6 - 0</code> to get <code>6</code>.</li><li>Finally, add <code>6</code> and <code>4</code> together to get <code>10.0</code>.</li></ul></details>

|||challenge
## Mental Math
<code>5 + 7 - 10 * 3 /0.5</code><details><summary>Solution</summary>-48.0</details>

<code>(5 * 8) - 7 % 2 - (-1 * 18)</code><details><summary>Solution</summary>57.0</details>

<code>9 / 3 + (100 % 0.5) - 3</code><details><summary>Solution</summary>0.0</details>

|||

{Try it}(sh .guides/bg.sh javac code/operators/PlaygroundOrder.java java -cp code/operators/ PlaygroundOrder 2 )

{Check It!|assessment}(multiple-choice-2569485715)