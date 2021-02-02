----------

## Java Code Documentation

Including Java code documentation prior to method definitions is standard. Doing so enables users to gain clarity on the purpose of the method, any parameters that are used, and what the method returns. Users can also see who wrote the method as well as what version the method is on. Here is an example, also present within the text editor to your left:

```java
/**
 * This is an example Javadoc
 * 
 * @author  FirstName LastName
 * @version 1.0
 */
public class Javadoc {

/**
 * This method greets the user twice
 * 
 * @param   specify parameters if any
 * @return  specify return value if any
 */
  public static void greetTwice() {
    System.out.println("Hello");
    System.out.println("Hello");
  }

  public static void main(String args[]) {
    greetTwice();
  }

}
```

{Try it}(sh .guides/bg.sh javac code/methods/Javadoc.java java -cp code/methods/ Javadoc 1)

The Java code documentation does not affect the output of the code. However, it provides more clarity to how the method is used.

## Javadoc Tool

There is a Javadoc tool that is available which can take in a Java file and generate an HTML page with all of the documentation. For more information, you may visit the Javadoc website at this link: [Javadoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html). However, for the purposes of this module, we will only focus on self-created documentation. In particular, we will be using mostly `@param` for parameters and `@return` for return values.

{Check It!|assessment}(fill-in-the-blanks-347897813)
