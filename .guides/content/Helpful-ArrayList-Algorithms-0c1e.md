---

## ArrayList Algorithms
Like arrays, ArrayLists can be used to search for a particular element and to find a minimum or maximum element. Additionally, ArrayLists can reverse the order of elements rather than just simply printing the elements in reverse order.

### Searching for a Particular Element
```java
ArrayList<String> cars = new ArrayList<String>();
String Camry = "A Camry is not available."; //default String value

cars.add("Corolla");
cars.add("Camry");
cars.add("Prius");
cars.add("RAV4");
cars.add("Highlander");

for (String s : cars) { //enhanced for loop
  if (s.equals("Camry")) { //if "Camry" is in ArrayList
    Camry = "A Camry is available."; //variable changes if "Camry" exists
  }
}
    
System.out.println(Camry); //print whether Camry exists or not
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAlgorithms.java java -cp code/arrays/ ArrayListAlgorithms 1)

[Code Visualizer](open_tutor code/arrays/ArrayListAlgorithms.java)

|||challenge
## What happens if you:
* add `cars.remove(1);` to the line directly below `cars.add("Highlander");`?
* try to modify the code above so that the algorithm will look for `Prius` in the array and will print `A Prius is available.` if `Prius` is an element and `A Prius is not available.` if it is not an element.

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAlgorithms.java java -cp code/arrays/ ArrayListAlgorithms 2)

[Code Visualizer](open_tutor code/arrays/ArrayListAlgorithms.java)

<table><tbody ><tr><td><details><summary>
	<b>Sample Solution</b>
</summary>
  
```java
ArrayList<String> cars = new ArrayList<String>();
String Prius = "A Prius is not available.";
  
cars.add("Corolla");
cars.add("Camry");
cars.add("Prius");
cars.add("RAV4");
cars.add("Highlander");

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
ArrayList<Integer> grades = new ArrayList<Integer>();
grades.add(72);
grades.add(84);
grades.add(63);
grades.add(55);
grades.add(98);

int min = grades.get(0); //set min to the first element in the array

for (int i : grades) { //enhanced for loop
  if (i < min) { //if element is less than min
    min = i; //set min to element that is less
  }
}
//elements are not modified so enhanced for loop can be used

System.out.println("The lowest grade is " + min); //print lowest element
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAlgorithms.java java -cp code/arrays/ ArrayListAlgorithms 3)

[Code Visualizer](open_tutor code/arrays/ArrayListAlgorithms.java)

|||challenge
## What happens if you:
* add `grades.set(0, 42);` to the line directly below `grades.add(98);`?
* try to modify the code so that the algorithm will look for the **maximum** element instead?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAlgorithms.java java -cp code/arrays/ ArrayListAlgorithms 4)

[Code Visualizer](open_tutor code/arrays/ArrayListAlgorithms.java)

<table><tbody ><tr><td><details><summary>
	<b>Sample Solution</b>
</summary>
  
```java
ArrayList<Integer> grades = new ArrayList<Integer>();
grades.add(72);
grades.add(84);
grades.add(63);
grades.add(55);
grades.add(98);
  
int max = grades.get(0);

for (int i : grades) {
  if (i > max) {
    max = i;
  }
}

System.out.println("The highest grade is " + max);
```

</details></td></tr></tbody>
</table>

### Reversing the Order of Elements
```java
ArrayList<String> letters = new ArrayList<String>();
letters.add("A");
letters.add("B");
letters.add("C");
letters.add("D");
letters.add("E");
    
int original = letters.size(); //original size
    
//regular for loops needed to access element indices

for (int i = letters.size() - 1; i >= 0; i--) {
  letters.add(letters.get(i));
} //add elements in reverse order to the ArrayList
    
for (int j = 0; j < original; j++) {
  letters.remove(0);
} //remove all the original elements

System.out.println(letters); //print new ArrayList
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListAlgorithms.java java -cp code/arrays/ ArrayListAlgorithms 5)

[Code Visualizer](open_tutor code/arrays/ArrayListAlgorithms.java)

|||important
## IMPORTANT
Note that we used `letters.remove(0)` rather than `letters.remove(j)` in the code above because `remove()` deletes both the **element** and the **index**. Thus, the next element in the ArrayList becomes the *new* 0th index which we want to continue to delete.
|||

{Check It!|assessment}(fill-in-the-blanks-3501560183)
