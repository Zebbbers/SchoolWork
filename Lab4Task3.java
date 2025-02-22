//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab4Task3
{
  
  public static void main (String [] args)
  {
   Scanner keyboard = new Scanner(System.in);  //creating scanner
   
   double length1 = 0;
   double width1  = 0; 
   
   double length2 = 0;              //declaring variables
   double width2  = 0;
   
   double area1 = 0;
   double area2 = 0;
   
   
   System.out.println("First rectangles length?"); // prompt user
   length1 = keyboard.nextDouble();                // user input
   
   System.out.println("First rectangles width?");
   width1 = keyboard.nextDouble();
   
   System.out.println("Second rectangles length?");
   length2 = keyboard.nextDouble();
   
   System.out.println("Second rectangles width?");
   width2 = keyboard.nextDouble(); 
   
   area1 = length1 * width1;          //math
   area2 = length2 * width2;
   
  if (area1 > area2)
    System.out.println("The first rectangle is bigger"); //output for first rectangle being bigger
  
  else if (area2 > area1)
    System.out.println("The second rectangle is bigger");// output for second rectangle being bigger
  
  else 
    System.out.println("The rectangles are the same size"); // output for same size
  }
}
   
   