----------

## What is Recursion?

Solving a coding problem with functions involves breaking down the problem into smaller problems. When these smaller problems are variations of the larger problem (also know as self-similar), then recursion can be used. For example, the mathematical function factorial is self-similar. Five factorial (`5!`) is calculated as `5 * 4 * 3 * 2 * 1`. Mouse over the image below to see that `5!` is really just `5 * 4!`, and `4!` is really just `4 * 3!` and so on.

<div class="recursion"></div>

Because `5!` is self-similar, recursion can be used to calculate the answer. Recursive functions are functions that call themselves. Use the Code Visualizer to see how Java handles this recursive function.

```java
public class WhatIsRecursion {
  public static void main(String args[]) {
    
    //add code below this line

    System.out.println(factorial(5)); 

    //add code above this line
  }
  
  //add method definitions below this line
  
  /**
  * @param integer n
  * @return factorial of n, integer
  */
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
  //add method definitions above this line

}
```

[Code Visualizer](open_tutor code/recursion/WhatIsRecursion.java)
{Try it}(sh .guides/bg.sh javac code/recursion/WhatIsRecursion.java java -cp code/recursion/ WhatIsRecursion 1)

Recursion is an abstract and difficult topic, so it might be a bit hard to follow what is going on here. When `n` is 5, Java starts a multiplication problem of `5 * factorial(4)`. The function runs again and the multiplication problem becomes `5 * 4 * factorial(3)`. This continues until `n` is 1. Java returns the value `1`, and Java solves the multiplication problem `5 * 4 * 3 * 2 * 1`. The video below should help explain how `5!` is calculated recursively. 

<video src=".guides/video/recursion-video.m4v" class="recursion-video" controls></video>

## The Base Case

Each recursive function has two parts: the recursive case (where the function calls itself with a different parameter) and the base case (where the function stops calling itself and returns a value).

![Cases for Recursion](.guides/img/java-recursive-cases.png)

The base case is the most important part of a recursive function. Without it, the function will never stop calling itself. Like an infinite loop, Java will stop the program with an error.

```java
    /**
    * @param integer n
    * @return error
    */
    public static int factorial(int n) {
      return n * factorial(n - 1);
    }
```

[Code Visualizer](open_tutor code/recursion/WhatIsRecursion.java)
{Try it}(sh .guides/bg.sh javac code/recursion/WhatIsRecursion.java java -cp code/recursion/ WhatIsRecursion 2)

Always start with the base case when creating a recursive function. Each time the function is called recursively, the program should get one step closer to the base case.

|||challenge
## What happens if you:
* Add a base case for the `factorial` function?
* Change the print statement to `System.out.println(factorial(0));`?

Modify the base case so that `factorial(0)` does not result in an error. Test your new base case with a negative number.
<details>
  <summary><strong>Solution</strong></summary>
  The <a href="https://en.wikipedia.org/wiki/Factorial">factorial operation</a> only works with positive integers. So the base case should be:
  
  ```java
    public static int factorial(int n) {
      if (n <= 0) {
        return 1;
      } else {
        return n * factorial(n - 1);
      }
    }
  ```
              
</details>

|||

[Code Visualizer](open_tutor code/recursion/WhatIsRecursion.java)
{Try it}(sh .guides/bg.sh javac code/recursion/WhatIsRecursion.java java -cp code/recursion/ WhatIsRecursion 3)
  
{Check It!|assessment}(multiple-choice-3595242721)
