----------

## Infinite Loops Are Bad, Right?
Well, that depends. If an infinite loop caused because the counting variable isn't incremented, then it's a bug. But some programmers purposely create a condition that will always evaluate to true. Therefore, the loop will always run.

However, a `break` statement is used to stop the loop when a certain condition is true. 

Take a look at the code to the left, and run it several times.

[Code Visualizer](open_tutor code/loops/BreakStatement.java)
{Try it}(sh .guides/bg.sh javac code/loops/BreakStatement.java java -cp code/loops/ BreakStatement )

Even though `while(true)` will always evaluate as a true statement, the loop never becomes infinite because of the `break` statement.

|||challenge
## What happens if you:
* Remove the `break` statement?
* Move the `break` statement to before the `print` statement?

|||

### Comparing While Loops
Even though the while loops introduced on the previous page look different than the while loops covered on this page, they both have the same components and do the same thing.

![While Loop Comparison](.guides/img/WhileLoopComparison.png)
