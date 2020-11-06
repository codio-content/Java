---

## An Array Inside Another Array
An array inside another array is called a **2D array**. A 2D arrays is symbolic of a table where there are rows and columns. The first index number represents the **row** position and the second index number represents the **column** position. Together, the row and column indices enable elements to be stored at specific locations.

![.guides/img/2DArray](.guides/img/2DArray.png)

```java
String[][] names = new String[3][5];
```

[Code Visualizer](open_tutor code/arrays/TwoDArrayCreate.java)

### 2D Array Syntax
* array type followed by **two** empty brackets `[][]` followed by a name for the 2D array.
* The `=` operator followed by the keyword `new` followed by the array type and two brackets `[][]`.
* The number of **rows** goes inside the **first** bracket and the number of **columns** goes inside the **second** bracket.

## Why Array Inside Array?
The way 2D arrays store elements is a little unique. Rather than creating an actual table like shown above, each initial *row* of the 2D array actually refers to another *column* array. This is why a 2D array is considered to be *an array inside of another array*.

![.guides/img/2DArrayReference](.guides/img/2DArrayReference.png)

To determine the number of rows and columns in the 2D array, we can use the instance variable `length` like we did for arrays.

```java
String[][] names = new String[3][5];

System.out.println(names.length + " rows");
System.out.println(names[0].length + " columns");
```

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayCreate.java java -cp code/arrays/ TwoDArrayCreate 1)

[Code Visualizer](open_tutor code/arrays/TwoDArrayCreate.java)

|||important
## IMPORTANT
Note that when determining column length, you must refer to the 2D array's initial row index. For example, `names.length[0]` will calculate how many elements are inside row index 0 and these elements determine how many *columns* there are in the row.
|||

{Check It!|assessment}(multiple-choice-579717952)
