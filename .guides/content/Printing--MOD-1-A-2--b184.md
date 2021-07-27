----------

## Printing without the Newline Character
The `print` command does not add a newline character. The code below will print the two words on the same line.

```java
System.out.print("Hello");
System.out.print("world!");
```

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundPrinting2.java java -cp code/fundamentals/ PlaygroundPrinting2 1 )

## Adding the Newline Character
The text in red shows the `println` command which adds the newline character. (The newline character is what is inserted when you press "Enter" or "Return").

![Newline Character](.guides/img/NewlineCharacter.png)

Add a second line by using the `println` command.

```java
System.out.print("Hello");
System.out.println("world!");
System.out.println("My name is Codio");
```

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundPrinting2.java java -cp code/fundamentals/ PlaygroundPrinting2 2 )

|||challenge
## What happens if you:
* Leave out the `;`
* Leave out the `System.out.`

|||

{Try it}(sh .guides/bg.sh javac code/fundamentals/PlaygroundPrinting2.java java -cp code/fundamentals/ PlaygroundPrinting2 3 )

{Check It!|assessment}(multiple-choice-2710921318)
