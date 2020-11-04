---

## Getting ArrayList Elements
To get or access ArrayList elements, use the `get()` method and include the index as a parameter inside parentheses `()`.

```java
ArrayList<String> contact = new ArrayList<String>();
contact.add("First name");
contact.add("Last name");
contact.add("Phone number");

System.out.println(contact.get(0)); //gets element at index 0 and prints
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListGetSet.java java -cp code/arrays/ ArrayListGetSet 1)

[Code Visualizer](open_tutor code/arrays/ArrayListGetSet.java)

|||challenge
## What happens if you:
* change `contact.get(0)` in the code above to `contact.get(1)`?
* change `contact.get(0)` in the code above to `contact.get(2)`?
* change `contact.get(0)` in the code above to `contact.get(3)`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListGetSet.java java -cp code/arrays/ ArrayListGetSet 2)

[Code Visualizer](open_tutor code/arrays/ArrayListGetSet.java)

## Setting ArrayList Elements
To set or modify ArrayList elements, use the `set()` method which includes two parameters within parentheses `()`. The first parameter specifies the ArrayList index and the second parameter specifies the element that will replace the current value at the index. For example, `contact.set(2, "Email")` will modify the element at index 2 and change it to `Email`.

```java
ArrayList<String> contact = new ArrayList<String>();
contact.add("First name");
contact.add("Last name");
contact.add("Phone number");
System.out.println(contact);

contact.set(2, "Email"); //change element at index 2 to "Email"
System.out.println(contact);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListGetSet.java java -cp code/arrays/ ArrayListGetSet 3)

[Code Visualizer](open_tutor code/arrays/ArrayListGetSet.java)

|||challenge
## What happens if you:
* add `contact.set(0, "Full name");` to the line directly before `contact.set(2, "Email");`?
* change `contact.set(2, "Email");` in the code above to `contact.set(1, "Address");`?
* change `contact.set(2, "Email");` in the code above to `contact.set(3, "Alternative name");`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayListGetSet.java java -cp code/arrays/ ArrayListGetSet 4)

[Code Visualizer](open_tutor code/arrays/ArrayListGetSet.java)

|||important
## IMPORTANT
Both `get()` and `set()` methods require that the ArrayList already has an element that exists at the specified index. Otherwise, the `IndexOutOfBoundsException` error will occur.
|||

{Check It!|assessment}(parsons-puzzle-1250261069)
