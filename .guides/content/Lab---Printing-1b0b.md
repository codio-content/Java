
## Tutorial Lab 1: Printing

1) Use the code editor to the left.

2) Enter the code below.

```java
String my_variable = "I am learning"; //step 1
System.out.print(my_variable); //step 2
my_variable = " to program"; //step 3
System.out.print(my_variable); //step 4
my_variable = " in Java."; //step 5
System.out.println(my_variable); //step 6
my_variable = "Hooray!"; //step 7
System.out.println(my_variable); //step 8
```

3) Run the module to see the output. Use the code visualizer to go through the program step by step.

[Code Visualizer](open_tutor code/fundamentals/Lab_Printing.java)
{Try it}(sh .guides/bg.sh javac code/fundamentals/Lab_Printing.java java -cp code/fundamentals/ Lab_Printing 1 )

4) Here are some important points about the program (click on the underlined text):
    * [Step 1](open_file code/fundamentals/Lab_Printing.java panel=0 ref="//step 1" count=1) - Declare the variable `my_variable` and initialize it the value `I am learning`.
    * [Step 2](open_file code/fundamentals/Lab_Printing.java panel=0 ref="//step 2" count=1) - Print without a new line character using `print`
    * [Step 3](open_file code/fundamentals/Lab_Printing.java panel=0 ref="//step 3" count=1) - Add a space when starting the string to avoid `learningto`
    * [Step 6](open_file code/fundamentals/Lab_Printing.java panel=0 ref="//step 6" count=1) - A newline character is added using `println`
    * [Step 8](open_file code/fundamentals/Lab_Printing.java panel=0 ref="//step 8" count=1) - `Hooray!` is on its own line since a regular `print` command was used in step 6
    
