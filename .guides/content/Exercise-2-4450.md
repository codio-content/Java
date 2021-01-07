## Files Exercise 2

**Problem**
Write a program that reads a comma delimited CSV file with four columns and returns the average of each column in the file.

**Expected Output**
The CSV file will look something like the one below. **Note**, there will **NOT** be a row with header titles.

|Column 1|Column 2|Column 3|Column 4|
|:------:|:------:|:------:|:------:|
|1       |5       |10      |30      |
|19      |15      |10      |15      |
|10      |4       |-2      |15      |

Your program **must** include the following line of code:

```java
    String path = args[0];
    //add code below this line
    
    
    
    //add code above this line
```
The variable `path` allows for different text files to be sent to your program for testing. The `TRY IT` button below will send a test file to your program. You should see the following output:

```text
10.0 8.0 6.0 20.0
```

<details>
  <summary><strong>Where is the code visualizer?</strong></summary>
  Unfortunately, the code visualizer does not work with external files, so it cannot be used for this problem.
</details><br>

{Try it}(sh .guides/csv.sh Exercise2 studentFolder/exercises/exercise2Check.csv)

{Check It!|assessment}(code-output-compare-1707150472)
