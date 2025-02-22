//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab5Task2
{
  
  public static void main (String [] args)
  {
   Scanner keyboard = new Scanner(System.in);  //creating scanner
   
   int quanty      = 0;
   double cost     = 0;
   double discPer  = 0;    //declaring variables
   double discount = 0;
   double saved    = 0;
   final int price = 99;
   
   System.out.println("How many items were purchased?"); //asking user
   
   quanty = keyboard.nextInt(); //user input
   
   if (quanty < 10)
   { discount = 0;       //each of these "if" and "else if" statments checks
     discPer  = 1;       //for the quantity purchased, then assigns both
   }                     //a displayed discound PERCENTAGE and discount rate to be used in math.
   else if (quanty >= 10 && quanty <= 19)
   {discount = 20;       //this line shows the displayed PErCENTAGE.
    discPer  = .8;       //this line is the actual discount that is used in math.
   }                     //In this example, a 20% discount would be the same as multiplying the price by .8
   else if (quanty >= 20 && quanty <= 49)
   {discount = 30;
    discPer  = .7;
   }
   else if (quanty >= 50 && quanty <= 99)
   {discount = 40;
    discPer  = .6;
   }
   else if (quanty >= 100)
   {discount = 50;
    discPer  = .5;
   }
   cost = (quanty * price) * discPer; //math, after the quantity and discount
   saved= (quanty * price) - cost;    //rates are selected.
   System.out.printf("The discount percentage is %.0f and the final price is %.2f, and you saved %.2f\n",discount,cost,saved); 
                    //the code above both displays the discount rate, the final price, and the ammount saved.
                    //I tested this with every possible compination of quantity and it works
                    //if you dont think this is correct, please test.
  }
}