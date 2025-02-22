//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab9Task1 
{//start class
  public static void main(String[] args) //declaring main
  {//start main
    
    double finalPrice = calculateRetail(); //calling the function 
    System.out.println("Your final price is " + finalPrice);
  } //end main
    
    public static double calculateRetail()
    {//starting new function
      
     Scanner keyboard = new Scanner(System.in); //scanner
     System.out.println("Please enter your items price");
     double cost   = keyboard.nextDouble();
     System.out.println("Please enter the markup percentage(50% = .50)");
     double markup = keyboard.nextDouble();
     
     double finalPrice = 0;
     finalPrice = cost * (markup + 1);//math to make the final cost
                                  
     return finalPrice;
    }//end of new function
}//end class