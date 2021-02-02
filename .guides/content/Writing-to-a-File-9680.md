----------

## Writing to a File

Continuing from the previous page, your program should import the `java.io` package, have the file path stored as a string, use a `BufferWriter` object, and catch any input/output exceptions.

```java
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(path));
    } catch (IOException e) {
      System.out.println(e);
    }
    //add code above this line
```

If there is no input/output exception, create a string with the text you want to write to the file. Then use the `write` method to write this text to the file. Always close the file once you are done writing to it. Add a `finally` block so the user gets a message that the program has finished writing to file. After running the program, you can click the link to open the file and see the message.

```java
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(path));
      String text = "Hello there";
      writer.write(text);
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a file.");
    }
    //add code above this line 
``` 

{Try it}(sh .guides/bg.sh javac code/files/Writing.java java -cp code/files/ Writing 1)
[Open practice1.txt](open_preview studentFolder/text/practice1.txt)

|||challenge
## Try these variations:
Be sure to open the `practice1.txt` file after each change.
* Change the string `text` to `"Goodbye"`
* Change the string `text` to `""`
* Open `studentFolder` in the sidebar on the left. Open the `text` folder and right-click on `practice1.txt`. Select "Delete..." and run the program again.

<details>
  <summary><strong>Why is there no error message?</strong></summary>
  If you tell Java to write to a nonexistent file (the third suggestion), it will create the file for you. That is why you do not see an error message. `FileWriter` will throw an input/output exception if the path is a directory rather than a regular file, if the file does not exist but cannot be created, or if the file cannot be opened for any other reason.
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/Writing.java java -cp code/files/ Writing 2)
[Open practice1.txt](open_preview studentFolder/text/practice1.txt)

{Check It!|assessment}(multiple-choice-1495458135)
