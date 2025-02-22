//Zeb Jackson
//Cosc 236
import java.util.*;
import java.io.*;
public class Lab8Task3
{
 public static void main (String [] args)throws FileNotFoundException
 {
   Scanner keyboard = new Scanner(System.in);
   System.out.println("enter file name with extension");
   String userFile = keyboard.next();
   File f = new File(userFile);
   
   while(!f.exists())
   {
     System.out.println("file doesnt exist, please enter a new file");
     userFile = keyboard.next();
     f = new File(userFile);
   }
   
   Scanner input = new Scanner(f);
   
     int i = 1;
     while(input.hasNextLine() && i<=5)
           {
             String line = input.nextLine();
             System.out.println(line);
             i++;
           }
   }
 }
