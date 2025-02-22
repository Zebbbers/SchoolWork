//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab4Task4
{
  
  public static void main (String [] args)
  {
   Scanner keyboard = new Scanner(System.in);  //creating scanner
   
   double test1 = 0;
   double test2 = 0;         //declaring variables
   double test3 = 0;
   double avg   = 0;
   
   System.out.println("Please enter 3 test scores"); //prompt user
   
   test1 = keyboard.nextDouble();
   test2 = keyboard.nextDouble();       //user input
   test3 = keyboard.nextDouble();
   
   avg = (test1 + test2 + test3) / 3; // math for the average test score
   
   if (avg <= 60)
     System.out.println("Your test average was " + avg + " and your grade is an F"); // everything from here down is
                                                                                     // the comparison of grades
   else if (avg <= 69)                                                               // and their outputs 
     System.out.println("Your test average was " + avg + " and your grade is a D");
   
   else if (avg <= 79)
     System.out.println("Your test average was " + avg + " and your grade is a C");
   
   else if (avg <= 89)
     System.out.println("Your test average was " + avg + " and your grade is a B");
   
   else if (avg >= 90)
     System.out.println("Your test average was " + avg + " and your grade is an A");
   
  }
}
   
   