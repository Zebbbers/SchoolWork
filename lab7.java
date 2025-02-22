public class lab7 {
   public static void main(String[] args) {
      // Create a new Book object for The Great Gatsby
      Book theGreatGatsby = new Book(1234, "The Great Gatsby", 1, "F. Scott Fitzgerald");

      // Print out the book's details
      System.out.println(theGreatGatsby.toString());

      // Add another copy of the book to the library
      theGreatGatsby.addItem();

      // Print out the updated book details
      System.out.println(theGreatGatsby.toString());
   }
}