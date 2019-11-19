----------

## Integers
Integers (often called `int`s) are whole numbers. They can be positive or negative. Do not use a comma when typing large numbers
  
Enter the code below and click the `TRY IT` button.
  
```java
int number = 50;
System.out.print(number);
```

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundVariables2.java java -cp code/fundamentals/ PlaygroundVariables2 1 )

<details><summary><b>5 vs. "5"</b></summary>`5` is not the same thing as `"5"`. The first one is an integer, the second is a string. You will see in a later lesson the different operations you can perform on strings and numbers. Treating a string as a number can cause errors.</details>
  
|||challenge
## What happens if you:
* Change the variable to `5000`?
* Change the variable to `5,000`?
* Change the variable to `050`?

|||

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundVariables2.java java -cp code/fundamentals/ PlaygroundVariables2 2 )

