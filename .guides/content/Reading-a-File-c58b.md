----------

## Reading a File

Reading a file is similar, in some ways, to writing to a file. You still import the `java.io` package, you need a file path, and you are going to use a `try... catch` block for IO exceptions. Instead of `BufferedWriter` and `FileWriter`, you are going to use the `BufferedReader` and `FileReader` classes. 

The `readLine` method will read from the file until it encounters a newline character. All of the text read up until the newline character will be returned. Combine the `readLine` method with the the `println` command to see the first line of the file.

```java
import java.io.*;

public class Read {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
  }
}
```

{Try it}(sh .guides/bg.sh javac code/files/Read.java java -cp code/files/ Read 1)

|||challenge
## Try these variations:
* Add another `readLine` method to the program:
```java
System.out.println(reader.readLine());
System.out.println(reader.readLine());
```
* Change the `readLine` method to `read`:
```java
System.out.println(reader.read());
```

<details>
  <summary><strong>Why does Java print a number?</strong></summary>
  The <code>read</code> method only reads one character at a time from the file, and it returns the integer value of the character. You can see the character representation of this integer if you change the code to say:
  
  ```java
  System.out.println((char)(reader.read()));
  ```
</details><br>

* Change the file path to: 
```java
String path = "studentFolder/text/readPractice2.txt";
```

<details>
  <summary><strong>Why does Java print an IO exception?</strong></summary>
  The file <code>readPractice2.txt</code> does not exist. Unlike writing to files, Java does not create a new file when reading a file that does not exist. 
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/Read.java java -cp code/files/ Read 2)

{Check It!|assessment}(multiple-choice-1012654483)
