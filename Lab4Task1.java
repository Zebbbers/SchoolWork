import java.util.*;

public   class lab4Task1{
    public static void main(String[] args) {
      Time t = new Time();
      
         Scanner in = new Scanner(System.in);
         Time t1 = new Time(8, 15, 30);
         Time t2 = new Time();
         int hours, minutes, seconds;
         
         System.out.print("Initial time t1 (alternate constructor invoked) - military format: ");
         t1.printTimeMilitary();
         System.out.println();
         System.out.print("Initial time t1 (alternate constructor invoked) - standard format: ");
         
         t1.printTimeStandard();
         System.out.println();
         System.out.print("Initial time t2 (default constructor invoked) - military format: ");
         
         t2.printTimeMilitary();
         System.out.println();
         System.out.print("Initial time t2 (default constructor invoked) - standard format: ");
         
         t2.printTimeStandard();
         System.out.println();
         t2.setTime(9, 45, 35);
         System.out.print("t2 after call to setTime - military format: ");
         
         t2.printTimeMilitary();
         System.out.println();
         System.out.print("t2 after call to setTime - standard format: ");
         
         t2.printTimeStandard();
         System.out.println();
         
         if(t1.equals(t2))
            System.out.println("After call to equals: times are equal.");
         else
            System.out.println("After call to equals: times are NOT equal.");
         
         if(t1.lessThan(t2))
            System.out.println("After call to lessThan: t1 is less than t2.");
         else
            System.out.println("After call to lessThan: t1 is NOT less than t2.");
         
         System.out.print("Enter hours: ");
         hours = getint(in);
         
         while(hours > 24){
           System.out.print("Needs to be between 0-23");
         hours = getint(in);
         } 
         
         System.out.print("Enter minutes: ");
         minutes = getint(in);
          while(hours > 60){
           System.out.print("Needs to be between 0-59");
         hours = getint(in);
         } 
          
         System.out.print("Enter seconds: ");
         seconds = getint(in);
          while(hours > 60){
           System.out.print("Needs to be between 0-59");
         hours = getint(in);
         } 
          
         t1.setTime(hours, minutes, seconds);
         System.out.print("New time t1 after call to setTime - standard format: ");
         
         t1.printTimeStandard();
         System.out.println();
         
         t1.advanceHrs();
         t1.advanceMins();
         t1.advanceSecs();
         
         System.out.print("New time t1 after call to increment - standard format: ");
         t1.printTimeStandard();
         
         System.out.println();
         t2.copy(t1);
         
         System.out.print("New t2 after call to copy - standard format: ");
         t2.printTimeStandard();
         System.out.println();
         
         System.out.println("Test toString for t2: " + t2);
         t1.equals(t2);
         System.out.println();
    }
    public static int getint(Scanner in) {
        int n = 0;
        boolean validInt = false;
        while (!validInt) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n >= 0) {
                    validInt = true;
                } else {
                    System.out.println("Please enter vaild integer");
                }
            } else {
                String input = in.next();
                System.out.println("enter a valid input");
            }
        }
        return n;
    }
}    

    
