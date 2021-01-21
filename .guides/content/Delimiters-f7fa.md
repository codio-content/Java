----------

## Delimiters

Delimiters are a predefined character that separates one piece of information from another. CSV files use commas as the delimiter by default. However, this makes the file hard to read for humans. It is possible to change the delimiter in Java to a tab ([click here](open_file studentFolder/csv/dataWithTabs.csv) to see an example), but your code must reflect this change. We are no longer going to use the OpenCSV package. Instead, we are going to manually parse the file with a `BufferedReader` object.

Use the `ready` method from the lesson on iterating over a file. Create the string `line` which represents each line of the CSV file. Within `line`, there are tabs (`"\t"`). We want to take the long string and convert it to an array of smaller strings based on the position of the tab. These smaller strings are called tokens.  The `split` method takes a string and returns an array of strings split on a given character. Create the array `tokens` which is the string `line` split on the value of the variable `delimiter`. Finally, iterate over `tokens` and print each token with some formatting.

```java
    //add code below this line
    String path = "studentFolder/csv/dataWithTabs.csv";
    String delimiter = "\t";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while(reader.ready()) {
        String line = reader.readLine();
        String[] tokens = line.split(delimiter);
        for(String token : tokens) {
          System.out.print(String.format("%-10s", token));
        }
        System.out.println();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
```

{Try it}(sh .guides/csv.sh Delimiters 1)

|||challenge
## What happens if you:
* Change the delimiter from `'\t'` to `','`?

<details>
  <summary><strong>Why did the output change when the delimiter changed?</strong></summary>
  There is a slight difference when the delimiter is a tab and when it is a comma. With a tab delimiter, each row is an array of three strings. When the delimiter is a comma, each row is an array with a single string. Java cannot divide the data into the month, high temperature, and low temperature because it cannot find the delimiter. So it returns one, long string.
</details>

|||

{Try it}(sh .guides/csv.sh Delimiters 2)

{Check It!|assessment}(multiple-choice-221700422)
