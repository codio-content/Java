----------

## Recursion Exercise 5

**Problem**
Write a recursive method called `getMax` that takes an array of integers as a parameter. Return the largest integer in the array.

<details>
  <summary><strong>Hint</strong></summary>
  Use the static method <code>Arrays.copyOfRange(array, start, stop)</code> to create a smaller array. <code>start</code> represents the starting index of the new array, and <code>stop</code> represents the ending element of the new array. In addition, use the <code>Math.max(int1, int2)</code> method to return the larger of two integers.
</details><br>

**Expected Output**
* The following method call would print `5`
```java
    //add code below this line
    int[] myList = {1, 2, 3, 4, 5};
    System.out.println(getMax(myList));
    //add code above this line
```

* The following method call would print `41`
```java
    //add code below this line
    int[] myList = {11, 22, 3, 41, 15};
    System.out.println(getMax(myList));
    //add code above this line
```

[Code Visualizer](open_tutor code/recursion/Exercise5.java)
{Try it}(sh .guides/bg.sh javac code/recursion/Exercise5.java java -cp code/recursion/ Exercise5 1)

