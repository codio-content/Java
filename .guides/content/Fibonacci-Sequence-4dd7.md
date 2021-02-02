----------

## Fibonacci Number

A Fibonacci number is a number in which the current number is the sum of the previous two Fibonacci numbers.

![Fibonacci Sequence](.guides/img/fibonacci.png)

Calculating a Fibonacci number is self-similar, which means it can be define with recursion. Setting the base case is important to avoid infinite recursion. When the number `n` is 0 the Fibonacci number is 0, and when `n` is 1 the Fibonacci number is 1. So if `n` is less than or equal to 1, then return `n`. That is the base case.

```java
public class Fibonacci {
  public static void main(String[] args) {
    
    //add code below this line

    System.out.println(fibonacci(3));

    //add code above this line
  }
  
  //add method definitions below this line
  
  /**
  * @param integer n
  * @return Fibonacci number of n, integer
  */
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return(fibonacci(n-1) + fibonacci(n-2));
    }
  }
  
  //add method definitions above this line

}
```

[Code Visualizer](open_tutor code/recursion/Fibonacci.java)
{Try it}(sh .guides/bg.sh javac code/recursion/Fibonacci.java java -cp code/recursion/ Fibonacci 1)

|||challenge
## What happens if you:
* Change the print statment to `System.out.println(fibonacci(0));`?
* Change the print statment to `System.out.println(fibonacci(8));`?
* Change the print statment to `System.out.println(fibonacci(30));`?

|||

<details>
  <summary><strong>Where is the code visualizer?</strong></summary>
  The code visualizer will only step through your code 1,000 times. These recursive functions exceed this limit and generate an error message. Because of this, the code visualizer was removed.
</details><br>

{Try it}(sh .guides/bg.sh javac code/recursion/Fibonacci.java java -cp code/recursion/ Fibonacci 2)

## Fibonacci Sequence

Fibonacci numbers are most often talked about as a sequence. The code below adds the functionality of printing a Fibonacci sequence of predetermined length.

```java
    //add code below this line

    int fibonacciLength = 10;
    for (int num = 0; num < fibonacciLength; num++) {
      System.out.println(fibonacci(num));
    }

    //add code above this line
```

[Code Visualizer](open_tutor code/recursion/Fibonacci.java)
{Try it}(sh .guides/bg.sh javac code/recursion/Fibonacci.java java -cp code/recursion/ Fibonacci 3)

|||challenge
## What happens if you:
* Change `fibonacciLength` to 30?
* Change `fibonacciLength` to 50?

|||

{Try it}(sh .guides/bg.sh javac code/recursion/Fibonacci.java java -cp code/recursion/ Fibonacci 4)

<details>
  <summary><strong>Why is Java timing out?</strong></summary>
  The code written above is terribly inefficient. Each time through the loop, Java is calculating the same Fibonacci numbers again and again. When <code>num</code> is 1, Java calculates the Fibonacci numbers for 0 and 1. When <code>num</code> is 2, Java is calculating the Fibonacci numbers for 0, 1, and 2. Once <code>num</code> becomes large enough, it becomes too much work for Java to have to recalculate these large numbers over and over again. There is a more efficient way to do this by using a data structure called a hash table. The idea is to store previously calculated Fibonacci numbers in the hash table. So instead of recalculating the same numbers again and again, you can get these numbers from the hash table. If a Fibonacci number is not in the hash table, then calculate it and add it to the hash table. Data structures are a bit beyond the scope of these lessons, but here is the code of a more efficient way to calculate and print the Fibonacci sequence. Copy and paste the code below into the IDE if you want to run it.

  ```java
  import java.util.*;

  public class Fibonacci {
    public static void main(String[] args) {

      //add code below this line
      Map<Integer, Long> fibCache = new HashMap<>(); 
      int fibonacciLength = 90;
      for (int num = 0; num < fibonacciLength; num++) {
        System.out.println(fibonacci(num, fibCache));
      }
      //add code above this line
    }

    //add method definitions below this line
    public static long fibonacci(int n, Map<Integer, Long> h) {
      if (!h.containsKey(n)) {
        h.put(n, calculateFib(n, h));
      }
      return h.get(n);
    }

    public static long calculateFib(int n, Map<Integer, Long> h) {
      if (n <= 1) {
        return n;
      } else {
        return fibonacci(n-1, h) + fibonacci(n-2, h);
      }
    }
    //add method definitions above this line
  }
  ```
  
</details>
  
{Check It!|assessment}(multiple-choice-3931991688)
