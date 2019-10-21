Often, loop headers are more complex than `REPEAT 3 TIMES`. Instead, you use variables and conditionals.

|||info

The three pieces controlling a loop are:
 1. The loop variable - often called the **iterator**
 1. A condition - a boolean check of the loop variable's value
 1. An increment - how the loop variable is changed every iteration
 
|||

<p>You can step through the flow chart on the left using the "Step" tool on the top right of the Flode panel:
  <img src=".guides/img/flodeStep.png" alt="Flode Step" align="middle" alt = "Flode Step" style="width:50px;height:50px;"/></p>

### There are several things to notice about the example to the left:
1. The loop variable starts at 0 - this is a Computer Science convention
1. The condition was set to <= 9 but there were 10 lines printed out (this is because we started at 0)
1. If you change the condition to `loopVariable < 10` you get the same execution, but the loop condition is more clear
1. The loop variable reaches `10`
