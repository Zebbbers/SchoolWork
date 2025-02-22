//Zeb Jackson
//Cosc 236
import java.util.Scanner;
public class Lab3Task3
{
  
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in); //creating scanner
    double price       = 0;                  //delaring varibales
    double percent     = 0.4;
    double totalProfit = 0;
    
    System.out.println("What is the retail price?"); // asking user
    
    price = keyboard.nextDouble();  //inputing data
    
    totalProfit = price * percent; // math
    
    System.out.println("The total profit is " + totalProfit); //output
  }
}
    
    
    
    
   
    