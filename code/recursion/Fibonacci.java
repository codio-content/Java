import java.util.*;

public class Fibonacci {
  public static void main(String args[]) {
    
    //add code below this line
    Hashtable fibCache = new Hashtable(); 
    int fibonacciLength = 50;
    for (int num = 0; num < fibonacciLength; num++) {
      System.out.println(fibonacci(num, fibCache));
    }

    //add code above this line
  }
  
  //add method definitions below this line
    
  public static int fibonacci(int n, Hashtable h) {
    if (!h.contains(n)) {
      h.put(n, calculateFib(n, h));
    }
    return (Integer)h.get(n);
  }
  
  public static int calculateFib(int n, Hashtable h) {
    if (n <= 1) {
      return n;
    } else {
      int fib = fibonacci(n-1, h) + fibonacci(n-2, h);
      return fib;
    }
  }
  
  //add method definitions above this line

}