---

## Iterating ArrayList Elements
Iterating through an ArrayList is very similar to iterating through an array. The main difference is that in an ArrayList, we use `get()` to access the elements instead of brackets `[]`. Both of the code blocks below use a regular `for` to produce the exact same results. The first code block contains an array and the second contains an ArrayList.

```java
//iterating through an array
int[] grades = {85, 95, 48, 100, 92};

for (int i = 0; i < grades.length; i++) {
  System.out.println(grades[i]);
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListIterate.java java -cp code/arrays/ ArrayListIterate 1)

```java
//iterating through an ArrayList
ArrayList<Integer> grades = new ArrayList<Integer>();
grades.add(85);
grades.add(95);
grades.add(48);
grades.add(100);
grades.add(92);

for (int i = 0; i < grades.size(); i++) {
  System.out.println(grades.get(i));
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListIterate.java java -cp code/arrays/ ArrayListIterate 2)

## Enhanced For Loop in ArrayList
We can also use an **enhanced for loop** to iterate through an ArrayList.

```java
//iterating an ArrayList with Enhanced For Loop
ArrayList<Integer> grades = new ArrayList<Integer>();
grades.add(85);
grades.add(95);
grades.add(48);
grades.add(100);
grades.add(92);

for (Integer i : grades) { //Integer is required instead of int!
  System.out.println(i);
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListIterate.java java -cp code/arrays/ ArrayListIterate 3)

|||important
## IMPORTANT
When using an enhanced `for` loop for an ArrayList, you must label the iterating variable accordingly. Remember that ArrayLists use `Integer`, `Double`, and `Boolean` instead of `int`, `double`, and `boolean`. Only `String` is consistently labeled between ArrayLists and arrays. Therefore, `for (Integer i : grades)` is required instead of `for (int i : grades)`.
|||

{Check It!|assessment}(fill-in-the-blanks-1411510745)
