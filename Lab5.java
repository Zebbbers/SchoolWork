import java.util.*;
public class Lab5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Point p1 = new Point(5,5);
        Point p2 = new Point(8, 8);
        Point p3 = new Point(10, 10);
        System.out.print("First point is ");
        p1.print();
        System.out.print("Second point is ");
        p2.print();
        System.out.print("Third point is ");
        p3.print();
        
        if(p2.isvertical(p3)){
            System.out.println("second point "+ p2.toString()+" doesnt line up vertically with point 3 "+p3.toString());
       }else{
        System.out.println("second point "+ p2.toString()+" does line up vertically with point 3 "+p3.toString());
       }
       if(p2.ishorizontal(p3)){
        System.out.println("second point "+ p2.toString()+" doesnt line up horizontally with point 3 "+p3.toString());
       }else{
        System.out.println("second point "+ p2.toString()+" does line up horizontally with point 3 "+p3.toString());
       }
        System.out.println("enter x coordinates");
        int run = getint(in);
         System.out.println("enter y coordinates");
         int rise= getint(in);
         p1.set(run, rise);
         System.out.println("first point is now "+p1.toString());

       
       
        String stringP1 = p1.toString();
        System.out.print("The distance between point 1 and the orgin = ");
        System.out.printf("%.2f", p1.distfromorg());
        System.out.println();

        
        System.out.print("The distance between Point 1 and Point 2 is = ");
        System.out.printf("%.2f",p1.distfrompt(p2));  
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
