public class main {
      public static void main(String[] args) {
   

    Book book = new Book("Java Programming", "John Doe", 1000.00);
    book.applyDiscount(-20.0);   // Should show error
    book.applyDiscount(25.00); // Should apply 25% discount
    book.displayDetails();     // Should show updated price (750.00)


    
  }

}
