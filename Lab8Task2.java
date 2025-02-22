//Zeb Jackson
//Cosc 236
import java.util.*;
import java.io.*;
public class Lab8Task2
{
 public static void main (String [] args)throws FileNotFoundException
 {
   Scanner input = new Scanner(new File("NumberList.txt"));
 int sum = 0;
 
 while(input.hasNextInt())
   sum += input.nextInt();
       System.out.println("the Sum of the numbers is " + sum);
 
    
 }
}