----------

## Count the Vowels
You are going to write a program that counts the number of vowels that appear in a string. For the purpose of this exercise, vowels are upper and lowercase `a, e, i, o, u`.

### Variables
For this project, you will need three variables. One will be the string. Another will be a char to represent each character of the string. The final variable will be a count of all the vowels.

```java
String myString = "The Brown Dog Jumps Over The Lazy Fox";
char ch;
int count = 0;
```

### String Iteration
Use a `for` loop to iterate through the string. Then set `ch` to check every character in the string.

```java
for (int i = 0; i < myString.length(); i++) {
  ch = myString.charAt(i);
}
```

### Checking for a Vowel
Use a conditional to see if the characters in the string are equal to any vowels. Make sure to account for both uppercase and lowercase vowels.

```java
if (ch == 'a' || ch == 'e' || ch == 'i' || 
    ch == 'o' || ch == 'u' || ch == 'A' ||
    ch == 'E' || ch == 'I' || ch == 'O' ||
    ch == 'U') {
```

**Note** that characters are wrapped in single quotes `' '`, not double quotes in Java.

### Incrementing the Counter
If `ch` equals any of the vowels, increment the `count` variable.

```java
count += 1;
```

### Printing the Result
The string may contain no vowels, one vowel, or more than one vowels. Thus, you'll need conditionals to output the appropriate responses.

```java
if (count == 0) {
  System.out.println("There are no vowels in the string.");
}
else if (count == 1) {
  System.out.println("There is 1 vowel in the string.");
}
else {
  System.out.println("There are " + count + " vowels in the string.");
}
```

{Try it}(sh .guides/bg.sh javac code/strings/Lab4.java java -cp code/strings/ Lab4 1)

You should see that there are 9 vowels in the string.

<details>
  <summary><strong>Code</strong></summary>
  
```java
String myString = "The Brown Dog Jumps Over The Lazy Fox";
char ch;
int count = 0;

for (int i = 0; i < myString.length(); i++) {
  ch = myString.charAt(i);
  if (ch == 'a' || ch == 'e' || ch == 'i' || 
      ch == 'o' || ch == 'u' || ch == 'A' ||
      ch == 'E' || ch == 'I' || ch == 'O' ||
      ch == 'U') {
    count += 1;
  }
}

if (count == 0) {
  System.out.println("There are no vowels in the string.");
}
else if (count == 1) {
  System.out.println("There is 1 vowel in the string.");
}
else {
  System.out.println("There are " + count + " vowels in the string.");
}
```
  
</details>

{Check It!|assessment}(multiple-choice-4005886288)
