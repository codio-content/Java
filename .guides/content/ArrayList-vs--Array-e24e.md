---

## ArrayList vs. Array
Which one is better: ArrayList or array? The answer is, it really *depends*. If you know how many elements you need in your collection and you don't intend on changing the order of those elements, then it is better to use an **array**. On the other hand, if you don't know how many elements you need and want to modify the order of elements later on, then it is better to use an **ArrayList**.

Although an array is shorter to write and arguably easier to use, it is **static**, meaning it is not possible to add additional elements to the array after it has already been initialized. In contrast, an ArrayList is more **dyanamic**, meaning you can add, remove, and reorganize elements as needed later on.

Here is a table showing the differences between ArrayLists and arrays. Note that uppercase `Type` stands for compatible *ArrayList* types while lowercase `type` stands for compatible *array* types. Also note that `var` stands for ArrayList or array name, `num` stands for an integer number, `index` stands for index or position number, and `element` stands for an ArrayList or array element.

| Method/Types              | ArrayList                 | Array                     |
| ------------------------- | ------------------------- | ------------------------- |
| Create | ArrayList&lt;`Type`&gt; `var` = new ArrayList&lt;`Type`&gt;() | `type`[] `var` = new `type`[`num`] or `type`[] `var` = {`element`, `element`...} |
| Find number of elements   | size()                    | length                    |
| Access an element         | `var`.get(`index`)        | `var`[`index`] |
| Modify and element        | `var`.set(`index`, `element`) | `var`[`index`] = `element` |
| Add an element            | `var`.add(`element`) or `var`.add(`index`, `element`) | n/a |
| Remove an element         | `var`.remove(`index`)     | n/a |
| for loop                  | for (int i = 0; i < `var`.size(); i++) {System.out.println(`var`.get(i));} | for (int i = 0; i < `var`.length; i++) {System.out.println(`var`[i]);} |
| Enhanced for loop         | for (`Type` i : `var`) {System.out.println(i)} | for (`type` i : `var`) {System.out.println(i)} |
| Common compatible types   | Integer, Double, Boolean, Strings | int, double, boolean, Strings |

## Using Both an ArrayList and Array
ArrayLists and arrays can be used in tandem with each other. For example, the following code keeps track of the top five students in a class.
```java
String[] top = {"First: ", "Second: ", "Third: ", "Fourth: ", "Fifth: "};
ArrayList<String> names = new ArrayList<String>();

names.add("Alan");
names.add("Bob");
names.add("Carol");
names.add("David");
names.add("Ellen");

for (int i = 0; i < 5; i++) {
  System.out.println(top[i] + names.get(i));
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListArray.java java -cp code/arrays/ ArrayListArray 1)

[Code Visualizer](open_tutor code/arrays/ArrayListArray.java)

|||challenge
## Without deleting any existing code, try to:
* switch `Alan` and `Carol`'s places.
* replace `David` with `Fred`.
* make `Grace` get "Fifth" place and remove `Ellen` from the list.

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListArray.java java -cp code/arrays/ ArrayListArray 2)

[Code Visualizer](open_tutor code/arrays/ArrayListArray.java)

<table><tbody ><tr><td><details><summary>
	<b>Sample Solution</b>
</summary>
  
```java
String[] top = {"First: ", "Second: ", "Third: ", "Fourth: ", "Fifth: "};
ArrayList<String> names = new ArrayList<String>();

names.add("Alan");
names.add("Bob");
names.add("Carol");
names.add("David");
names.add("Ellen");
  
names.set(0, "Carol"); //switch Alan with Carol
names.set(2, "Alan");  //and vice versa

names.set(3, "Fred"); //Fred replaces David
  
names.add(4, "Grace"); //Grace takes Ellen's place
names.remove(5); //Ellen's "Sixth" place gets removed

for (int i = 0; i < 5; i++) {
  System.out.println(top[i] + names.get(i));
}
```

</details></td></tr></tbody>
</table>
  
{Check It!|assessment}(fill-in-the-blanks-298729376)
