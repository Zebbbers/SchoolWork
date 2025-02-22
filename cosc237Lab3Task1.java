import java.util.*;
public class cosc237Lab3Task1{  
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        String userInput;
        char userChar = getChar(scanner);
        
        do{
        System.out.println("how many elements do you want in the array?");
        int size = getint(scanner);
        int size2x =size*2;
        int[]array= intrand(size);  
        System.out.println("The original array is: ");
        print(array, size);
        System.out.println("The second array is: ");
        int[] array2x = twice(array, size);
        print(array2x, size2x);
        userChar = getChar(scanner);
        }while(userChar == 'y');
    }
        
        public static int[] twice(int[] array, int size) {
          int size2x = size * 2;
          int[] array2x = new int[size2x];
          int c = 0; 
          for(int i = 0;i < size2x;i += 2){
            array2x[i] = array[c];
            array2x[i+1] = array[c];
            c++;
          }
          return array2x;     
    }

public static int getint(Scanner in) {
       
        int n = 0;
        boolean validInt = false;
        while(!validInt){
            if(in.hasNextInt()){
                n = in.nextInt();
                if(n > 0 ){
                    validInt = true;
                }
                else{
                    System.out.println("Please enter vaild integer");
                }
                
            
            }else{
                String input = in.next();
                System.out.println("enter a valid input");
            }
        }return n;
    }
    public static void print(int[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.printf("%3d ",array[i]);
        System.out.println(" ");
        

    }

    public static int[] intrand(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for(int x=0;x<size;x++){
               
            array[x] = random.nextInt(99)+ 1;
        }
        return array;
    }
    public static char getChar(Scanner scanner) {
        System.out.println("do you want to continue? (y/n)");
        String userInput = scanner.next();
        char userChar = userInput.charAt(0);
        while(userChar != 'y' && userChar != 'n'){
        System.out.println("Please enter either y or n");
        userInput = scanner.next();
        userChar = userInput.charAt(0); 
        }
        return userChar;
    }   
}


