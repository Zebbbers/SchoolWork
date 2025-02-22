//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab7Task2
{
 
 public static void main (String [] args)
 {  

   System.out.println("    Temperature (Degree)    ");
   System.out.println("----------------------------");  //making the chart look nice
   System.out.println("Celsius " + "     Fahrenheit");
      
   int count = 20;
   double f  = 0;     //variables
   double c  = -1;

   for(double i = 0; i <= count; i++)  //loop
   {
    f = 9/5.0*i+32;      //math
    System.out.printf("%.0f               %.2f       \n",i,f); //output
   }
 }
}