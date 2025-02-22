//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab7Task1
{
 
 public static void main (String [] args)
 {   
Scanner keyboard = new Scanner(System.in);                               //creating scanner

       int min = 0;      
       int max = 0;  //declaring variables
       int no  = 0;

  System.out.print("Enter number, type -99 to quit)");    
  no = keyboard.nextInt();          //user inputs
  min = no; 
  max = no;                         //this is here because if not, the min would always be 0 
  do                                //starting do while loop for user input
  {
   System.out.print("Enter number, type -99 to quit");
   no = keyboard.nextInt();
   
   if(no > max)  //saving largest number to max variable
   {
    max = no;
   }
   if(no != -99) 
   {
    if(no < min) //saving smallest nimber to min variable
    {
     min = no;
    }
   }
  } while(no != -99);   //checking for user end

  System.out.println("Maximum number : " + max);  //final outputs
  System.out.println("Minimum number : " + min); 
 }
 }
