----------

## Declaring a Variable
Declaring a variable has two parts - setting or declaring the *data type* and the *name* of the variable. These two pieces of a variable do *not* change.

To declare a variable, type the data type and name of the variable you want to create, and `;` (semi-colon).

```java
String my_variable;
```

You will notice we are not printing anything - that is because no value has been assigned yet. The declaration step sets aside empty memory.

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundVariables6.java java -cp code/fundamentals/ PlaygroundVariables6 1 )

|||challenge
## What happens if you:
* Create two variables with the same name?
* Create two varaibles with the same name but different capitalization (ie `var` and `Var`)?
* Create two variables of different types with the same name?

|||

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundVariables6.java java -cp code/fundamentals/ PlaygroundVariables6 2 )


## Variable Naming Rules
Here are the rules for naming a variable.

|Rule|Correct|Incorrect|
|----|-------|---------|
|Start with a letter, dollar sign or underscore|`variable`, `$variable`, `_variable`|`1variable`|
|Remainder of variable name is letters, numbers, or underscores|`var_i_able`, `var1able`|`var-i-able`, `var!able`|
|Cannot use a Java keyword|`my_class`|`class`|
|Variables are case sensitive|`variable`, `Variable`, and `VARIABLE` are all different variables|

<details><summary><b>What are the Java key words?</b></summary><table><tr><td>abstract</td><td>continue</td><td>for</td><td>new</td><td>switch</td></tr><tr><td>assert</td><td>default</td><td>goto</td><td>package</td><td>synchronized</td></tr><tr><td>boolean</td><td>do</td><td>if</td><td>private</td><td>this</td></tr><tr><td>break</td><td>double</td><td>implements</td><td>protected</td><td>throw</td></tr><tr><td>byte</td><td>else</td><td>import</td><td>public</td><td>throws</td></tr><tr><td>case</td><td>enum</td><td>instanceof</td><td>return</td><td>transient</td></tr><tr><td>catch</td><td>extends</td><td>int</td><td>short</td><td>try</td></tr><tr><td>char</td><td>final</td><td>interface</td><td>static</td><td>void</td></tr><tr><td>class</td><td>finally</td><td>long</td><td>strictfp</td><td>volatile</td></tr><tr><td>const</td><td>float</td><td>native</td><td>super</td><td>while</td></tr></table></details>

{Check It!|assessment}(multiple-choice-1839186458)
