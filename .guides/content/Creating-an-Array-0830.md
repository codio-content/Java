## What Is an Array?
An **array** is a data structure that stores a collection of data such as ints, doubles, Strings, etc. This data is often referred to as the array's **elements**. Being able to store elements into an array helps reduce the amount of time needed to declare and initialize variables. For example, if you wanted to store the names of all family members in your household, you would typically have to declare and initialize String variables and values for each family member. Copy the code below into the text editor on the left and then click the `TRY IT` button to see the output. You can also click on the ++Code Visualizer++ link underneath to see how the program runs behind the scenes.

```java
String a = "Alan";
String b = "Bob";
String c = "Carol";
String d = "David";
String e = "Ellen";

System.out.println(a);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayCreate.java java -cp code/arrays/ ArrayCreate 1)

[Code Visualizer](open_tutor code/arrays/ArrayCreate.java)

|||challenge
## What happens if you:
* Change the `a` in `System.out.println(a)` to `b`, `c`, `d`, or `e`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayCreate.java java -cp code/arrays/ ArrayCreate 2)

[Code Visualizer](open_tutor code/arrays/ArrayCreate.java)

## Array Creation
To avoid the repetitive task of declaring and initializing multiple variables, you can declare an array and directly assign values or elements into that array like below. This technique is referred to as the **initializer list** method.

```java
String[] names = {"Alan", "Bob", "Carol", "David", "Ellen"};
```

[Code Visualizer](open_tutor code/arrays/ArrayCreate.java)

### "Initializer List" Method Syntax:
* Specify the data type that the array will store (i.e. `String`) followed by empty brackets `[]`.
* Declare the variable name for the array (i.e. `names`) followed by the assignment symbol `=`.
* Elements assigned to the array are separated by commas `,` and enclosed within curly braces `{}`.

<details><summary><b>Additional information</b></summary>If you used the Code Visualizer, you'll notice that the array variable <code>names</code> points to all of the elements as a collection. An array is considered to be an <b>object</b> that bundles all of the data that it holds.<img src=".guides/img/ArrayInitializerList.png"/></details><br>

Alternatively, you can create an array using the **new** method in which you will need to declare and specify the array variable and length before you can assign elements to the array.

```java
String[] names = new String[5];
```

[Code Visualizer](open_tutor code/arrays/ArrayCreate.java)

### "New" Method Syntax
* Specify the data type that the array will store (i.e. `String`) followed by empty brackets `[]`.
* Declare the variable name for the array (i.e. `names`) followed by the assignment symbol `=`.
* Declare the keyword `new` followed by the data type (i.e. `String`) and number of elements in brackets (i.e. `[5]`).

<details><summary><b>Additional information</b></summary>If you used the Code Visualizer, you'll notice that the array variable <code>names</code> points to all of the elements as a collection. An array is considered to be an <b>object</b> that bundles all of the data that it holds.<img src=".guides/img/ArrayInitializerList.png"/></details><br>

Both the **initializer list** and **new** methods mentioned above will store five elements in the array called `names`.