//Zeb Jackson
//COSC 236
import java.util.*;
public class Lab9Task3
{//start of class
  public static void main(String[] args) //declaring main
  { //start main
    double energy = kineticEnergy();
    System.out.println("The final kinetic energy is " + energy);
  }//end main
  public static double kineticEnergy() //declaring new function
  {//start of new function
    Scanner keyboard = new Scanner(System.in);//scanner
    System.out.println("Please enter the objects mass (in kilograms)");
    double mass = keyboard.nextDouble();
    System.out.println("Please enter the objects velocity (meters per second)");
    double velocity = keyboard.nextDouble();
    double veloSquared = velocity*velocity; //math to get velocity squared
    double energy = .5 * mass * veloSquared; //final math
    return energy;
  } //end new function
} //end of class