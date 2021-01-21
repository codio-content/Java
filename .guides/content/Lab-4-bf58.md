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
    String writePath = "studentFolder/labs/encrypted.txt";
    //add code above this line 
```

Now add the `try`, `catch`, and `finally` blocks. Create `BufferedReader` and `BufferedWriter` objects in the `try` block, while printing the appropriate messages in the other blocks. Running the program should print the message about reading and writing to a file.

```java
    //add code below this line
    String readPath = "studentFolder/labs/source.txt";
    String writePath = "studentFolder/labs/encrypted.txt";
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
    String writePath = "studentFolder/labs/encrypted.txt";
    try {
      BufferedReader source = new BufferedReader(new FileReader(readPath));
      BufferedWriter destination = new BufferedWriter(new FileWriter(writePath));
      int key = 13;
      String mode = "encrypt";
      final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !?.,-";
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
    String writePath = "studentFolder/labs/encrypted.txt";
    try {
      BufferedReader source = new BufferedReader(new FileReader(readPath));
      BufferedWriter destination = new BufferedWriter(new FileWriter(writePath));
      int key = 13;
      String mode = "encrypt";
      final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !?.,-";
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
The Caesar cipher can only encrypt those characters that are in the `SYMBOLS` variable. Iterate over the string `line`, where `ch` represents each character of the string. Create the variable `charIndex` and set its value to `-1`. This variable will represent if `ch` is in `SYMBOLS`. Next, iterate over `SYMBOLS`. Ask if `ch` is equal to each character of `SYMBOLS`. If yes, set the value of `charIndex` to `i` which is the index of the character in the string `SYMBOLS`. To summarize, if `charIndex` is `-1`, then the character in `line` is not found in `SYMBOLS`. If `charIndex` is not equal to `-1`, then the character in `line` is found in `SYMBOLS` and `charIndex` represents the character's index in `SYMBOLS`

```java
      String line = reader.readLine();
      for (char ch : line.toCharArray()) {
        int charIndex = -1;
        for (int i = 0; i < SYMBOLS.length(); i++) {
          if (ch == SYMBOLS.charAt(i)) {
            charIndex = i;
          }
        }
      }
```

You only want to encrypt characters that appear in `SYMBOLS`, so determine if `charIndex` is not equal to `-1` (the character is in `SYMBOLS`). Then determine if you are encrypting or decrypting the text. If encrypting, add `key` to `charIndex`; if you are decrypting, subtract `key` from `charIndex`.

```java
      String line = reader.readLine();
      for (char ch : line.toCharArray()) {
        int charIndex = -1;
        for (int i = 0; i < SYMBOLS.length(); i++) {
          if (ch == SYMBOLS.charAt(i)) {
            charIndex = i;
          }
        }
        if (charIndex != -1) {
          if (mode.equals("encrypt")) {
            int newIndex = key + charIndex;
          } else if (mode.equals("decrypt")) {
            int newIndex = charIndex - key;
          }
        }
      }
```

It is possible that `newIndex` is less than 0 or greater than the length of `SYMBOLS`. These indexes will cause a problem. If `newIndex` is negative, add it to the length of `SYMBOLS`. If `newIndex` is greater than the length of `SYMBOLS`, subtract the length of `SYMBOLS`. 

```java
      String line = reader.readLine();
      for (char ch : line.toCharArray()) {
        int charIndex = -1;
        for (int i = 0; i < SYMBOLS.length(); i++) {
          if (ch == SYMBOLS.charAt(i)) {
            charIndex = i;
          }
        }
        if (charIndex != -1) {
          if (mode.equals("encrypt")) {
            int newIndex = key + charIndex;
          } else if (mode.equals("decrypt")) {
            int newIndex = charIndex - key;
          }
        }
        if (newIndex < 0) {
          newIndex = newIndex + SYMBOLS.length();
        } else if (newIndex > SYMBOLS.length()) {
          newIndex = newIndex - SYMBOLS.length();
        }
      }
```

Now that you have a new index, find the character in `SYMBOLS` with this new index and append it to the variable `newText`. After iterating through the entire line, write `newText` to file `destination`. This program reads up until a newline character, but it does not write a newline character to the destination file. Use the `newLine` method to add a newline character to the destination file.

```java
      String line = reader.readLine();
      for (char ch : line.toCharArray()) {
        int charIndex = -1;
        for (int i = 0; i < SYMBOLS.length(); i++) {
          if (ch == SYMBOLS.charAt(i)) {
            charIndex = i;
          }
        }
        if (charIndex != -1) {
          if (mode.equals("encrypt")) {
            int newIndex = key + charIndex;
          } else if (mode.equals("decrypt")) {
            int newIndex = charIndex - key;
          }
        }
        if (newIndex < 0) {
          newIndex = newIndex + SYMBOLS.length();
        } else if (newIndex > SYMBOLS.length()) {
          newIndex = newIndex - SYMBOLS.length();
        }
        newText += SYMBOLS.charAt(newIndex);
      }
      destination.write(newText);
      destination.newLine();
```

{Try it}(sh .guides/bg.sh javac code/files/Lab4.java java -cp code/files/ Lab4 2)
[Open Encrypted File](open_file studentFolder/labs/encrypted.txt)

<details>
  <summary><strong>Code</strong></summary>
  
  ```java
  import java.io.*;

  public class Lab4 {
    public static void main(String args[]) {
    
      //add code below this line
      String readPath = "studentFolder/labs/source.txt";
      String writePath = "studentFolder/labs/encrypted.txt";
      try {
        BufferedReader source = new BufferedReader(new FileReader(readPath));
        BufferedWriter destination = new BufferedWriter(new FileWriter(writePath));
        int key = 13;
        String mode = "encrypt";
        final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !?.,-";
        String newText = "";
        while (source.ready()) {
          String line = source.readLine();
          int newIndex = -1;
          for (char ch : line.toCharArray()) {
            int charIndex = -1;
            for (int i = 0; i < SYMBOLS.length(); i++) {
              if (ch == SYMBOLS.charAt(i)) {
                charIndex = i;
              }
            }
            if (charIndex != -1) {
              if (mode.equals("encrypt")) {
                newIndex = key + charIndex;
              } else if (mode.equals("decrypt")) {
                newIndex = charIndex - key;
              }
            }
            if (newIndex < 0) {
              newIndex = newIndex + SYMBOLS.length();
            } else if (newIndex > SYMBOLS.length()) {
              newIndex = newIndex - SYMBOLS.length();
            }
            newText += SYMBOLS.charAt(newIndex);
          }
          destination.write(newText);
          destination.newLine();
        }

        source.close();
        destination.close();
      } catch (Exception e) {
        System.out.println(e);
      } finally {
        System.out.println("Finished reading and writing to a file");
      }
      //add code above this line
    }
  }
  ```
  
</details>

### Decrypting the File
To decrypt the file, a few changes need to be made to your code. The source file should be the encrypted file, and the destination file will be the file `decrypted.txt`. 

```java
    //add code below this line
    String readPath = "studentFolder/labs/encrypted.txt";
    String writePath = "studentFolder/labs/decrypted.txt";
```

Finally, change the mode of the cipher to `"decrypt"`.

```java
      String mode = "decrypt";
```

{Try it}(sh .guides/bg.sh javac code/files/Lab4.java java -cp code/files/ Lab4 3)
[Open Decrypted File](open_file studentFolder/labs/decrypted.txt)

<details>
  <summary><strong>Source Text</strong></summary>
  The original text for this lab is the <a href="http://www.gutenberg.org/files/55/55-h/55-h.htm#chap01">opening paragraph</a> from L. Frank Baum's <em>The Wizard of Oz</em>.
</details>

{Check It!|assessment}(multiple-choice-1705630447)
