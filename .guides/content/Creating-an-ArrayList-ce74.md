---

## What Is an ArrayList?
Although arrays are very useful for data collection, they are considered **static**, meaning once they are created, you cannot add or remove elements from them without changing the way they are initialized. **ArrayLists**, on the other hand, are **dynamic**, meaning you can make changes to them while the program is running. ArrayLists are particularly helpful when you don't know how large your collection of elements will become. Since ArrayLists are dynamic, you can add and remove elements later on if needed. In order to use ArrayLists, you must import it using `import java.util.ArrayList;` in the header of your program. For convenience, the program file to your left already contains the import statement.

## ArrayList Creation
To create an ArrayList, you need to include the following:
* The keyword `ArrayList` followed by the data type in angle brackets `<>`.
  * Note that unlike arrays, ArrayList types are labeled slightly differently (e.g. `Integer`, `Double`, `Boolean`, and `String`).
* A variable name that refers to the ArrayList.
* The assignment operator `=` followed by the keyword `new`.
* Another `ArrayList` keyword followed by the data type in angle brackets `<>` followed by empty parentheses `()`.

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();

System.out.println(numbers);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListCreate.java java -cp code/arrays/ ArrayListCreate 1)

[Code Visualizer](open_tutor code/arrays/ArrayListCreate.java)

|||important
## IMPORTANT
Unlike printing arrays, printing an ArrayList will output its elements instead of its memory address. When an ArrayList is initialized, it is empty by default. This is why printing a new ArrayList results in empty brackets `[]`.
|||

## Determining ArrayList Size
ArrayLists use the method `size()` to determine the number of elements that exist instead of `length` which is used for arrays. When an ArrayList is initially created, its size is automatically `0` since all new ArrayLists are empty by default.

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();

System.out.println(numbers.size());
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListCreate.java java -cp code/arrays/ ArrayListCreate 2)

[Code Visualizer](open_tutor code/arrays/ArrayListCreate.java)

{Check It!|assessment}(multiple-choice-594360288)
