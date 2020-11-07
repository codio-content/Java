---

## Tutorial Lab 1: Using a 2D Array
A 2D array is an array inside another array. This data structure can be visually compared to a table where there are rows and columns and each element exists inside each "cell." To access or modify elements, both the row index and column index are needed. Like arrays, 2D arrays are **static** so elements cannot be added or removed after initialization.

```java
int[][] coordinates = { {-4, 3},
                        {2, 1},
                        {0, -8},
                        {-11, 9},
                        {-5, -7} };
                        
for (int i = 0; i < coordinates.length; i++) {
  for (int j = 0; j < coordinates[0].length; j++) {
    if (j == 1) {
      System.out.println(coordinates[i][j]);
    }
    else {
      System.out.print(coordinates[i][j] + " ");
    }
  }
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/LabTwoDArray.java java -cp code/arrays/ LabTwoDArray 1)

[Code Visualizer](open_tutor code/arrays/LabTwoDArray.java)

{Check It!|assessment}(multiple-choice-1121497759)
