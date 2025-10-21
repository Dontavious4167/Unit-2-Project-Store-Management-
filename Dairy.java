public class Dairy extends Grocery {
  
  // instance variables 
  private String animal; 
// no argument constructers 
  // make the String value Dairy to Cow 
  public Dairy() {
   this("Cow");

  
  } 
  // argument constructer 
  // declares the Diary class for animal 
  public Dairy(String animal) {
    this.animal = animal;
    
  }
// accessor method 
// gets the animal so it returns the animal "cow"
  public String getAnimal() {
      return animal; 
  }
  // mutator method 
  // sets animal as cow 
  public void setAnimal(String animal) {
    this.animal = animal;
  }
  // to string 
  // returns all value in the code 
  public String toString() {
    return super.toString()  + "\nAnimal: " + animal; 
  

  }
   
}


