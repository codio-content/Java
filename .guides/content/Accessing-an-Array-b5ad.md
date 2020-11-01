---

## Array Access
To access and print array elements, you need to know their position. The position at which an element is stored is called its **index**. For example, `numbers[0]` refers to the first element in the array called `numbers`. Array indices always start at `0` and increment by 1 with each element that comes next. Due to this, `numbers[4]` refers to the *fifth* element in the array, *not* the fourth.

```java
int[] numbers = {1, 2, 3, 4, 5};

System.out.println(numbers[0]);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAccess.java java -cp code/arrays/ ArrayAccess 1)

[Code Visualizer](open_tutor code/arrays/ArrayAccess.java)

|||challenge
## What happens if you:
* Change `numbers[0]` in the code above to `numbers[2]`?
* Change `numbers[0]` in the code above to `numbers[3]`?
* Change `numbers[0]` in the code above to `numbers`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAccess.java java -cp code/arrays/ ArrayAccess 2)

[Code Visualizer](open_tutor code/arrays/ArrayAccess.java)

|||important
## IMPORTANT
You may have noticed that printing the `numbers` array without specifying an index resulted in an output that starts with `[I@`... This occurs because printing an array actually prints its memory location, not its elements. You'll learn how to print all elements in an array without having to specify all of their indices on a later page.
|||

## Default "New" Elements
When using the *new* method to create an array, there are default values that populate as elements inside of the array, depending on the array type. For example, `String[] words = new String[5]` will result in *five* `null` elements and `int[] numbers = new int[5]` will populate *five* elements of `0`s within the array. Below is a table showing the default values of different array types when the "new" method is used.

| Data Type      | Default Value |
| -------------- | ------------- |
| String         | null          |
| int            | 0             |
| double         | 0.0           |
| boolean        | false         |

```java
double[] decimals = new double[2];
boolean[] bools = new boolean[2];

System.out.println(decimals[0]);
System.out.println(bools[0]);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAccess.java java -cp code/arrays/ ArrayAccess 3)

[Code Visualizer](open_tutor code/arrays/ArrayAccess.java)

|||challenge
## What happens if you:
* Change `decimals[0]` in the code above to `decimals[1]`?
* Change `bools[0]` in the code above to `bools[1]`?
* Change `decimals[0]` in the code above to `decimals[2]`?
* Change `bools[0]` in the code above to `bools[2]`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAccess.java java -cp code/arrays/ ArrayAccess 4)

[Code Visualizer](open_tutor code/arrays/ArrayAccess.java)

## IndexOutOfBounds Error
A common error that occurs is called the `ArrayIndexOutOfBoundsException` error. This happens when you try to access or print an element at an index that does not exist within the array. In the example above, `decimals[2]` and `bools[2]` both resulted in an `ArrayIndexOutOfBoundsException` because neither array has an index of `2`. Both arrays have only indices `[0]` and `[1]` to hold their elements.

![.guides/img/ArrayException](.guides/img/ArrayException.png)

{Check It!|assessment}(fill-in-the-blanks-3807028898)
