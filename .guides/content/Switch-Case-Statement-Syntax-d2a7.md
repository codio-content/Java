----------

## Swith Case Statement Syntax

The switch case is a way to make a decision with multiple outcomes. Instead of nesting or sequencing many if statements, Java allows you to write the following:

![.guides/img/switch-case](.guides/img/switch-case.png)

Here are the rules for writing a switch case statement:

* Start with `switch` followed by the variable that is going to be tested in parentheses `()`
* All of the `case`s are surrounded by curly braces `{}`
* Each `case` is followed by a value (numeric or String) and a colon `:`
* After each `:` write the code that should run if the variable is equal to that value
* After each section of code, include `break;`
* As the very last case, use `default:` and specify what should happen if none of the above cases are true

```java
int dayOfWeek = 3;

switch(dayOfWeek) {

    case 1: System.out.print("Sunday"); //only prints if dayOfWeek == 1
                 break;
    case 2: System.out.print("Monday"); //only prints if dayOfWeek == 2
                 break;
    case 3: System.out.print("Tuesday"); //only prints if dayOfWeek == 3
                 break;
    case 4: System.out.print("Wednesday"); //only prints if dayOfWeek == 4
                 break;
    case 5: System.out.print("Thursday"); //only prints if dayOfWeek == 5
                 break;
    case 6: System.out.print("Friday"); //only prints if dayOfWeek == 6
                 break;
    case 7: System.out.print("Saturday"); //only prints if dayOfWeek == 7
                 break;
    default : System.out.print("Invalid"); //only prints if none of the above are true
    
}
```

[Code Visualizer](open_tutor code/conditionals/PlaygroundSwitchSyntax.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundSwitchSyntax.java java -cp code/conditionals/ PlaygroundSwitchSyntax )

|||challenge
## What happens if you:
* Change `dayOfWeek` to `5`?
* Change `dayOfWeek` to `0`?
* Change `dayOfWeek` to `3` and remove all the `break` statements?

|||

[Code Visualizer](open_tutor code/conditionals/PlaygroundSwitchSyntax.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundSwitchSyntax.java java -cp code/conditionals/ PlaygroundSwitchSyntax 2)


{Check It!|assessment}(multiple-choice-3356521837)

