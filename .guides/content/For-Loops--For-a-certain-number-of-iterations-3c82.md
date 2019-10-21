One type of loop in Java is a `for` loop. The syntax puts all three pieces of the loop next to each other in the for loop header:

```java
for(int i = 0; i < 10; i++)
```

* the incrementor get declared and assigned to `0`.

* the loop condition is `i < 10`

* the increment is +1 since `i++` is equivalent to `i+= 1` or `i = i + 1`

This means that the loop header *should* contain all the information you need to determine the number of iterations. In the case above, as long as the code does not modify `i` in the loop body, the loop will iterate 10 times (for values 0-9).

This short video explains how for loops function as `REPEAT` blocks - and alludes to how they are more powerful.

<iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/MZqrhK9av3M" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
