----------

## Printing CSV Data

Iterating over the CSV file and printing each line does not produce visually pleasing output. The code below produces three columns of data, but there is no consistency in the spacing between columns. In particular, the third column nowhere near aligned with the header `Active Player`.

```java
    //add code below this line
    String path = "studentFolder/csv/homeRuns.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      for (String[] row : reader) {
        for (String item : row) {
          System.out.print(item + " ");
        }
        System.out.println();
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
```

{Try it}(sh .guides/csv.sh PrintingCsv 1)

With the string `format` method, you can introduce consistent spacing printing a string. Start with `String.format("%s", item)`. That tells Java that the value stored in `item` is to be printed as a string. To add padding, insert 15 between the "% " and the "s" so it looks like `String.format("%17s", item)`. Now each string will have a fixed width of 15 spaces. The string "No", it will have 13 blank spaces (15 - the length of the string). The output is better than before.

```java
    //add code below this line
    String path = "studentFolder/csv/homeRuns.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      for (String[] row : reader) {
        for (String item : row) {
          System.out.print(String.format("%15s", item));
        }
        System.out.println();
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
```

{Try it}(sh .guides/csv.sh PrintingCsv 2)

|||challenge
## Try this variation:
* Change the string formatting to: `String.format("%-15s", item)`

|||

{Try it}(sh .guides/csv.sh PrintingCsv 3)

Consistent spacing is better than no spacing. However, not every column needs the same width. Some are wider than others. To give unique spacing to each column, remove the enhanced loop that iterates over the `row` array. The array has three elements. The first (player's name) needs a width of 17 spaces, the second element (home runs) needs a width of 11 spaces, and the third element (active player) needs 13 spaces of padding. This creates more user-friendly output.

```java
    //add code below this line
    String path = "studentFolder/csv/homeRuns.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      for (String[] row : reader) {
        String column1 = String.format("%-17s", row[0]);
        String column2 = String.format("%-11s", row[1]);
        String column3 = String.format("%-13s", row[2]);
        System.out.println(column1 + column2 + column3);
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
```

{Try it}(sh .guides/csv.sh PrintingCsv 4)

|||challenge
## Try this variation:
* Add two dashed lines to the output:
```java
      for (String[] row : reader) {
        System.out.println("---------------------------------------------");
        String column1 = String.format("|%-17s", row[0]);
        String column2 = String.format("|%-11s|", row[1]);
        String column3 = String.format("%-13s|", row[2]);
        System.out.println(column1 + column2 + column3);
      }
      System.out.println("---------------------------------------------");
```

|||

{Try it}(sh .guides/csv.sh PrintingCsv 5)

{Check It!|assessment}(multiple-choice-956065085)
