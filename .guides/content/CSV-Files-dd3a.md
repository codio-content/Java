----------

## CSV Files

Java can work with files besides just text files. Comma Separated Value (CSV) files are an example of a commonly used file format for storing data. CSV files are similar to a spreadsheet in that data is stored in rows and columns. Each row of data is on its own line in the file, and commas are used to indicate a new column. Here is an example of a CSV file. We are going to use the [Opencsv](http://opencsv.sourceforge.net/) package to work with CSV files.

![Month Python CSV](.guides/img/monty-python-csv.png)

In order to read a CSV file, Java needs to import the `opencsv` package and the `apache.commons` package in addition to the `java.io` package. The CSV file will be opened much like a text file; open the file in a `FileReader` object, but wrap it in a `CSVReader` object as opposed to a `BufferedReader` object.

```java
    //add code below this line
    String path = "studentFolder/csv/montyPythonMovies.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      
      reader.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a CSV");
    }
    //add code above this line
```

{Try it}(sh .guides/csv.sh CsvFiles 1)

<details>
  <summary><strong>What happened to the IO exceptions?</strong></summary>
  In previous examples in this module, we were catching an <code>IOException</code>. When using the <code>CSVReader</code> class, you need to also catch a <code>CsvValidationException</code>. Instead of writing two different <code>catch</code> statements, we are going to write a generic <code>catch</code> statement that will work for any exception in the code.
</details><br>

Using an enhanced loop, Java will read each row of the CSV file. Each row is an array of strings. To see contents of each row, use an enhanced loop to iterate over `row`. We want the information in `row` to remain on the same line, so use `print` instead of `println`, and add a space between each element. Once the enhanced loop has finished running, use `println` to go to the next line.

```java
    //add code below this line
    String path = "studentFolder/csv/montyPythonMovies.csv";
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

{Try it}(sh .guides/csv.sh CsvFiles 2)

## Skipping the Header

The first row of a CSV file is helpful because the header values provide context for the data. However, the first row is not useful if you want to know how many rows of data, or calculate the avg value, etc. The `skip` method tells the `CSVReader` object how many rows to skip in the CSV file.

```java
    //add code below this line
    String path = "studentFolder/csv/homeRuns.csv";
    try {
      CSVReader reader = new CSVReader(new FileReader(path));
      reader.skip(1);
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

{Try it}(sh .guides/csv.sh CsvFiles 3)

|||challenge
## Try this variation:
* Change the number of lines to skip to 3: `reader.skip(3);`
* Comment out the line with the `skip` method: `//reader.skip(3);`

|||

{Try it}(sh .guides/csv.sh CsvFiles 4)

{Check It!|assessment}(multiple-choice-667076594)
