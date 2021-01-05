----------

## File Iteration

The `readLine` method only returns one line of a text file. If you want to read an entire file, you will need to iterate over the file, reading each line until you reach the end. Since you do not know how many lines of text a file has, a while loop is preferable. Java represents the end of the file when the `readLine` method returns `null`. 

Create string `currentLine` and read a line from the file. Construct a while loop that asks if `currentLine` is not equal to `null`. If this is true, print `currentLine` and then update the variable by reading another line from the file.

```java
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String currentLine = reader.readLine();
      while(currentLine != null) {
        System.out.println(currentLine);
        currentLine = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/FileIteration.java java -cp code/files/ FileIteration 1)

|||challenge
## Try these variations:
* Comment out the last line of the while loop:
```java
String currentLine = reader.readLine();
while(currentLine != null) {
  System.out.println(currentLine);
  //currentLine = reader.readLine();
}
```

<details>
  <summary><strong>Why does Java timeout?</strong></summary>
  This is an infinite loop. The varaible <code>currentLine</code> represents the first line of the text file. If you do not read another line from the file, then <code>currentLine</code> will never be equal <code>null</code>.
</details><br>

* Change the while loop to look like this: 
```java
String currentLine;
while((currentLine = reader.readLine()) != null) {
  System.out.println(currentLine);
}
```

<details>
  <summary><strong>Why does this loop work?</strong></summary>
  The reading of the file takes place as the loop checks to see if <code>currentLine</code> is not equal to <code>null</code>. This means you do not need to read the file when you create <code>currentLine</code>, and you do not have to read again inside the loop. Structuring a while loop like this is more concise, but it is not as clear 
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/FileIteration.java java -cp code/files/ FileIteration 2)

## The Ready Method

The `BufferedReader` class has the method `ready` which returns a `true` if the file can be read. It returns `false` when there are no more lines in the file. You no longer need the `currentLine` variable. Instead, use the `ready` method in the while loop, and print the the value of the `readLine` method. Not only is this a more concise way of iterating over a file, you do not have to worry about an infinite loop. 

```java
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while(reader.ready()) {
        System.out.println(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/FileIteration.java java -cp code/files/ FileIteration 3)

{Check It!|assessment}(multiple-choice-3272895920)
