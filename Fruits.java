    public class Fruits extends Grocery {

// instance varibales 
// instance varibes isFromTree
    private boolean isFromTree;
// argument no constructer 
// return as true 
    public Fruits() {
        isFromTree = true; 
    }
// arguement constructer 
    public Fruits(boolean isFromTree) {
      this.isFromTree = isFromTree;
    }
        
// accessor method 
// return instance variable
    public boolean isFromTree() {
      return isFromTree;
    }
  //mutator method 
// return instance variable as true 
  public void setisFromTree(boolean isFromTree) {
    isFromTree = true; 
  }
  // to string method 
  public String toString() {
    return super.toString() +  "\nFruits: " + isFromTree;
   
  }
  
}
