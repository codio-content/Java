----------

## Lab 1

As you read a text file, you go line by line until you reach the end of the file. What happens if you want to go back to a specific line of text? A better way of doing this is to read a text file into an ArrayList. This way you can easily reference any line from the file.

Before reading the file, create the `path` variable with the file path, and instantiate the ArrayList `text`. 

```java
    //add code below this line
    String path = "studentFolder/labs/filesLab1.txt";
    ArrayList<String> text = new ArrayList<String>();
    //add code above this line 
```

Use a `try... catch` block to handle input/output exceptions. In the `try` portion, create a `BufferedReader` object and read through the file. Add each line to the ArrayList `text`. Print any erros in the `catch` portion, and print a message that the file has been read in the `finally` portion.

```java
    //add code below this line
    String path = "studentFolder/labs/filesLab1.txt";
    ArrayList<String> text = new ArrayList<String>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while (reader.ready()) {
        text.add(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.\n");
    }
    //add code above this line 
```

The contents of the text file now reside in the variable `text`. Since the text file is one paragraph (a single newline character at the end of the file), there is only one element in `text`. Go outside of the `try... catch` block and print the first element of the ArrayList `text`.

```java
    //add code below this line
    String path = "studentFolder/labs/filesLab1.txt";
    ArrayList<String> text = new ArrayList<String>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while (reader.ready()) {
        text.add(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.\n");
    }
    
    System.out.println(text.get(0) + "\n");
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/Lab1.java java -cp code/files/ Lab1 1)

You should see a passage from Bram Stoker's *Dracula*. You can access the paragraph again by referencing the variable `text`. We can print each word of the text file by splitting the string on the spaces and printing each element of the resulting array.

```java
    //add code below this line
    String path = "studentFolder/labs/filesLab1.txt";
    ArrayList<String> text = new ArrayList<String>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while (reader.ready()) {
        text.add(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.\n");
    }
    
    System.out.println(text.get(0) + "\n");
    String[] words = text.get(0).split(" ");
    for(String word : words) {
      System.out.println(word);
    }
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/Lab1.java java -cp code/files/ Lab1 2)

Finally, we can print each sentence from the text file by splitting on the periods. **Note**, that the `split` method uses regular expressions. The `.` has special meaning for regular expressions. Instead use `\\.` as the delimiter, that tells Java to use a period and not a regular expression.

```java
    //add code below this line
    String path = "studentFolder/labs/filesLab1.txt";
    ArrayList<String> text = new ArrayList<String>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      while (reader.ready()) {
        text.add(reader.readLine());
      }
      reader.close();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading a file.\n");
    }
    
    System.out.println(text.get(0) + "\n");
    String[] sentences = text.get(0).split("\\.");
    for(String sentence : sentences) {
      System.out.println(sentence + "\n");
    }
    //add code above this line 
```

{Try it}(sh .guides/bg.sh javac code/files/Lab1.java java -cp code/files/ Lab1 3)

{Check It!|assessment}(multiple-choice-3471810899)
