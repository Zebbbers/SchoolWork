import java.util.*;
public class cosc237Lab1Task1{  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    int numberToGuess = random.nextInt(90) + 10;
    int playerGuess;
    int numberOfTries = 0;
    String promt = "Please enter an Integer.";
    boolean hasWon = false;

    System.out.println("Try to guess my secret two-digit number, and I'll tell you how many digits from your guess appear in my number.");
    System.out.println("Be smart! You can try at most 10 times.");

    while (numberOfTries < 10 && hasWon == false) {
      System.out.print("Enter your guess: ");
      playerGuess = getInt(in, promt);
      
      while(playerGuess > 99 || playerGuess < 10){
        System.out.println("Please enter a 2 digit number");
        playerGuess = getInt(in, promt);
      }
      
      if (playerGuess == numberToGuess) {
        System.out.println("Congratulations! You won!");
        hasWon = true;
      }
      if (playerGuess % 10 == numberToGuess % 10 || playerGuess / 10 == numberToGuess % 10 || playerGuess % 10 == numberToGuess / 10 || playerGuess / 10 == numberToGuess / 10) {
        System.out.println("One of the numbers is in the answer!");
      } else {
        System.out.println("Neither digit of your guess is in the answer.");
      }

      numberOfTries++;
    }

    if (!hasWon) {
      System.out.println("Sorry, you lost. The number was " + numberToGuess + ".");
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
