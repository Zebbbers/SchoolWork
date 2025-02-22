//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab11Task2
{
 public static void main (String [] args)
 {
   int sum = 0;
   int avg = 0;
   int min = 100;  //cannot initialize this as 0 or else it always has a min of 0
   int max = 0;
   int test = 0;
   
   int[]scores = {70,60,30,100,40};
   
   for(int i=0;i<5;i++)
   {
     sum = sum + scores[i]; 
     test = scores[i];
    if(test > max)  //saving largest number to max variable 
    max = test;
    if(test < min) //saving smallest nimber to min variable
     min = test;
   }
   avg = sum/5;
  System.out.println("The average is "   + avg);
  System.out.println("Maximum number : " + max);  //final outputs
  System.out.println("Minimum number : " + min);
   
 }
}