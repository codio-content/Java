Complete the code on the left such that the code returns `17`. Please note there are *two* types of errors present in the code:

1) A **compilation error** - the compiler sees a problem and throws an error to alert you

2) A **run-time error** - an error when the code is running.

<details><summary>**Compilation Error Hint**</summary>An example of a compile error would be `int number = "this is not an int";`</details>

{Try it}(sh .guides/bg.sh javac code/operators/Exercise1.java java -cp code/operators/ Exercise1 1)


{Check It!|assessment}(test-3510090921)

|||info
<details><summary><b>How to Restore Code File</b></summary>
If you make too many changes to the code on the left and want to start over, click on the gear in the top-right and select "Restore current files" ![.guides/img/restore](.guides/img/restore.png)
</details>
|||

<details><summary>**Run-Time Error Hint**</summary>Once you fix the compilation error, you will see the code output does not match what the exercise asks for.</details>

<details><summary>**Try Debugging**</summary>Debugging is a set of practices used to remove bugs. One way is to print out useful information. Try printing out what the variables *should* be to get to 17: $a = 17 - \frac{b-8/2}{3}$ <br> $b = 17 - a * 3 + \frac{8}{2}$</details>

{Try it}(sh .guides/bg.sh javac code/operators/Exercise1.java java -cp code/operators/ Exercise1 2)

{Check It!|assessment}(test-3481226015)
