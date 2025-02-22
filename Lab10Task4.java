//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab10Task4
{//start of class
  public static void main(String[] args) //declaring main
  {//start main
  Scanner keyboard = new Scanner(System.in);  //creating scanner
  double mph = 0;
  double hours = 0;    //variables
  System.out.println("please type your speed"); //input
  mph = keyboard.nextDouble();
  System.out.println("please type your time travled"); //input
  hours = keyboard.nextDouble();
   while(hours <= 0 || mph <= 0)
   {
    System.out.println("please input a valid speed and time travled");
    mph = keyboard.nextDouble();   //input validation loop
    hours = keyboard.nextDouble();
   }
   distance(hours, mph);
  }//end main
   public static double distance(double hours,double mph)
   {//start distance
     int counter = 0;
     double distance = 0;
     
  System.out.println("hours_____________Distance"); //just here to make the table look nice
   while(hours != counter)
   {
   counter++;                    //setting up the counter and math and the table to 
   distance = mph * counter;     //display the hours and distance
   System.out.println("  " + counter + "                 " + distance); 
   }
   return distance;
  }//end distance
}//end class