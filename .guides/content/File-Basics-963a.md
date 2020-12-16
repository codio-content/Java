----------

## File Basics

This module is all about working with files on a computer. The first step is to locate the desired file. That means being able to navigate the file system. The file we are going to use is called `practice1.txt`. It is located in the `text` folder, which is inside the folder called `studentFolder`.  So the path to the file is: `studentFolder/text/practice1.txt`.

![File Path](.guides/img/file-path.png)

Use a string to represent the file path. This string will be passed to the objects used to read and write to files. 

```java
String path = "studentFolder/text/practice1.txt";
```

## Buffers

The most basic ways to read and write to files are with the `FileReader` and `FileWriter` classes. However, they only read and write one byte at a time from disk. A byte is not a large amount of data. So programs with `FileReader` and `FileWriter` have to access the disk many times. This is not an efficient way to work with files.

Using a buffer can speed up your program. A buffer is a block of memory that stores data. Your program interacts with the buffer (which is fast) before interacting with the disk (which is slow). Buffers can read or write more than one byte of data at a time, so it interacts with the disk less often.

![Buffer](.guides/img/buffer.png)

The examples in this module will always use a buffer. We will start with writing to a file. Use the `FileWriter` class, but "wrap" it in the `BufferedWriter` class. This allows you to send data to a buffer (fast) before writing to the file (slow). Be sure to import the `java.io` package. 

```java
import java.io.*;

public class FileBasics {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    BufferedWriter writer = new BufferedWriter(new FileWriter(path));
    
    //add code above this line
  }
}
```

{Try it}(sh .guides/bg.sh javac code/files/FileBasics.java java -cp code/files/ FileBasics 1)

## IO Exceptions

Running the code above generates an error message. Your programs that read and write to files need to be able to handle input/output exceptions. An input/output exception can occur for a variety of reasons. Here are some cases in which Java would throw an exception:
  
  * You are reading/writing to a file on the network, and the connection was lost
  * You are reading/writing to a local file that is no longer available
  * You are reading/writing to a file but do not have permission
  * You are writing to a file but do not have enough disk space
  
Use a `try... catch` block to handle input/output exceptions. In the `try` portion of the block, create a `BufferedWriter` object. If there is an exception, print it in the `catch` portion of the block. This code should run without any errors, but it does not do anything.

```java
import java.io.*;

public class FileBasics {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/practice1.txt";
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
      
    } catch (IOException e) {
      System.out.println(e);
    }
    //add code above this line
  }
}
```

{Try it}(sh .guides/bg.sh javac code/files/FileBasics.java java -cp code/files/ FileBasics 2)

{Check It!|assessment}(multiple-choice-3027494163)
