import java.util.*;
public class Game
{

  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double str  = 0;
    double lky  = 0;
    double spd  = 0;
    double hp   = 100;
    double ehp  = 0;
    int    move = 0;
    int    rollNum = 0;
    String rollName = "";
    
   
    
    System.out.println("type your selected classes number");
    System.out.println("1. arc");
    System.out.println("2. bar");
    System.out.println("3. jes");
    
    rollNum = keyboard.nextInt();
    
    while(rollNum !=1 && rollNum !=2 && rollNum !=3)
            {
      System.out.println("error, select new number");
      System.out.println("type your selected classes number");
      System.out.println("1. arc");
      System.out.println("2. bar");
      System.out.println("3. jes");
      rollNum = keyboard.nextInt();
    }
    
    switch(rollNum)
    {
      case 1:  
      str =  4;
      lky =  5;
      spd =  9;
      rollName = "arc";
      break;
    
    case 2:
    
      str =  9;
      lky = 3 ;
      spd =  5;
      rollName = "bar";
      break;
    
    case 3:
    
      str =  5;
      lky =  9;
      spd =  6;
      rollName = "jes";
      break;
    }
    String stats = "Yout class is " + rollName + ", Strenght " + str + ", Luck " + lky + ", Speed " + spd + ", and Health 100";
    
    System.out.println("You selected " + rollName + ", your stats are");
    System.out.println("Strenght = " + str);
    System.out.println("Luck = " + lky);
    System.out.println("Speed = " + spd);
    System.out.println("Health = " + hp);
    
    double pdmg = str * 2;  
    
    move = getMove();
    
    if (move == 1)
          {
      System.out.println("An enemy with 100 health approaches");
      ehp = 100;
      System.out.println("what do you want to do?");
      System.out.println("1. Attack");
      System.out.println("2. Dodge");
      System.out.println("3. Run");
        move = keyboard.nextInt();
    }
      
    
      
          switch(move)
          {
            case 1:
            {
              ehp -= pdmg;
           System.out.println("you did " + pdmg + " damage, the enemy still has " + ehp + " Health.");
       
           if (move == 1)
           {
           while (ehp >= 0)
           {
            System.out.println("what do you want to do?");
            System.out.println("1. attack");
            System.out.println("2. run");
            move = keyboard.nextInt();
            if(move == 1)
            {
              ehp -= pdmg;
              if(ehp>=0)
                System.out.println("The enemy still has " + ehp + " hp");
            }

           }
           System.out.println("Congrats you killed the enemy and gained 1 exp");
            }
           else
           {
             System.out.println("pussy");
           }
            }
            break;
   
            case 2:
      System.out.println(stats);
            break;
            
            case 3:
              break;
  
            case 4:
              break;
              
            default: 
      System.out.println("error");
  }
    
      move = getMove();
    
    switch(move)
    {
      case 1:
        System.out.println("another enemy with 100 health appears");
        break;
      case 2:
        System.out.println(stats);
        break;
      case 3:
        System.out.println("goodbye");
        break;
      case 4:
        System.out.println("resetting");
        break;
      default:
        System.out.println("error");
    }
  }  

  
  
  
  
  
  public static int getMove()
{
    Scanner keyboard = new Scanner (System.in);
    System.out.println(""); 
    System.out.println("What do you want to do?");
    System.out.println("1. Fight");                 
    System.out.println("2. Check Stats");          
    System.out.println("3. Quit");                
    System.out.println("4. ReSelect Character");
    int move = keyboard.nextInt();
    return move;
}
    
   
}