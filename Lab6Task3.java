//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab6Task3
{
public static void main (String [] args)
 { 
Scanner keyboard = new Scanner(System.in);    //creating scanner
int day          = 0;
double organStart = 0;
double organEnd = 0;          //variables
double growthRate = 0;
int counter = 1;
System.out.println("how many organisms were there on day 1?"); //user inputs
organStart = keyboard.nextDouble();
System.out.println("what is the organisms growth rate?(please type as decimal, ex. %50 = .50)");
growthRate = keyboard.nextDouble();
System.out.println("how many days will they reproduce?");     //user inputs
day = keyboard.nextInt();
while (day <= 1 && organStart <= 2 && growthRate <= 0)
 
{
 System.out.println("please re-enter valid data");
 System.out.println("how many organisms were there on day 1?"); //checking valid information
 organStart = keyboard.nextDouble();
 System.out.println("what is the organisms growth rate?(please type as decimal, ex. %50 = .50)");
 growthRate = keyboard.nextDouble();
 System.out.println("how many days will they reproduce?");       //checking valid information
 day = keyboard.nextInt();
 
}
 
System.out.println("Days______Organisms");
 
System.out.println(" 1         " + organStart);                                //making the final chart look nice
 
organEnd = organStart;
while(counter != day)
 { 
 counter++;
 organEnd = (organEnd * growthRate) + organEnd ; //math for final organism count
 System.out.println(" " + counter + "         " + organEnd); 
 }
 }
}