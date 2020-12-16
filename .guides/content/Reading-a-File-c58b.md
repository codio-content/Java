----------

## Reading a File

Reading a file is similar, in some ways, to writing to a file. You still need a file path and you are going to use a `try... catch` block for IO exceptions. Instead of `BufferedWriter` and `FileWriter`, you are going to use the `BufferedReader` and `FileReader` classes.

```java
import java.io.*;

public class Read {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try(BufferedWriter reader = new BufferedReader(new FileReader(path))) {
      
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