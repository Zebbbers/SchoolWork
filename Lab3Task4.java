//Zeb Jackson
//Cosc 236
import java.util.Scanner;
public class Lab3Task4
{
  
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in);                                     // line 9 creating scanner
    double salePrice  = 0;                                                         // line 10 declaring variables
    double stateRate  = 0.04;
    double countyRate = 0.02;
    double stateTax   = 0;
    double countyTax  = 0;
    double taxTotal   = 0;
    double finalPrice = 0;
    
    System.out.println("What is your original sale price");                        // line 18 asking user
    
    salePrice = keyboard.nextDouble();                                             // line 20 user input
    
    stateTax  = salePrice * stateRate;
    countyTax = salePrice * countyRate;                                            // line 22-24 tax math
    taxTotal  = countyTax + stateTax;
    
    System.out.println("The state tax is " + stateTax + ", the county tax is " +
                       countyTax + ", so the total tax is " + taxTotal);           // line 26,27 explaining tax
    
   finalPrice = taxTotal + salePrice;                                        // line 29 math to make final price
   
    System.out.println("Your orininal price was " + salePrice + " but with tax," +
                       " your total is " + finalPrice);                            // line 31,32 final output
    
                       
  }
}
    