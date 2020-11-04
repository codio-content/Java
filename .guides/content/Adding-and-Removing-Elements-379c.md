---

## Adding ArrayList Elements
To add elements to the ArrayList, simply use the `add()` method. The `add()` method will add whatever element that is specified inside parentheses `()` to the end of the ArrayList by default. If an element is added to an empty ArrayList, that element will be the first and only element in the ArrayList.

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(50); //add 50 as an element to end of ArrayList

System.out.println(numbers);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAddRemove.java java -cp code/arrays/ ArrayListAddRemove 1)

[Code Visualizer](open_tutor code/arrays/ArrayListAddRemove.java)

|||challenge
## What happens if you:
* add `numbers.add(100);` directly below `numbers.add(50);`?
* add `numbers.add(12.3);` below `numbers.add(50);` but before the print statement?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAddRemove.java java -cp code/arrays/ ArrayListAddRemove 2)

[Code Visualizer](open_tutor code/arrays/ArrayListAddRemove.java)

|||important
## IMPORTANT
Much like arrays, ArrayLists can only store one type of data. For example, you cannot store `12.3` into an `Integer` ArrayList.
|||

To add an element to a *specific index* in the ArrayList, you can use the `add()` method with two parameters inside the parentheses `()`. The first parameter is the index where you want the element to be stored at and the second parameter is the element itself. For example, `numbers.add(0, 12)` will add the number `12` to index `0` causing `12` to become the first element in the ArrayList. This will cause all of the elements to the right of `12` to move up by 1 index number.

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(50);
numbers.add(100);
System.out.println(numbers);

numbers.add(0, 12); //add 12 as an element to index 0
System.out.println(numbers);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAddRemove.java java -cp code/arrays/ ArrayListAddRemove 3)

[Code Visualizer](open_tutor code/arrays/ArrayListAddRemove.java)

|||challenge
## What happens if you:
* add `numbers.add(2, 75);` directly below `numbers.add(0, 12);`?
* add `numbers.add(4, 250);` below `numbers.add(0, 12);` but before the second print statement?
* add `numbers.add(8, 320);` below `numbers.add(0, 12);` but before the second print statement?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAddRemove.java java -cp code/arrays/ ArrayListAddRemove 4)

[Code Visualizer](open_tutor code/arrays/ArrayListAddRemove.java)

|||important
## IMPORTANT
Adding `numbers.add(8, 320);` produces the familiar `IndexOutOfBoundsException` error. This occurs because the ArrayList does not contain index number `8`. However, you can add an element to the ArrayList if you specify the last available array index plus 1. For example, if the last available index is 3, then you can use `numbers.add(4, 250);` to add `250` to index 4 which did not exist previously.
|||

## Removing ArrayList Elements
To remove an element from an ArrayList, use the `remove()` method and specify the ArrayList index of the element you want to be removed as a parameter inside the parentheses `()`. Deleting an element will cause all elements to the right of that element to move down by 1 index number.

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(12);
numbers.add(50);
numbers.add(75);
numbers.add(100);
System.out.println(numbers);

numbers.remove(2); //remove element at index 2
System.out.println(numbers);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAddRemove.java java -cp code/arrays/ ArrayListAddRemove 5)

[Code Visualizer](open_tutor code/arrays/ArrayListAddRemove.java)

|||challenge
## What happens if you:
* add another `numbers.remove(2);` directly below `numbers.remove(2);`?
* add a third `numbers.remove(2);` directly below the other two `numbers.remove(2);`s?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAddRemove.java java -cp code/arrays/ ArrayListAddRemove 6)

[Code Visualizer](open_tutor code/arrays/ArrayListAddRemove.java)

{Check It!|assessment}(multiple-choice-225623719)
