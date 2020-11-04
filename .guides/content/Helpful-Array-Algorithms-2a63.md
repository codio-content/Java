---

## Array Algorithms
In addition to being used with loops, arrays can also be used with conditionals to help with tasks such as searching for a particular element, finding a minimum or maximum element, or printing elements in reverse order.

### Searching for a Particular Element
```java
String[] cars = {"Corolla", "Camry", "Prius", "RAV4", "Highlander"};
String Camry = "A Camry is not available."; //default String value

for (String s : cars) { //enhanced for loop
  if (s.equals("Camry")) { //if "Camry" is in array
    Camry = "A Camry is available."; //variable changes if "Camry" exists
  }
}
    
System.out.println(Camry); //print whether Camry exists or not
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAlgorithms.java java -cp code/arrays/ ArrayAlgorithms 1)

[Code Visualizer](open_tutor code/arrays/ArrayAlgorithms.java)

|||challenge
## What happens if you:
* delete `"Camry"` from the `cars` array?
* try to modify the code above so that the algorithm will look for `Prius` in the array and will print `A Prius is available.` if `Prius` is an element and `A Prius is not available.` if it is not an element.

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAlgorithms.java java -cp code/arrays/ ArrayAlgorithms 2)

[Code Visualizer](open_tutor code/arrays/ArrayAlgorithms.java)

<table><tbody ><tr><td><details><summary>
	<b>Sample Solution</b>
</summary>
  
```java
String[] cars = {"Corolla", "Camry", "Prius", "RAV4", "Highlander"};
String Prius = "A Prius is not available.";

for (String s : cars) {
  if (s.equals("Prius")) {
    Prius = "A Prius is available.";
  }
}
    
System.out.println(Prius); 
```

</details></td></tr></tbody>
</table>

### Finding a Minimum or Maximum Value
```java
int[] grades = {72, 84, 63, 55, 98};
int min = grades[0]; //set min to the first element in the array

for (int i : grades) { //enhanced for loop
  if (i < min) { //if element is less than min
    min = i; //set min to element that is less
  }
}
//elements are not modified so enhanced for loop can be used

System.out.println("The lowest grade is " + min); //print lowest element
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAlgorithms.java java -cp code/arrays/ ArrayAlgorithms 3)

[Code Visualizer](open_tutor code/arrays/ArrayAlgorithms.java)

|||challenge
## What happens if you:
* replace `72` in the int array with `42`?
* try to modify the code so that the algorithm will look for the **maximum** element instead?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAlgorithms.java java -cp code/arrays/ ArrayAlgorithms 4)

[Code Visualizer](open_tutor code/arrays/ArrayAlgorithms.java)

<table><tbody ><tr><td><details><summary>
	<b>Sample Solution</b>
</summary>
  
```java
int[] grades = {72, 84, 63, 55, 98};
int max = grades[0];

for (int i : grades) {
  if (i > max) {
    max = i;
  }
}

System.out.println("The highest grade is " + max);
```

</details></td></tr></tbody>
</table>

### Printing Elements in Reverse Order
```java
String[] letters = {"A", "B", "C", "D", "E"};

//start at index 4, then decrement by 1 until i < 0, then stop
for (int i = letters[letters.length] - 1; i >= 0; i--) {
  System.out.println(letters[i]);
}

//regular for loop needed to access each element index
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayAlgorithms.java java -cp code/arrays/ ArrayAlgorithms 5)

[Code Visualizer](open_tutor code/arrays/ArrayAlgorithms.java)

{Check It!|assessment}(fill-in-the-blanks-1047073280)
