public class Grocery {

  // instance variables 
  private double price;
  private String name; 
  private boolean isInStock;

  // no arguement constructer 
  public Grocery() {
    // assign values to each variable
    price = 5.0; 
    name = "no name";
    isInStock = true;
  }
  // arguement constructer 
  public Grocery(double price, String name, boolean isInStock) {
    this.price = price; 
    this.name = name;
    this.isInStock = isInStock;
  }
// accessor methods 
// makes it where it returns all the values 
  public double getPrice() {
    return price;
  }
  public String getName() {
    return name;
  }
  public boolean isInStock() {
    return isInStock;
  }
 // mutator methods 
  // sets all the instances variables 
  public void setPrice(double price) {
    this.price = price;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setisInStock(boolean isInStock) {
    this.isInStock = isInStock;
  }
// to string 
  // returns all the values 
  public String toString() {
    return "name: " + name + "\nprice: " + price + "\nisInStock: " + isInStock;
    
  }

}

