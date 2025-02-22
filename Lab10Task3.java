//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab10Task3
{//start of class
  public static void main(String[] args) //declaring main
  {//start main
    Scanner keyboard = new Scanner (System.in);
    System.out.println("please enter the temp in C");
    double c = keyboard.nextDouble();
    double f = fahrenheit(c);
    for(c=0;c<=20;c++)
    {
      fahrenheit(c);
    }
  }//end main
  public static double fahrenheit(double c)
  {//start of fahrenheit
    double f = c*1.8+32;
    System.out.println(c +" in C is " +f+ " in fahrenheit");
    return f;
  }//end of fahrenheit
}//end class

//the directions for this were a little confusing, i wasnt sure whether
//to make a chart just showing 0-20 or to have users input a number
//so i just combined both into one, i hope this is still acceptable