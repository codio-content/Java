---

## Tutorial Lab 2: Using an ArrayList
An ArrayList is another data structure that has many of the same functionalities as an array. Though ArrayLists cannot be initialized at the same time as they are created, they are flexible in the methods that they are able to use. These methods include adding and removing elements within the ArrayList, meaning ArrayLists can **dynamically** change their size, something arrays cannot do. Copy the code below into the text editor on the left. Then click on the `TRY IT` button to see the resulting output.

```java
ArrayList<String> veggies = new ArrayList<String>();
veggies.add("carrot");
veggies.add("tomato");
veggies.add("celery");
veggies.add("spinach");

veggies.remove(1);
veggies.set(1, "potato");

for (String s : veggies) {
  System.out.println(s);
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/LabArrayList.java java -cp code/arrays/ LabArrayList 1)

### Program Summary
1. An ArrayList called `veggies` is created.
1. `carrot`, `tomato`, `celery`, and `spinach` are added to the ArrayList as elements.
1. The element at index 1 (`tomato`) is removed.
1. The element `potato` replaces the element at index 1, which is currently `celery` since `tomato` was deleted previously.
1. An enhanced `for` loop is used which creates a String iterating variable `s` to take on the value of each element.
1. Each element `s` is then printed with a newline.

{Check It!|assessment}(multiple-choice-2271749750)
