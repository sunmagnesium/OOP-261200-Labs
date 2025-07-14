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
  //Apply discount to the price
  public void applyDiscount(Double discount){
    if(discount>0.00 && discount<100.00){
        double discountAmount = price * (discount/ 100.0);
        double newPrice = price - discountAmount;
        price = newPrice;
        System.out.println("the discount percentage applied and the updated price.");
    }else{
      System.out.println("invalid discount percentage. Must be between 0.0 and 100.0");
    }
  }
}