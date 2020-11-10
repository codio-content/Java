---

## 2D Array Access
To access and modify elements inside a 2D array, you need to  specific the *row* and *column* indices at which the elements are located. For example `names[1][2]` refers to the element that's at row index 1 and column index 2.

![.guides/img/2DArray](.guides/img/2DArray.png)

Below is a code block showcasing a 2D array that contains fifteen P.O. Box names from a postal office. Note that you can use the **initializer list** method to populate elements inside your 2D array. Each *column* array is separated by curly braces `{}` as well as a comma `,`.
```java
String[][] names = { {"Alan", "Bob", "Carol", "David", "Ellen"},
                     {"Fred", "Grace", "Henry", "Ian", "Jen"},
                     {"Kelly", "Liam", "Mary", "Nancy", "Owen"} };
    
System.out.println(names[1][2]);
```

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayAccessMod.java java -cp code/arrays/ TwoDArrayAccessMod 1)

[Code Visualizer](open_tutor code/arrays/TwoDArrayAccessMod.java)

|||challenge
## What happens if you:
* change `names[1][2]` within the print statement from above to `names[2][1]`?
* change `names[1][2]` within the print statement from above to `names[3][0]`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayAccessMod.java java -cp code/arrays/ TwoDArrayAccessMod 2)

[Code Visualizer](open_tutor code/arrays/TwoDArrayAccessMod.java)

|||important
## IMPORTANT
Note that you will still get an `ArrayIndexOutOfBoundsException` error if you attempt to access or modify an element at a row or column index that does not exist. Like arrays, you cannot add additional rows or columns of elements to the 2D array after it has been initialized.
|||

## 2D Array Modification
To modify elements within a 2D array, simply access the element and assign another element to it.

```java
String[][] names = { {"Alan", "Bob", "Carol", "David", "Ellen"},
                     {"Fred", "Grace", "Henry", "Ian", "Jen"},
                     {"Kelly", "Liam", "Mary", "Nancy", "Owen"} };
    
System.out.println(names[1][2]);

names[1][2] = "Harry";
System.out.println(names[1][2]);
```

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayAccessMod.java java -cp code/arrays/ TwoDArrayAccessMod 3)

[Code Visualizer](open_tutor code/arrays/TwoDArrayAccessMod.java)

|||challenge
## What happens if you:
* change all `names[1][2]` within the code above to `names[0][0]`?
* change `"Harry"` in the code above to `"Amy"`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/TwoDArrayAccessMod.java java -cp code/arrays/ TwoDArrayAccessMod 4)

[Code Visualizer](open_tutor code/arrays/TwoDArrayAccessMod.java)

{Check It!|assessment}(multiple-choice-3279998998)
