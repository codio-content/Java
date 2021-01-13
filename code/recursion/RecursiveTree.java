public class RecursiveTree {
  public static void main(String[] args) {
    
    //add code below this line
    
    Turtle t = new Turtle(0, 0);
    t.left(90);
    t.speed(10);
    recursiveTree(50, 20, t);
    
    //add code above this line
  }
  
  //add method definitions below this line
  
  /**
  * @param integer branchLength
  * @param integer angle
  * @param Turtle t
  * @return draws a branch of the tree
  */
  public static void recursiveTree(int branchLength, int angle, Turtle t) {
    if (branchLength > 5) {
      t.forward(branchLength);
      t.right(angle);
      recursiveTree(branchLength - 5, angle, t);
      t.left(angle * 2);
      recursiveTree(branchLength - 5, angle, t);
      t.right(angle);
      t.backward(branchLength);
    }
  }
  //add method definitions above this line
}