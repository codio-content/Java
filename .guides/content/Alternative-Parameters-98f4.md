----------

## Alternative Parameter Types

Method parameters do not necessarily need to belong to one of the four commonly used data types (`int`, `String`, `double`, `boolean`). In fact, parameters can be arrays/ArrayLists and even objects. For now, we will not focus on objects, which will be covered in a future module.

```java
/**
 * This method prints all values of an array
 * 
 * @param arr is an array of strings
 */
public static void printArray(String[] arr) {
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
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
* Change the method parameter from `String[] arr` to `String array[]`?
* Change the variable `String[] names` to `String[] names = new String[3];`?
<details>
  <summary><strong>Explanation</strong></summary>
  The variable <code>names</code> is an array of three strings. However, no values have been given for each of the elements in the array. Java uses <code>null</code> as a placeholder until a value is given. That is why <code>null</code> is printed three times.
</details><br>

* Add `names[0] = "Alan";` to the line below `String[] names = new String[3];`?
```java
String[] names = new String[3];
names[0] = "Alan";
```
<details>
  <summary><strong>Explanation</strong></summary>
  The array <code>names</code> is initialized with no values. Then the first element is given the value <code>"Alan"</code>. That is why the program prints <code>Alan</code> followed by <code>null</code> two times.
</details>

|||

{Try it}(sh .guides/bg.sh javac code/methods/AltParameters.java java -cp code/methods/ AltParameters 2)

{Check It!|assessment}(parsons-puzzle-1860665674)
