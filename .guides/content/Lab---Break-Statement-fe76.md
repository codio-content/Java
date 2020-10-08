---

## Tutorial Lab 3: Breaking from the While Loop
Copy the code below into the text editor in the upper left panel. Then click on the `TRY IT` button to run the resulting program in the Terminal in the lower left panel.

<details><summary>What does <code>Scanner sc = new Scanner(System.in);</code> do?</summary>The <code>Scanner sc = new Scanner(System.in);</code> command records what a user enters on the screen and stores that information in the scanner object <code>sc</code> as an <b>input stream</b>.</details>

<details><summary>What do <code>try</code> and <code>catch</code> do?</summary><code>try</code> checks to see if <code>sc</code>, the input stream, entered by the user can be converted to a double using <code>Double.parseDouble(sc.next())</code>. If <code>sc</code> can be converted to a double, the system will do so and store that double into the variable <code>input</code>. Then it will add <code>input</code> to the running sum, <code>result</code>. On the other hand, if <code>sc</code> cannot be converted to a double, <code>catch</code> will ignore the error message and then print the current sum.</details>

```java
double result = 0;
double input;
Scanner sc = new Scanner(System.in);

while (true) {
  System.out.print("Enter a number to add to sum. ");
  System.out.println("Or enter a non-number to quit and calculate sum.");
  try {
    input = Double.parseDouble(sc.next());
    result = result + input;
  }
  catch (NumberFormatException ignore) {
    System.out.println("Sum = " + result);
    break;
  }  
}

sc.close();
```

{Try it|terminal}(sh .guides/bg.sh javac code/loops/LabBreak.java java -cp code/loops/ LabBreak 1)

### Program Summary
1) Declare the variable `result` and initialize it to `0`. `result` will store the total of the summation.
2) Declare the variable `input`. `input` will store the information that the user enters as a double.
3) Create a scanner object that records the information the user enters as an input stream.
4) Next we set up a `while` loop with `true` as the expression in the loop header. We do this because we want the loop to continue running and storing information from the user. Since we don't know how much information the user will enter, a `while` loop is best for the situation.
5) The user is prompted to enter some information and that information will be converted to a double. Then it is stored in the variable `input` which was declared earlier.
6) If the information was converted and stored into `input` successfully, the value in `input` will be added to the value in `result`, our total summation.
7) If the information was *not* converted and stored into `input` successfully, then the program will ignore the error and print out the total summation `result`. Then the program will exit the `while` loop.

{Check It!|assessment}(multiple-choice-1942677726)
