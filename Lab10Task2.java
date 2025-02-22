//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab10Task2
{//start of class
  public static void main(String[] args) //declaring main
  {//start main
    for(int t=1;t<=10;t++)
    {
     fallingDistance(t);
    }
  }//end main
  public static double fallingDistance(double t)
  {//start of falldist
     final double g = 9.8;
     double d = 0;
     d = .5*g*(t*t);
     System.out.println("time="+t+" distance="+d);
    return d;
  }//end of falldist
}//end class