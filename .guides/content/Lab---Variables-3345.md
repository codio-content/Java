## Tutorial Lab 2: Variables

1) Use the code editor to the left.

2) Enter the code below.

```java
String english = "Hello";
String spanish = "Hola";
String italian = "Ciao";
String french = "Bonjour";

spanish = english;
italian = spanish;
french = italian;

System.out.print(french);
```
3) Run the module to see the output. Use the code visualizer to go through the program step by step.

[Code Visualizer](open_tutor code/fundamentals/Lab_Variables.java)
{Try it}(sh .guides/bg.sh javac code/fundamentals/Lab_Variables.java java -cp code/fundamentals/ Lab_Variables 1 )

4) If you use the code visualizer, you will notice that all four of the variables have the value of `Hello` by the end of the program.
