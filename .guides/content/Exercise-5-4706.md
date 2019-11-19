Your friend wrote an adder. It is supposed to sum together two numbers inputted by a user but it's behaving oddly.

You can test it out using the terminal in the bottom left hand pane. It will ask you to input two whole numbers. You need to press "Enter" or "Return" after each number.

{Try it | terminal}(javac code/operators/Exercise5.java && java -cp code/operators/ Exercise5 )

Your first challenge is to figure out what is broken. Your second challenge is to fix it.

<details><summary>Hint to identify problem</summary>Try entering 1 and 1. You expect the output to be 2 but you get 11. Similarly, if you enter 3 and 4, you expect the output to be 7 but you get 34. Remember, **string concatenation** is another use for the `+`.</details>

<details><summary>Hint to identify the solution</summary>The `+` operator decides what to do by the type of data on either side of it. What data types will cause it to add? What data type is there now? How do you translate from one data type to the other? Check out the **type casting** page for ideas. </details>

{Check It!|assessment}(code-output-compare-3620880377)
