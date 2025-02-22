//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab7Task3
{
 
 public static void main (String [] args)
 {   
Scanner keyboard = new Scanner(System.in);                               //creating scanner

    double endSalary = 0;
    double currentPay = 0.01;                          //starts at 1 penny

    System.out.println("How many days did you work?");
    int daysWorked = keyboard.nextInt();            //user input

    if (daysWorked < 1) 
    { 
    System.out.println("Invalid input: " + daysWorked + ", please try again!"); //input validation
    }
    
    System.out.println("Days Worked          Money Earned"); 
    System.out.println("_________________________________"); //making chart look pretty

    for (int day = 1; day <= daysWorked; day++)
    {      
      System.out.println(  day + "                    " + currentPay);
      endSalary += currentPay;      
      currentPay = currentPay * 2;
    }
    
    System.out.printf("Your total salary is  \n %.2f \n",endSalary); //end rounded number

  }
 }
