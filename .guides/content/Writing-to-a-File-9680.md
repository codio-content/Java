## Locating Student Files

This unit is all about working with files on a computer. The first step is to locate the desired file. That means navigating the file system to find the file in question. The file is called `practice1.txt`. It is located in the `text` folder, which is inside the folder called `studentFolder`.  So the path to the file is: `studentFolder/text/practice1.txt`.

![File Path](.guides/img/file-path.png)

## Writing to a File

Importing the `java.io` package allows Java to input and output operations. Store the path of the text file as a string.

```java
import java.io.*;

public class Writing {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    
    //add code above this line
  }
}
```

When reading or writing files, Java requires you to handle input/output exceptions. We are going to use a `try... catch` block to verify that we can write to a file without a problem. Create `writer` which is of type `FileWriter` and pass it the path to the `practice1.txt` file. Then add a `catch` statement that checks for `IOException` errors. Print this error if it occurs.

```java
import java.io.*;

public class Writing {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    try(FileWriter writer = new FileWriter(path)) {
      
    } catch (IOException e) {
      System.out.println(e);
    }
    //add code above this line
  }
}
```

<details>
  <summary><strong>What is an input/output exception?</strong></summary>
  An input/output exception can occur for a variety of reasons. Here are some cases in which Java would throw an error:
  
  * You are reading/writing to a file on the network, and the connection was lost
  * You are reading/writing to a local file that is no longer available
  * You are reading/writing to a file but do not have permission
  * You are writing to a file but do not have enough disk space
  
</details><br>

If there is no input/output exception, create a string with the text you want to write to the file. Then use the `write` method to write this text to the file. Always close the file once you are done writing to it. Add a `finally` block so the user gets a message that the program has finished writing to file. After running the program, you can click the link to open the file and see the message.

```java
import java.io.*;

public class Writing {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    try(FileWriter writer = new FileWriter(path)) {
      String text = "Hello there";
      writer.write(text);
      writer.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished writing to a file.");
    }
    //add code above this line 
  }
}
``` 

{Try it}(sh .guides/bg.sh javac code/files/Writing.java java -cp code/files/ Writing 1)
[Open practice1.txt](open_preview studentFolder/text/practice1.txt)

|||challenge
## Try these variations:
Be sure to open the `practice1.txt` file after each change.
* Change the string `text` to `"Goodbye"`?
* Change the string `text` to `""`?
* Open `studentFolder` in the sidebar on the left. Open the `text` folder and right-click on `practice1.txt`. Select "Delete..." and run the program again.

<details>
  <summary><strong>Why is there no error message?</strong></summary>
  If you tell Java to write to a nonexistent file (the third suggestion), it will create the file for you. That is why you do not see an error message. `FileWriter` will throw an input/output exception if the path is a directory rather than a regular file, if the file does not exist but cannot be created, or if the file cannot be opened for any other reason.
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/Writing.java java -cp code/files/ Writing 2)
[Open practice1.txt](open_preview studentFolder/text/practice1.txt)

{Check It!|assessment}(multiple-choice-1495458135)
