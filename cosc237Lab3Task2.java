import java.util.Random;
import java.util.Scanner;
public class cosc237Lab3Task2{ 
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char userChar = getChar(in);

        do {
            System.out.println("How many rows?");
            int row = getint(in);
            System.out.println("How many columns?");
            int column = getint(in);
            System.out.println("Your matrix is:");
            int[][] matrix = generate(row, column);
            flipped(matrix);

            print(matrix, row, column);
            userChar = getChar(in);

        } while (userChar == 'y');

    }

    public static char getChar(Scanner scanner) {
        System.out.println("do you want to continue? (y/n)");
        String userInput = scanner.next();
        char userChar = userInput.charAt(0);
        while (userChar != 'y' && userChar != 'n') {
            System.out.println("Please enter either y or n");
            userInput = scanner.next();
            userChar = userInput.charAt(0);
        }
        return userChar;
    }

    public static int getint(Scanner in) {
        int n = 0;
        boolean validInt = false;
        while (!validInt) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n > 0) {
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

    public static int[][] generate(int row, int column) {
        int[][] a = new int[row][column];
        Random rand = new Random();
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                a[r][c] = (rand.nextInt(2) + 1) - 1;
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
            System.out.print("[" + r + "]");
            for (int c = 0; c < column; c++) {
                System.out.printf("%5d", matrix[r][c]);
            }
            System.out.println();
        }
    }

    public static void flipped(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isFlipped = true;
            for (int j = 0; j < arr[i].length / 2; j++) {
                if (arr[i][j] != arr[i][arr[i].length - j - 1])

                    isFlipped = false;

            }
            if (isFlipped) {
                System.out.println("Row " + i + " is flipped ");
            }

        }
    }
}