---

## Tutorial Lab 1: Using an Array
An array is a data structure that groups data together into a collection of **elements**. Each element has its own **index** or position within the array. These elements can be initialized, accessed, modified, and printed. Copy the code below into the text editor on the left. Then click on the `TRY IT` button to see the resulting output and ++Code Visualizer++ link underneath to see how the program runs line by line.

```java
String[] classes = {"Math", "English", "Science", "Social Studies", "Spanish"};

classes[4] = "French";

for (int i = 0; i < classes.length; i++) {
  System.out.println(classes[i]);
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/LabArray.java java -cp code/arrays/ LabArray 1)

[Code Visualizer](open_tutor code/arrays/LabArray.java)

### Program Summary
1. An array called `classes` is created and initialized with elements (i.e. `"Math"`, `"English"`, etc.).
1. At index 4, `"Spanish"` is modified and replaced with `"French"`. Keep in mind that array indices start at `0`, not `1`.
1. A `for` loop iterates through the elements in the array. It starts at index 0, ends right before index 5, and increments by 1 after each iteration.
1. Each element from index 0 through index 4 gets printed with a newline.

{Check It!|assessment}(parsons-puzzle-3239956842)
