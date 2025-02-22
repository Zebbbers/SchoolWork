import java.util.*;
import java.util.Random;


public class cosc237Lab4Task1{ 
  public static void main(String[] args) {
    int h = 13;
    int m = 3;
    int s = 4;
    
    Time t1 = new Time(h, m, s);
    Time t2 = new Time(h, m, s);
    
    
    System.out.println(t1.getHrs()+":"+t1.getMins()+":"+t1.getSecs());
    System.out.println(t2.getHrs()+":"+t2.getMins()+":"+t2.getSecs());

  }
  
}