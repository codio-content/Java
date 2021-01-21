----------

## Read and Write - Two Files

The following code sample reads from one file and writes to another. Since there are two files involved, you will need a `readPath` and a `writePath`. Create a `BufferedReader` with `readPath`, and create a `BufferedWriter` with `writePath`. Using the `ready` method, iterate through the `reader` object. Read a line and then write it to the `writer` object. Do not forget to close both files after the loop terminates. Open `practice4.txt` to make sure that the file has some text.

```java
    //add code below this line
    String readPath = "studentFolder/text/readPractice.txt";
    String writePath = "studentFolder/text/practice4.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(readPath));
      BufferedWriter writer = new BufferedWriter(new FileWriter(writePath));
      while(reader.ready()) {
        writer.write(reader.readLine());
      }
      reader.close();
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/ReadWrite.java java -cp code/files/ ReadWrite 1)
[Open practice4.txt](open_preview studentFolder/text/practice4.txt)

|||challenge
## Try these variations:
Be sure to open the `practice4.txt` file after the change.
* Change the `write` method so that it includes a newline character:
```java
writer.write(reader.readLine() + "\n");
```
* Change the `write` method so that it writes the string as uppercase letters:
```java
writer.write(reader.readLine().toUpperCase() + "\n");
```

|||

{Try it}(sh .guides/bg.sh javac code/files/ReadWrite.java java -cp code/files/ ReadWrite 2)
[Open practice4.txt](open_preview studentFolder/text/practice4.txt)

{Check It!|assessment}(fill-in-the-blanks-4088463411)
