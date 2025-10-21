public class Fruits extends Grocery {


    private boolean isFromTree;

    public Fruits() {
        isFromTree = true; 
    }
    public Fruits(boolean isFromTree) {
      this.isFromTree = isFromTree;
    }
        

    public boolean isFromTree() {
      return isFromTree;
    }
  public void setisFromTree(boolean isFromTree) {
    isFromTree = true; 
  }
  public String toString() {
    return super.toString() +  "\nFruits: " + isFromTree;
   
  }
  
}
