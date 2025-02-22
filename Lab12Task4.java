//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab12Task4
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.println("how many numbers in the first array?");
   int nums = keyboard.nextInt();
   int x = 0;
   double[] array1;
   double[] array2;
   array1 = new double[nums];
   array2 = new double[nums];
   while(x < nums)
    {
    System.out.println("What number do you want in slot " +x+ "?");
    double num = keyboard.nextDouble();
    array1[x]=num;
    x++;
    }
   x=0;
   System.out.println("how many numbers in the second array?");
   nums = keyboard.nextInt();
   while(x < nums)
    {
    System.out.println("What number do you want in slot " +x+ "?");
    double num = keyboard.nextDouble();
    array2[x]=num;
    x++;
    }
   boolean same = true;
   for(int i = 0; i < array1.length; i++)
    {
     if (array1[i] != array2[i])
      same = false;
    } 
   if(same == true)
   System.out.println("The arrays are equal");
   else
   System.out.println("The array are not equal");
  }
}