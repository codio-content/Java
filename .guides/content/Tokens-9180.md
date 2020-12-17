----------

## Tokens

Often times when reading text from a file, you will want to parse or analyze the text. Imagine if you wanted to read a file but only print those words that start with a vowel. After reading the line of text, you would need "break up" the string into individual words. These substrings of the original string are known as tokens. This page goes over two ways to create tokens from a string.

The first way of creating tokens is using the string method `split`. This method takes a delimiter as a parameter. A delimiter is the character used to split the string. The `split` method returns an array of strings. The code below will read just the first line of the file and then split it into words since a space is the delimiter. Finally, use an enhanced loop to iterate through the array and print each token.

```java
import java.io.*;

public class Tokens {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line = reader.readLine();
      String [] tokens = line.split(" ");
      for (String t: tokens) {
        System.out.println(t);
      }
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

{Try it}(sh .guides/bg.sh javac code/files/Tokens.java java -cp code/files/ Tokens 1)

|||challenge
## Try these variations:
* Change the delimiter to the string `"a"`
* Change the delimiter to the string `";"`

<details>
  <summary><strong>Explaining the Output</strong></summary>
  Notice that when the delimiter is <code>"a"</code> that the letter "a" no longer appears in the tokens. When the delimiter does not appear in the line of text, then one token (the original line of text) is made.
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/Tokens.java java -cp code/files/ Tokens 2)

## String Tokenizer

Java has the `StringTokenizer` class which allows you to convert strings into tokens with some added features when compared to the `split` method. You need to import the `java.util` package. When instantiating a `StringTokenizer` object, it requires a string and a delimiter as parameters. The methods `hasMoreTokens` (returns a Boolean) and `nextToken` (returns a string) allow you to iterate over the tokens.

```java
import java.io.*;
import java.util.*;

public class Tokens {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line = reader.readLine();
      StringTokenizer tokens = new StringTokenizer(line, " ");
      while (tokens.hasMoreTokens()) {
        System.out.println(tokens.nextToken());
      }
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

{Try it}(sh .guides/bg.sh javac code/files/Tokens.java java -cp code/files/ Tokens 3)

To convert the entire file to tokens, you will use two nested loops. The first iterates over each line in the file. Use a while loop and the `ready` method from the previous page to read the file. The second loop transforms the string into tokens using another while loop and the `hasMoreTokens` method.

```java
import java.io.*;
import java.util.*;

public class Tokens {
  public static void main(String args[]) {
    
    //add code below this line
    String path = "studentFolder/text/readPractice.txt";
    try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
      while (reader.ready()) {
        String line = reader.readLine();
        StringTokenizer tokens = new StringTokenizer(line, " ");
        while (tokens.hasMoreTokens()) {
          System.out.println(tokens.nextToken());
        }
      }
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

{Try it}(sh .guides/bg.sh javac code/files/Tokens.java java -cp code/files/ Tokens 4)

|||challenge
## Try this variation:
* Change the delimiter to `a` and add `true` as a parameter:
```java
new StringTokenizer(line, "a", true);
```

<details>
  <summary><strong>Explaining the Output</strong></summary>
  The Boolean `true` means that delimiter will be included with the tokens. The delimiters will be their own token. Delimiters are always excluded from the tokens when using `split`.
</details>

|||

{Try it}(sh .guides/bg.sh javac code/files/Tokens.java java -cp code/files/ Tokens 5)

{Check It!|assessment}(parsons-puzzle-2176276099)
