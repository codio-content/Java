---

## Tutorial Lab 3: Breaking from the While Loop
Copy the code below into the text editor in the upper left panel. Then click on the `TRY IT` button to run the resulting program in the Terminal in the lower left panel.

<details><summary>What does `cin >> input;` do?</summary>The `cin >> input;` command records what a user enters on the screen and stores that information in the variable `input`. Note that `input` is of type `double`.</details>
<details><summary>What do `cin.good()` and `cin.fail()` do?</summary>`cin.good()` checks to see if the input entered by the user was successful while `cin.fail()` checks to see if the input failed. Since `input` is of type `double`, only numerical values entered by the user will cause `cin >> input` to be successful, anything else will cause the input to fail.</details>

```java
double result = 0;
double input;
Scanner sc = new Scanner(System.in);

while (true) {
  System.out.print("Enter a number to add to sum. ");
  System.out.println("Or enter a non-number to quit and calculate sum.");
  input = sc.nextLine();
  
  if (input instanceof double) {
    result += input;
  }
  else {
    System.out.println("Sum = " + result);
    break;
  }
}
```

{Try it}(sh .guides/bg.sh javac code/loops/LabBreak.java java -cp code/loops/ LabBreak 1)

### Program Summary
1) Declare the variable `result` and initialize it to `0`. `result` will store the total of the summation.
2) Declare the variable `input`. `input` will store the information that the user enters.
3) Next we set up a `while` loop with `true` as the expression in the loop header. We do this because we want the loop to continue running and storing information from the user. Since we don't know how much information the user will enter, a `while` loop is best for the situation.
4) The user is prompted to enter some information and that information is stored in the variable `input` which was declared earlier.
5) If the information was stored into `input` successfully, the value in `input` will be added to the value in `result`, our total summation.
6) If the information was *not* stored into `input` successfully, then the program will print out the total summation `result` and exit the `while` loop.