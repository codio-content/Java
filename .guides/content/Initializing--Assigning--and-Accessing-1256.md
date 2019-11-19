----------

## Initializing Assigning Values

We call the process of setting the **initial** value of a variable **initialization**. You can do this separately after the declaration or combine it into the same statement as the declaration.

![.guides/img/VariableAssignment2](.guides/img/VariableAssignment2.png)

Since the value stored in a variable can change, we call changing the value **assigning** or **re-assigning**. Use the assignment operator to give a variable a new value.

## Accessing Variables

Enter the code below and see the results of the `println` commands. Use the code visualizer to see how the value of `my_variable` changes.

```
String my_variable = "Hello world";
System.out.println(my_variable);
my_variable = "Goodbye world";
System.out.println(my_variable);
```

When we use a variable's name to get the value like in the `println` statements above, we say we are **accessing** the variable.

[Code Visualizer](open_tutor code/fundamentals/PlaygroundVariables7.java)
{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundVariables7.java java -cp code/fundamentals/ PlaygroundVariables7 1 )

{Check It!|assessment}(parsons-puzzle-2935644769)
