----------

## Alternative Parameter Types

Method parameters do not necessarily need to belong to one of the four commonly used data types (`int`, `String`, `double`, `boolean`). In fact, parameters can be arrays/ArrayLists and even objects. For now, we will not focus on objects, which will be covered in a future module.

```java
/**
 * This method prints all values of an array
 * 
 * @param array A string array
 */
public static void printArray(String[] array) {
  for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
  }
}

public static void main(String args[]) {
  String[] names = {"Alan", "Bob", "Carol"};
  printArray(names);
}
```

{Try it}(sh .guides/bg.sh javac code/methods/AltParameters.java java -cp code/methods/ AltParameters 1)

|||challenge
## What happens if you:
* Change the method parameter from `String[] array` to `String array[]`?
* Change the variable `String[] names` to `String[] names = new String[3];`?
* Add `names[0] = "Alan";` to the line below `String[] names = new String[3];`?

|||

{Try it}(sh .guides/bg.sh javac code/methods/AltParameters.java java -cp code/methods/ AltParameters 2)

{Check It!|assessment}(parsons-puzzle-1860665674)
