----------

## Appending to a File

You may have noticed that the `write` method completely writes over a file with the new string. If you want to add to an existing file, you need to tell Java that you want to append to a file rather than overwrite it. Start by writing a string to the file `practice3.txt`. 

```java
import java.io.*;

public class Append {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice3.txt";
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
      String text = "Nothing left to do";
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

{Try it}(sh .guides/bg.sh javac code/files/Append.java java -cp code/files/ Append 1)
[Open practice3.txt](open_preview studentFolder/text/practice3.txt)

To append to this file, use the boolean `true` after the file path when declaring a `FileWriter` object. Set `text` to a different string. **Remember**, Java will append the new text at the end of the file. If you want a space or a new line between the old and new text, you need to add it. We want the new text to appear on its own line, so use the `newLine` method before appending `text` to the file.

```java
import java.io.*;

public class Append {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice3.txt";
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
      String text = "but smile, smile, smile";
      writer.newLine();
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

{Try it}(sh .guides/bg.sh javac code/files/Append.java java -cp code/files/ Append 2)
[Open practice3.txt](open_preview studentFolder/text/practice3.txt)

{Check It!|assessment}(fill-in-the-blanks-3874763106)
