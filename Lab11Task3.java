//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab11Task3
{
 public static void main (String [] args)
 {
   Scanner keyboard = new Scanner (System.in);
   System.out.println("How many days do you want to calculate?");
   int days = keyboard.nextInt();
   int i = 0;
   int x = 0;
   int h =0;
   double sum = 0;
   double avg = 0;
   double[] temps;
   while(x < days)
    {
    int c = x + 1;
    System.out.println("What was the temp on " +c);
    double temp = keyboard.nextDouble();
    temps = new double[days];
    temps[x] = temp;
    sum = sum + temps[x];
    x++;
    }
    avg = sum/days;
    
    System.out.println("the average temp was " + avg);
    System.out.println("there were " + h + " days above average" );
  }
 }