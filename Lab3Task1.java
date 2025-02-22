//Zeb Jackson
//Cosc 236
import java.util.Scanner;
public class Lab3Task1
{
  
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in); // creating scanner
    double miles, gallons, mpg; // declaring variables
    miles   = 0; 
    gallons = 0;
    mpg     = 0;

    System.out.println("How many miles have been driven?"); //asking user forinput
    miles = keyboard.nextDouble(); //priming varibale
    
    System.out.println("How many gallons have been used?");//asking user fot input
    gallons = keyboard.nextDouble(); //priming varribale
    
    mpg = miles/gallons; //math 
    System.out.println("Your miles per gallon is " + mpg); //final output
  }
}