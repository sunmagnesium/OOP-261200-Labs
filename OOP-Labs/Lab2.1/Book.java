public class Book{
    //attribute
    private String title;
    private String author;
    private Double price;
    // Default constructor
    public Book() {
    this.title = "Unknown";
    this.author = "Unknown";
    this.price = 0.0;
  }
  //Parameter Constrcture
    public Book(String title,String author,Double price){
      this.title = title;
      this.author = author;
      this.price = price;
    }
    // Display book details
    public void displayDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price); 
  }
    // Update book price
    public void updatePrice(double newPrice) {
    if(newPrice>=0){
      this.price=newPrice;
    }
    else {
      System.out.println("Invalid price. Price cannot be negative.");
        }
  }
}