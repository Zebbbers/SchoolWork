import java.util.*;

public class Last237Lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char cont = getChar(input);
        do{
        System.out.println("Enter a Positive Integer:");
        int n = getInt(input);
        System.out.println("Enter a Positive Integer for a base");
        int base = getInt(input);
        int prob1 = sumInt(n);
        int prob2 = sumRec(n);
        System.out.println("Sum of Digits for " + n + " is " + prob1 + " (Interactive Method)");
        System.out.println("Sum of Digits for " + n + " is " + prob2 + " (Recursive Method)");
        System.out.println(n + " in binary is " + binaryInt(n) + " (Interactive Method)");
        System.out.println(n + " in binary is " + binaryRec(n) + " (Recursive Method)");
        System.out.println(n + " in base " + base + " is " + convertBaseI(n,base) + " (Interactive Method)");
        System.out.println(n + " in base " + base + " is " + convertBaseR(n,base) + " (Recursive Method)");
        cont = getChar(input);
        }
        while(cont == 'y');
    }
    public static int sumInt(int n){
      int temp = 0;
      int sum = 0;
      while (n!=0){
          temp = n%10;
          sum = sum + temp;
          n = n/10; 
      }
      return sum;
    }
    
    public static int sumRec(int n){
       if (n == 0) {
           return 0;
       } 
       else{
           return n % 10 + sumRec(n / 10);
       }
    }
    
    public static String binaryInt(int n){
      int temp = 0;
      String binary = "";
      while(n!=0){
         temp = n % 2;
         binary = temp + binary;
         n = n/2;
      }
      return binary;
      
    }
    public static String binaryRec(int n){
      if (n == 0) {
        return "";
      } 
      else {
        int temp = n % 2;
        String binary = binaryRec(n / 2);
        return binary + temp;
      }
    }
    public static String convertBaseR(int n, int base) {
        if (n == 0) {
            return " ";
        } else {
            return convertBaseR(n / base, base) + (n % base);
        }

    }

    public static String convertBaseI(int n, int base) {
        String str = "";
        if (n > 0) {
            while (n != 0) {
                int remainder = n % base;

                str = remainder + str;

                n = n / base;

            }
            return str;

        } else {
            return "error";
        }
    }
    
    public static int getInt(Scanner in) {
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
    public static char getChar(Scanner input) {
        System.out.println("do you want to continue? (y/n)");
        String userInput = input.next();
        char userChar = userInput.charAt(0);
        while (userChar != 'y' && userChar != 'n') {
            System.out.println("Please enter either y or n");
            userInput = input.next();
            userChar = userInput.charAt(0);
        }
        return userChar;
    }
}

      

    
    
