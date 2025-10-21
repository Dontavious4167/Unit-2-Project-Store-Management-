public class Dairy extends Grocery {
  
  // instance variables 
  private String animal; 
// no argument constructers 
  public Dairy() {
   this("Cow");

  
  } 
  // argument constructer 
  public Dairy(String animal) {
    this.animal = animal;
    
  }
// accessor method 
  public String getAnimal() {
      return animal; 
  }
  // mutator method 
  public void setAnimal(String animal) {
    this.animal = animal;
  }
  // to string 
  public String toString() {
    return super.toString()  + "\nAnimal: " + animal; 
  

  }
   
}


