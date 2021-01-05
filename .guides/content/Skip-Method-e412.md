----------

## Skip Method

The `skip` method takes an integer as a parameter, and causes Java to go to a specific character in the text file. The integer is the index for the text file. So `skip(0)` is the first character of the file, `skip(1)` is the second character, etc. The code below prints out the first line from the file.

```java
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      System.out.println(reader.readLine());
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/Skip.java java -cp code/files/ Skip 1)

Now compare the output above with the code below. Java will skip the first 30 characters and then print the remaining characters from the first line.

```java
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      reader.skip(30);
      System.out.println(reader.readLine());
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.");
    }
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/Skip.java java -cp code/files/ Skip 2)

|||challenge
## Try these variations:
* Change the skip amount to 40: `reader.skip(40);`
* Change the skip amount to 400: `reader.skip(400);`

<details>
  <summary><strong>Why does Java print null?</strong></summary>
  The text file only has 227 characters. Skipping 400 characters means there is no more file to read. So Java returns `null`.
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/Skip.java java -cp code/files/ Skip 3)

{Check It!|assessment}(multiple-choice-1392982459)
