----------

## Iterating Over Strings

You have seen how you can make a copy of individual characters in a string with their index. Iterating over a string allows you to deal with each character of a string individually. You start with the character at index `0` and move through the end of the string.

```java
String my_string = "Hello world";

for (int i = 0; i < my_string.length(); i++) {
  System.out.print(my_string.charAt(i));
}
```

{Try it}(sh .guides/bg.sh javac code/strings/StringForLoop.java java -cp code/strings/ StringForLoop 1)

|||challenge
## What happens if you:
* Change the value of `my_string` to `"10, 11, 12, 13, 14"`?
* Change the value of `my_string` to `"\u25A3\u25A8\u25D3\u25CC\u25A2"`?
* Change the `print` statement to `System.out.println(my_string.charAt(i))`?
* Change the `print` statement to `System.out.print(my_string)`?

|||

{Try it}(sh .guides/bg.sh javac code/strings/StringForLoop.java java -cp code/strings/ StringForLoop 2)

## Behind the Scenes

Use the code visualizer below and step through the code. Notice how the iterating variable `i` goes through each index from beginning to end.

<iframe width="800" height="500" frameborder="0" src="http://pythontutor.com/iframe-embed.html#code=public%20class%20StringForLoop%20%7B%0A%20%20public%20static%20void%20main%28String%20args%5B%5D%29%20%7B%0A%20%20%20%20%0A%20%20%20%20//add%20code%20below%20this%20line%0A%20%20%20%20%0AString%20my_string%20%3D%20%22Hello%20world%22%3B%0A%0Afor%20%28int%20i%20%3D%200%3B%20i%20%3C%20my_string.length%28%29%3B%20i%2B%2B%29%20%7B%0A%20%20System.out.print%28my_string.charAt%28i%29%29%3B%0A%7D%0A%20%20%20%20%0A%20%20%20%20//add%20code%20above%20this%20line%0A%20%20%7D%0A%7D&codeDivHeight=400&codeDivWidth=350&cumulative=false&curInstr=0&heapPrimitives=nevernest&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false"> </iframe>

{Check It!|assessment}(fill-in-the-blanks-3929791507)
