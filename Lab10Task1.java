//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab10Task1
{//start of class
  public static void main(String[] args) //declaring main
  {//start main
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a number to be mulitpied by 10");  
    double num = keyboard.nextDouble();
    System.out.println("the new number is " + timesTen(num));
  }//end main
  public static double timesTen(double x)
  {//start of timesten
    return x * 10;
  }//end of timesten
}//end class