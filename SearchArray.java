import java.util.*;
public class SearchArray
{
  public static void main (String [] args)
  {
    int[] arr = {50,2,3,0,17};
    boolean found = false;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("prompt");
    int x = keyboard.nextInt();
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i]==x)
        found = true;
    }
    if (found == true)
    System.out.println("The variable is in the array");
    else
    System.out.println("The variable is not in the array");
  }
}
      
    