----------

## CSVWriter

If a `CSVReader` object is used to read a CSV file, then a `CSVWriter` object is used to write to a CSV file. Create a `CSVWriter` object. Create an array of strings to represent each row of the CSV file. Remember, there should be a header row that describes each column of data. Use the `writeNext` method to write the array of strings to the file. Click on the link to open the file after running the code.

```java
    //add code below this line
    String path = "studentFolder/csv/writePractice.csv";
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(path));
      
      String[] header = {"Greeting", "Language"};
      String[] row1 = {"Hello", "English"};
      String[] row2 = {"Bonjour", "French"};
      String[] row3 = {"Hola", "Spanish"};
      String[] row4 = {"Namaste", "Hindi"};
      
      writer.writeNext(header);
      writer.writeNext(row1);
      writer.writeNext(row2);
      writer.writeNext(row3);
      writer.writeNext(row4);
      
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a CSV");
    }
    //add code above this line
```

{Try it}(sh .guides/csv.sh WritingCsv 1)
[Open the File](open_file studentFolder/csv/writePractice.csv)

|||challenge
## Try these variations:
* Comment out the last two lines when writing data to the file:
```java
      writer.writeNext(header);
      writer.writeNext(row1);
      writer.writeNext(row2);
      // writer.writeNext(row3);
      // writer.writeNext(row4);
```

* "Turn on" the ability to append to a file by adding `true` to the `FileWriter` object:
```java
      CSVWriter writer = new CSVWriter(new FileWriter(path, true));
```

|||

{Try it}(sh .guides/csv.sh WritingCsv 2)
[Open the File](open_file studentFolder/csv/writePractice.csv)

{Check It!|assessment}(fill-in-the-blanks-2823084271)
