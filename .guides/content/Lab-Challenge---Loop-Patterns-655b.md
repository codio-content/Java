---

## Nested Loop Example
One of the benefits of nested loops is that they can be used to construct complex patterns. Imagine a classroom full of students and they are distributed evenly into smaller groups and asked to form a single line with their groups. The outer loop is like the group leader (represent in **red** and `L`) and the inner loop is like the rest of the group members (represented in **blue** and `M`.

<table>
<tr>

<td>
<div style="width:400px; height:550px; margin-left:120px">

![.guides/img/NestedLoopExample](.guides/img/NestedLoopExample.png)

</div>
</td>
</tr>
</table>

```java
for (int x = 0; x < 3; x++) {
  System.out.println("L");
  for (int y = 0; y < 3; y++) {
    System.out.println("M");
  }
}
```

{Try it}(sh .guides/bg.sh javac code/loops/LabChallenge.java java -cp code/loops/ LabChallenge 1)

What is the pattern described by the above example? There are 3 leaders and **each** leader has 3 members. However, note that the example shows the students standing in a *vertical* line. What if you want to arrange the students in a *horizontal* line like this instead?

![.guides/img/NestedLoopHorizontal](.guides/img/NestedLoopHorizontal.png)

By removing `ln` from the `System.out.println` commands from the code above, you can accomplish this task. Alternatively, you can also make use of an `if` and `else` statement instead of a nested loop. Both ways will produce the same result.

<table>
<tr>
<td>
<div style="width:290px; height:180px">

```java
for (int x = 0; x < 3; x++) {
  System.out.print("L");
  for (int y = 0; y < 3; y++) {
    System.out.print("M");
  }
}
```

</div>
</td>
<td>
<div style="width:372px; height:180px">
          
```java
for (int x = 0; x < 12; x++) {
  if ((x == 0) || (x == 4) || (x == 8)) {
    System.out.print("L");
  }
  else {
    System.out.print("M");
  }
}
```

</div>
</td>
</tr>
</table>

{Try it}(sh .guides/bg.sh javac code/loops/LabChallenge.java java -cp code/loops/ LabChallenge 2)

## Nested For Loop Challenge

|||challenge
# Assignment:
For this challenge, you will use your knowledge of **patterns**, **conditionals**, and **nested `for` loops** to produce the following output:
```c++
XOXOXOXOX
OXO
OXO
XOXOXOXOX
OXO
OXO
XOXOXOXOX
OXO
OXO
```

# Requirement:
Your program **must** include **at least two** `for` loops, one nested within another, in order to receive credit. In addition, you are only allowed to use, **at most**, **two** `System.out.print()` or `System.out.println()` statements.

{Try it}(sh .guides/bg.sh javac code/loops/LabChallenge.java java -cp code/loops/ LabChallenge 3)

<table><tbody ><tr><td><details><summary>
	<b>Hint</b>
</summary><br>
  You should start by determining a pattern that repeats itself. One noticeable pattern is:
  
```c++
XOXOXOXOX
OXO
OXO
```
Try creating that particular pattern first, then iterate that pattern by using a loop.

</details></td></tr></tbody>
</table>

|||

{Check It!|assessment}(test-2973701964)
