---

## Tutorial Lab 1: Using a 2D Array
An array is a data structure that groups elements together into a collection of data. Each element has its own **index** or position within the array. These elements can be initialized, accessed, modified, and printed. Copy the code below into the text editor on the left. Then click on the `TRY IT` button to see the resulting output and ++Code Visualizer++ link underneath to see how the program runs line by line.

```java
int[][] coordinates = { {-4, 3},
                        {2, 1},
                        {0, -8},
                        {-11, 9},
                        {-5, -7} };
                        
for (int i = 0; i < coordinates.length; i++) {
  for (int j = 0; j < coordinates[0].length; i++) {
    if (j == 1) {
      System.out.println(coordinates[i][j]);
    }
    else {
      System.out.print(coordinates[i][i] + " ");
    }
  }
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/LabTwoDArray.java java -cp code/arrays/ LabTwoDArray 1)

[Code Visualizer](open_tutor code/arrays/LabTwoDArray.java)

