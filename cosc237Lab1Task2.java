import java.util.*;
public class cosc237Lab1Task2{  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter box size (between 5x5 and 21x21): ");
    String promt = "Please enter a number between 5 and 21";
    int size = getInt(in, promt);
    while (size < 5 || size > 21) {
      System.out.println("Invalid size. Please enter a size between 5 and 21.");
      System.out.print("Enter box size (between 5x5 and 21x21): ");
      size = in.nextInt();
    }
    System.out.print("Enter character for the box: ");
    char boxChar = in.next().charAt(0);
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
          System.out.print(boxChar);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static int getInt(Scanner in, String promt){
      System.out.println(promt);
      while(!in.hasNextInt()){
        System.out.println("ERROR! Please enter an Integer.");
          in.next();  //skips unwanted input
      }
      return in.nextInt(); 
    }
}