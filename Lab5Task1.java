//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab5Task1
{
  
  public static void main (String [] args)
  {
   Scanner keyboard = new Scanner(System.in);             //creating scanner
  
   double mass   = 0;                                     //declaring variables
   double weight = 0;
     
     System.out.println("Please enter the objects mass"); //prompts user
     
     mass = keyboard.nextDouble();                        //user input
     
     weight = mass * 9.8;                                 // math to calculate weight
     
     if (weight > 1000)                                   //scans for heavy object
       System.out.println("the object is too heavy");
     
     else if (weight <= 1000 && weight >= 10)             //checks for correct weight parameters
       System.out.println("The object's weight is " + weight);
     
     else                                                 //checks if weight is too small
       System.out.println("The object is too light");
  }
}