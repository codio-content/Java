----------

## Recursion Exercise 2

**Problem**
Write a recursive method called `listSum` that takes an array of integers as a parameter. Return the sum of all of the integers in the array.

<details>
  <summary><strong>Hint</strong></summary>
  Use the static method <code>Arrays.copyOfRange(array, start, stop)</code> to create a smaller array. <code>start</code> represents the starting index of the new array, and <code>stop</code> represents the ending element of the new array.
</details><br>

**Expected Output**
* The following method call would print `15`
```java
    //add code below this line
    int[] myList = {1, 2, 3, 4, 5};
    System.out.println(listSum(myList));
    //add code above this line
```
* The following method call would print `39`
```java
    //add code below this line
    int[] myList = {10, 12, 10, 7};
    System.out.println(listSum(myList));
    //add code above this line
```

[Code Visualizer](open_tutor code/recursion/Exercise2.java)
{Try it}(sh .guides/bg.sh javac code/recursion/Exercise2.java java -cp code/recursion/ Exercise2 1)
