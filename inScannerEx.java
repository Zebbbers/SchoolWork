import java.util.Scanner;
public class inScannerEx
{
  
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("what number would you like to display?");
    int num = keyboard.nextInt();
    System.out.println("your num is " + num);
  }
}
    