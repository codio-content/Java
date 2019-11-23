----------

## Switch Case vs If Else

Java allows you to use either `switch case` or a series of `if else` to handle decisions with multiple outcomes. There are a couple reasons you would use one over the other.

### #1: If Else is used for ranges - Switch Case is for values
Switch case can only check for equality (i.e. `num == 5`) so if you need to check for a range (i.e. `num > 50 && num <= 60`).

![.guides/img/Switch-Case-vs-If-Else](.guides/img/Switch-Case-vs-If-Else.png)

<details><summary> <b>What is <code>case 10: case 9:</code>?</b></summary> Sometimes, the code for multiple cases is the same. Instead of repeating code, you can list multiple cases before the code. Here is another example: ![.guides/img/Multiple_Case-Labels](.guides/img/Multiple_Case-Labels.png) </details>

In some cases, as shown above, you can exploit patterns to force ranges into a switch case, but frequently that is not possible and it also makes the code less readable. For example, above, the user has to realize that `letterGrade` is using integer division to retrieve the ten's place of the original grade.

```
int grade = 62;
int letterGrade = grade / 10;
switch(letterGrade) {
    case 10: case 9: System.out.print("A"); 
                 break;
    case 8: System.out.print("B"); 
                 break;
    case 7: System.out.print("C"); 
                 break;
    case 6: System.out.print("D"); 
                 break;
    default : System.out.print("F");
}
```

[Code Visualizer](open_tutor code/conditionals/PlaygroundSwitchSyntax.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundSwitchSyntax.java java -cp code/conditionals/ PlaygroundSwitchSyntax )


### #2: If Else is used for handling multiple variables
Switch case can only compare against values - not variables. For example, if you wanted to compare the inputted day of the week with the current day of the week you would need to use an `if else`. Switch can handle values (dayOfWeek == "Sunday") but not variables (dayOfWeek == today).

### #3: If Else is used for compound conditionals
To check multiple conditions, an `if else` is needed. 

An example would be a multiple choice grader:
```
int studentAnswer = 3;
String feedback 1 = "This answer is wrong because....";
String feedback 2 = "This answer is correct! You know this because...";
String feedback 3 = "This answer is wrong. While the first part is correct...";
String feedback;

int correctAnswer = 2;
int points = 0;

switch(studentAnswer) {
    case 1: feedback = feedback1; break;
    case 2: feedback = feedback2; break;
    case 3: feedback = feedback3; break;
    default: feedback = "Invalid answer choice";
}

System.out.println(feedback);
```

|||challenge
### Convert to an If Else
* Change the `switch` statement above into an if else
* Add a check to see if `studentAnswer == correctAnswer`
* If the student's answer is correct, increment (`++`) the `points` variable.
* Print out the students earned points at the end of the program using the `points` variable

|||


[Code Visualizer](open_tutor code/conditionals/PlaygroundSwitchSyntax.java)

{Try it}(sh .guides/bg.sh javac code/conditionals/PlaygroundSwitchSyntax.java java -cp code/conditionals/ PlaygroundSwitchSyntax 2)

{Check It!|assessment}(multiple-choice-2751211238)

