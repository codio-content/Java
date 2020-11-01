---

## Array Modification
To modify an element within an array, simply find the index at which that element is stored and assign a new value to it.

```java
int[] grades = {85, 95, 48, 100, 92};
System.out.println(grades[2]);

grades[2] = 88; //88 will replace 48 at index 2
System.out.println(grades[2]);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayModify.java java -cp code/arrays/ ArrayModify 1)

[Code Visualizer](open_tutor code/arrays/ArrayModify.java)

|||challenge
## What happens if you:
* Change `int[] grades = {85, 95, 48, 100, 92};` in the code above to `int[] grades = new int[5];`?
* Change all `System.out.println(grades[2]);` in the code above to `System.out.println(grades[3]);`?
* Change `grades[2] = 88;` in the code above to `grades[3] = 100;`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayModify.java java -cp code/arrays/ ArrayModify 2)

[Code Visualizer](open_tutor code/arrays/ArrayModify.java)

## Modifying Multiple Arrays
You can create and modify as many arrays as you'd like. For example, you can create an array to store your family members and another array to store their age.

```java
String[] family = {"Dad", "Mom", "Brother", "Sister"};
int[] age = new int[4];

System.out.println(family[0] + " " + age[0]);
System.out.println(family[1] + " " + age[1]);
System.out.println(family[2] + " " + age[2]);
System.out.println(family[3] + " " + age[3]);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayModify.java java -cp code/arrays/ ArrayModify 3)

[Code Visualizer](open_tutor code/arrays/ArrayModify.java)

|||challenge
## What happens if you:
* Add `age[0] = 50;` directly below the line `int[] age = new int[4];`?
* Add `age[1] = 45;` below the line `int[] age = new int[4];` but before the print statements?
* Add `age[2] = 25;` below the line `int[] age = new int[4];` but before the print statements?
* Add `age[3] = 20;` below the line `int[] age = new int[4];` but before the print statements?
* Change `"Sister"` within the String array to `"Brother2"`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayModify.java java -cp code/arrays/ ArrayModify 4)

[Code Visualizer](open_tutor code/arrays/ArrayModify.java)

|||important
## IMPORTANT
Since the integer array above was created using the *new* method, `0` was populated as elements within the array at first. Then by setting the array indices to specific values, you were able to modify the array to include the appropriate age for each family member.
|||

{Check It!|assessment}(multiple-choice-2702771590)
