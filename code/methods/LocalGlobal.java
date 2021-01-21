public class LocalGlobal {
  
  //add code below this line

static String myVar = "global scope";

public static void printScope(String myVar) {
  String myVar = "local scope";
  System.out.println(myVar);
}

public static void main(String args[]) {
  printScope(myVar);
  System.out.println(myVar);
}

  //add code above this line
  
}