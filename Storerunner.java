import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Create Grocery object
    Grocery groceryItem = new Grocery(3.99, "Bread", true);
    System.out.println("Grocery");
    System.out.println(groceryItem);
    System.out.println();

    // Create Dairy object
    Dairy milk = new Dairy("Cow");
    milk.setName("Milk");
    milk.setPrice(4.25);
    milk.setisInStock(true);
    System.out.println("Dairy");
    System.out.println(milk);
    System.out.println();

    // Create Fruits object
    Fruits apple = new Fruits(true);
    apple.setName("Apple");
    apple.setPrice(1.50);
    apple.setisInStock(true);
    System.out.println("Fruits");
    System.out.println(apple);
    System.out.println();

    input.close();
  }
}
