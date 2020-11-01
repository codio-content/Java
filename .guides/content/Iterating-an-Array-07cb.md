---

## Array Iteration
Though we can add many elements to our array, printing each of them can get quite tedious. For example, if we have 10 names of friends in our array, we would need to specify each of their array index to print them.

```java
String[] friends = {"Alan", "Bob", "Carol", "David", "Ellen", 
                    "Fred", "Grace", "Henry", "Ian", "Jen"};

System.out.println(friends[0]);
System.out.println(friends[1]);
System.out.println(friends[2]);
System.out.println(friends[3]);
System.out.println(friends[4]);
System.out.println(friends[5]);
System.out.println(friends[6]);
System.out.println(friends[7]);
System.out.println(friends[8]);
System.out.println(friends[9]);
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayIterate.java java -cp code/arrays/ ArrayIterate 1)

[Code Visualizer](open_tutor code/arrays/ArrayIterate.java)

Luckily, we can use loops which we had learned previously to help us with this process. To print out all of our friends' names without repeating the print statement ten times, we can use a `for` loop to iterate `10` times.

```java
String[] friends = {"Alan", "Bob", "Carol", "David", "Ellen", 
                    "Fred", "Grace", "Henry", "Ian", "Jen"};

for (int i = 0; i < 10; i++) {
  System.out.println(friends[i]);
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayIterate.java java -cp code/arrays/ ArrayIterate 2)

[Code Visualizer](open_tutor code/arrays/ArrayIterate.java)

|||challenge
## What happens if you:
* Change `System.out.println(friends[i]);` in the code above to `System.out.println(friends[0]);`?
* Change `System.out.println(friends[i]);` in the code above to `System.out.println(friends[10]);`?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayIterate.java java -cp code/arrays/ ArrayIterate 3)

[Code Visualizer](open_tutor code/arrays/ArrayIterate.java)

|||important
## IMPORTANT
Did you notice that the print statement above includes `i` as the index for `friends`? We do this because `i` will take on the values specified by the `for` loop. The loop starts at `0` and increments by 1 until it reaches `9` (not including 10). Thus, `friends[0]` will print, then `friends[1]`, so on and so forth until `friends[9]` is printed. Then the loop ends.
|||

## Array Length
To make the iteration process easier, we can use an instance variable called `length` to determine how many elements are in our array. To use `length`, just call it by adding a period `.` after our array followed by `length`. For example, `friends.length` will tell us how many elements are in our `friends` array. The advantage of using `length` is that we can initialize additional elements in our array without having to keep track of how many elements are already inside.

```java
String[] friends = {"Alan", "Bob", "Carol", "David", "Ellen", 
                    "Fred", "Grace", "Henry", "Ian", "Jen"};

for (int i = 0; i < friends.length; i++) {
  System.out.println(friends[i]);
}
```

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayIterate.java java -cp code/arrays/ ArrayIterate 4)

[Code Visualizer](open_tutor code/arrays/ArrayIterate.java)

|||challenge
## What happens if you:
* add `"Kate"` as an element to the array right after `"Jen"`?
* remove `"Alan"` and `"Bob"` from the array?

|||

{Try it}(sh .guides/bg.sh javac code/arrays/ArrayIterate.java java -cp code/arrays/ ArrayIterate 5)

[Code Visualizer](open_tutor code/arrays/ArrayIterate.java)

Notice how `.length` continues to keep track of how many elements are in our array even though we've made several changes.

{Check It!|assessment}(parsons-puzzle-3987656755)
