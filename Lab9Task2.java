//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab9Task2 
{//start of class
  public static void main(String[] args) //declaring main
  {//start main
    displayArea();
  } //end main
  public static double getWidth()
  {//start of width
    Scanner keyboard = new Scanner(System.in);
    System.out.println("please enter the width");
    double width = keyboard.nextDouble();
    return width;
  } //end of width
  public static double getLength()
  {//start of length
    Scanner keyboard = new Scanner(System.in);
    System.out.println("please enter the length");
    double length = keyboard.nextDouble();
    return length;
  }//end of length
  public static double getArea()
  {//start of area
    double length = getLength();
    double width  = getWidth();
    double area = length * width;
    return area;
  }//end of area
  public static void displayArea()
  {//start of dispArea
    double area = getArea();
    System.out.println("The area of the rectange is " + area);
  }//end of dispArea
} //end of class