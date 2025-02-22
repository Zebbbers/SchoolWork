import java.util.*;
public class Lab3PartB {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);    
      String y_or_n = "y";
      char select = 'y';
      
      do{
      System.out.println("Do you want to continue?");
      y_or_n = yesORno(in);
      select = y_or_n.charAt(0);
      if(select == 'y'){
        System.out.println("How many rows?");
        int row = getint(in);
        System.out.println("How many columns?");
        int column = getint(in);
        System.out.println("Your matrix is:");
        int[][] matrix = generate(row, column);
        print(matrix, row, column);
        } 
      }while(select != 'n');  
    }
    public static String yesORno(Scanner input){
      String y_or_no = "";
      System.out.println("please enter y or n");
      while(!y_or_no.equals("y")){
        y_or_no = input.nextLine();
        }
      return y_or_no;
    }
      
   public static int getint(Scanner in) {
       
        int n = 0;
        boolean validInt = false;
        while(!validInt){
            if(in.hasNextInt()){
                n = in.nextInt();
                if(n >= 0 ){
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
    public static int[][] generate(int row, int column) {
        int[][] a = new int[row][column];
        Random rand = new Random();
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                a[r][c] = (rand.nextInt(2)+1)-1;
            }
        }
        return a;
    }

    public static int[][] intrand(int size) {
        Random random = new Random();
        int[][] array = new int[size][size];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {

                array[row][col] = random.nextInt(1) + 1;
            }
        }
        return array;
    }

    public static void print(int[][] matrix, int row, int column) {
        for (int r = 0; r < row; r++) {
          System.out.print("[" +r+ "]");
            for (int c = 0; c < column; c++) {
                System.out.printf("%5d" , matrix[r][c]);
            }
            System.out.println();
        }
    }

    public static boolean flipped(int [][] matrix, int row) {
      int[] a = new int[row];
      int[] b = new int[row];
      int c = 0;
      for(int x = 0; x < row;x++){
        a[x]=matrix[x][c]; 
      }
        for (int i = 0; i < row; i++) {
            if (a[i] == b[i]) {
                    return false;
                }
            }return true;
        }
}


