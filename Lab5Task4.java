//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab5Task4
{
  
  public static void main (String [] args)
  {
   Scanner keyboard = new Scanner(System.in);  //creating scanner
     
   int num1 = 0;
   
    System.out.println("Enter a number between 1 and 5"); // prompt user
    
    num1 = keyboard.nextInt();        //user input
    
    switch(num1)
    {
    case 1:
    System.out.println("1 = I");    //switch statment with its cases statments
    break;
    case 2:
    System.out.println("2 = II");
    break;
    case 3:
    System.out.println("3 = III");
    break;
    case 4:
    System.out.println("4 = IV");
    break;
    case 5:
    System.out.println("5 = V"); 
    break;
    default:
      System.out.println("a number between 1 and 5 was not entered");  //incase of error
    }
  }
}