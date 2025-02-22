//Zeb Jackson
//Cosc 236
import java.util.Scanner;
public class Lab3Task2
{
  
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in); // creating scanner
    double score1  = 0;                        // declaring variables
    double score2  = 0;
    double score3  = 0;
    double testAvg = 0;
    
    System.out.println("What three scores would you like to avrage?"); //asking user
    
    score1 = keyboard.nextDouble(); //gathering data
    score2 = keyboard.nextDouble();
    score3 = keyboard.nextDouble();
    
    testAvg = (score1 + score2 + score3) / 3; //math
    
    System.out.println("The average test score is " + testAvg); //output
  }
}
    
    
    
      