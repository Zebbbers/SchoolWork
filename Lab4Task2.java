//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab4Task2
{
  
  public static void main (String [] args)
  {
   Scanner keyboard = new Scanner(System.in);  //creating scanner
   
   int num1 = 0;
   
    System.out.println("Enter a number between 1 and 5"); // prompt user
    
    num1 = keyboard.nextInt();        //user input
    
    if (num1 == 1)
    System.out.println("1 = I");    //if and else if statments
    
    else if (num1 == 2)
    System.out.println("2 = II");
    
    else if (num1 == 3)
    System.out.println("3 = III");
    
    else if (num1 == 4)
    System.out.println("4 = IV");
    
    else if (num1 == 5)
    System.out.println("5 = V"); 
    
    else 
      System.out.println("a number between 1 and 5 was not entered");  //incase of error
    
    
  }
}