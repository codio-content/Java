## More Writing to Files

Let's take the Java code from the previous page and make a few changes. This program will write to the file `practice2.txt`, and there will be two strings to write. The first string, `text1`, has the same value as before. The string `text2` has the value `my friend`. Write both of these strings to the file; then click on the link.

```java
import java.io.*;

public class MoreWriting {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice2.txt";
    try(FileWriter writer = new FileWriter(path)) {
      String text1 = "Hello there";
      String text2 = "my friend";
      writer.write(text1);
      writer.write(text2);
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

{Try it}(sh .guides/bg.sh javac code/files/MoreWriting.java java -cp code/files/ MoreWriting 1)
[Open practice2.txt](open_preview studentFolder/text/practice2.txt)

Notice how Java writes text as one string after another; it does not add a new line, it does not add a space. You need to add these characters yourself. Change the string variables to look like the code below. Run the program, and then look at the file. Each string should be on its own line.

```java
String text1 = "Hello there\n";
String text2 = "my friend";
```

{Try it}(sh .guides/bg.sh javac code/files/MoreWriting.java java -cp code/files/ MoreWriting 2)
[Open practice2.txt](open_preview studentFolder/text/practice2.txt)

You can also write a subset of a string to a file. The `write` method can also take two additional parameters. The first is an integer representing the starting character, and the second is an integer representing the length of the substring.

```java
writer.write(text1, 6, 6);
writer.write(text2, 0, 4);
```

The first `write` method starts at the sixth character (the `t`) and writes the next six characters (`there` plus the newline character) to the file. The second `write` method starts at character zero (the `m`) and writes the next four characters (`my f`) to the file.

{Try it}(sh .guides/bg.sh javac code/files/MoreWriting.java java -cp code/files/ MoreWriting 3)
[Open practice2.txt](open_preview studentFolder/text/practice2.txt)

|||challenge
## Try these variations:
Be sure to open the `practice2.txt` file after the change.
* Change the fist `write` method to `writer.write(text1, 12, 1);`

<details>
  <summary><strong>Why is there an error?</strong></summary>
  At first glance, it looks like you are telling Java to print the last character in <code>text1</code> which is the newline character. However, you get an error message. The sum of the integers <strong>cannot</strong> be longer than the length of the string. <code>text1</code> has a length of 12 and 12 + 1 is 13. If you want to print just the newline character use <code>writer.write(text1, 12, 0);</code>
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/MoreWriting.java java -cp code/files/ MoreWriting 4)
[Open practice2.txt](open_preview studentFolder/text/practice2.txt)

## Writing Characters

The `write` method lets you write characters (a single character or an array of characters) to a file as well. You will still use the `write` method as above, but you will pass it an integer representing a single character or an array of characters.

```java
import java.io.*;

public class MoreWriting {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice2.txt";
    try(FileWriter writer = new FileWriter(path)) {
      int char1 = 65;
      char[] char2 = {' ', 'c', 'h', 'a', 'r'};
      writer.write(char1);
      writer.write(char2);
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

{Try it}(sh .guides/bg.sh javac code/files/MoreWriting.java java -cp code/files/ MoreWriting 5)
[Open practice2.txt](open_preview studentFolder/text/practice2.txt)

|||challenge
## Try these variations:
Be sure to open the `practice2.txt` file after the change.
* Change the 2nd `write` method to `writer.write(char2, 1, 3);`

|||

{Try it}(sh .guides/bg.sh javac code/files/MoreWriting.java java -cp code/files/ MoreWriting 6)
[Open practice2.txt](open_preview studentFolder/text/practice2.txt)

{Check It!|assessment}(multiple-choice-1881541547)
