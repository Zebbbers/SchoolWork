//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab5Task3
{
  
  public static void main (String [] args)
  {
   Scanner keyboard = new Scanner(System.in);  //creating scanner 
   
   double calories = 0;
   double fat      = 0;
   double totCal   = 0;
   double fatCal   = 0;
   double fatPer   = 0;
   
   System.out.println("please enter the amount of calories and the grams of fat");
   
   calories = keyboard.nextDouble();
   fat = keyboard.nextDouble();
   
   fatCal = fat * 9;
   
   totCal = fatCal + calories;
   
   fatPer = fatCal/totCal;
   
   if (fatCal > totCal)
   {
     System.out.println("error");
   }
   else
   { if (fatPer < .30)
     {
       System.out.println("This food is low in fat");
     }
     System.out.printf("The calories are %.1f the fat is %.1f the total calories" + 
                        " is %.1f the fat calories is %.1f and finally the fat " +
                       "percentage is %.2f",calories,fat,totCal,fatCal,fatPer);
   }
                        
     
  }
}   
     

   