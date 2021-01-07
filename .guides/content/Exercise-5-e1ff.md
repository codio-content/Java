## Files Exercise 5

**Problem**
Write a program that reads a comma delimited CSV file and prints all of the cities which reside in the Southern Hemisphere. **Note**, any latitude with a negative value is south of the equator.

**Expected Output**
The CSV file will look something like the one below. **Note**, there will be a row with header titles.

|City |Country |Latitude |Longitude |
|-----|--------|:-------:|:--------:|
|Beijing|China|39|116
|Perth|Australia|-57|115|
|Port Moresby|Papua New Guinea|-25|147|
|Tokyo|Japan|35|139|

Your program **must** include the following line of code:

```java
    String path = args[0];
    //add code below this line
    
    
    
    //add code above this line
```
The variable `path` allows for different text files to be sent to your program for testing. The `TRY IT` button below will send a test file to your program. You should see the following output:

```text
The following cities are in the Southern Hemisphere: Perth, Port Moresby.
```

<details>
  <summary><strong>Where is the code visualizer?</strong></summary>
  Unfortunately, the code visualizer does not work with external files, so it cannot be used for this problem.
</details><br>