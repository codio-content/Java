----------

## Lab 4

The lab will cover how to encrypt the contents of a file with a Caesar cipher. This cipher will work with any characters that are letters (uppercase and lowercase), the digits 0 to 9, and the symbols space, exclamation, question mark, and the period. Other symbols will not be encrypted. The Caesar cipher requires a key to work as well. The key is any number from 0 to 25.

The Caesar cipher works by having a list of all of the symbols that can be encrypted. Take the letter you want to encrypt and find its place in the list. Add the value of the key to the position to get the encrypted letter. If the new position is greater than the end of the list, keep counting from the beginning of the list. The example below assumes a key of 13, and shows that a `"K"` becomes `"X"` with the Caesar cipher.

![Caesar Cipher](.guides/img/caesar-cipher.png)

### Reading the Source File
This program will read from a file called `source.txt` with the path of `student_folder/labs`. The encrypted text will be written into a file called `encrypted.txt` with the path of `student_folder/text`. Start by making the customary file paths for the two text files.

```java
    //add code below this line
    String readPath = "studentFolder/labs/source.txt";
    String writePath = "studentFolder/text/encrypted.txt";
    //add code above this line 
```

Now add the `try`, `catch`, and `finally` blocks. Create `BufferedReader` and `BufferedWriter` objects in the `try` block, while printing the appropriate messages in the other blocks. Running the program should print the message about reading and writing to a file.

```java
    //add code below this line
    String readPath = "studentFolder/labs/source.txt";
    String writePath = "studentFolder/text/encrypted.txt";
    try {
      BufferedReader source = new BufferedReader(new FileReader(readPath));
      BufferedWriter destination = new BufferedWriter(new FileWriter(writePath));
      
      source.close();
      destination.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading and writing to a file");
    }
    //add code above this line
```

{Try it}(sh .guides/bg.sh javac code/files/Lab4.java java -cp code/files/ Lab4 1)

Next, you need set the key (a number from 0 to 25), the cipher mode (encrypt or decrypt), the list of symbols, and an empty string of the new characters (either encrypted or decrypted).

```java
    //add code below this line
    String readPath = "studentFolder/labs/source.txt";
    String writePath = "studentFolder/text/encrypted.txt";
    try {
      BufferedReader source = new BufferedReader(new FileReader(readPath));
      BufferedWriter destination = new BufferedWriter(new FileWriter(writePath));
      int key = 13;
      String mode = "encrypt";
      final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !?.";
      String newText = "";
      
      source.close();
      destination.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading and writing to a file");
    }
    //add code above this line
```

<details>
  <summary><strong>What does <code>final</code> mean?</strong></summary>
  There is a type of variable called a constant. This variable should never change its value. The <code>final</code> keyword turns a variable into a constant. The Java community also uses the convention of writing constants in all caps as well.
</details><br>

Read the first line from the `source` file. If it is not an empty string (the end of the text file), then you are going to loop through each character of the line.

```java
    //add code below this line
    String readPath = "studentFolder/labs/source.txt";
    String writePath = "studentFolder/text/encrypted.txt";
    try {
      BufferedReader source = new BufferedReader(new FileReader(readPath));
      BufferedWriter destination = new BufferedWriter(new FileWriter(writePath));
      int key = 13;
      String mode = "encrypt";
      final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !?.";
      String newText = "";
      
      String line = reader.readLine();
      for (char ch : line.toCharArray()) {
        
      }
      
      source.close();
      destination.close();
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("Finished reading and writing to a file");
    }
    //add code above this line
```

### The Caesar Cipher
The Caesar cipher can only encrypt those characters that are in the `SYMBOLS` variable. Check to see if `ch` is in `SYMBOLS` and then find its index if true. If the program is encrypting the text, add the value of `key` to the index. If the program is decrypting the text, subtract the value of the key from the index.

<details>
  <summary><strong>Source Text</strong></summary>
  The original text for this lab is the <a href="http://www.gutenberg.org/files/55/55-h/55-h.htm#chap01">opening paragraph</a> from L. Frank Baum's <em>The Wizard of Oz</em>.
</details>

