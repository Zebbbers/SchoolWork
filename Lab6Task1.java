//Zeb Jackson
//Cosc 236
import java.util.*;
public class Lab6Task1
{
public static void main (String [] args)
 {
 
int num = 0;
int sum = 0; 
int counter = 0;
 
Scanner keyboard = new Scanner(System.in);    //creating scanner
System.out.println("please enter a positive nonzero intiger");
num = keyboard.nextInt();       //user input
 while(num <=0)
 { 
System.out.println("please enter a POSITIVE NONZERO INTIGER");    //loop verifying the initial number
 num = keyboard.nextInt(); 
 }
 while(counter != num)
 {
 counter ++;       //the loop doing math 
 sum += counter; 
 }
System.out.println("the sum of all numbers between 1 and " + num + " is " + sum); //final output000
 }
}

