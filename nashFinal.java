import java.util.*;
import java.util.Random;

public class nashFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option, size;
        int counter = 0;
        String prompt = "";

        do {
            option = menu(scanner);
            switch (option) {
                case 0:
                    System.out.println("Testing completed.");
                    counter--;
                    break;

                case 1: // addition
                    System.out.println("what size do you want the matracies");
                    size = getint(scanner);
                    int[][] matrix1 = genMatrix(size);
                    int[][] matrix2 = genMatrix(size);
                    System.out.println("This is the first matrix:");
                    print(matrix1, size);
                    System.out.println("This is the sceond matrix:");
                    print(matrix2, size);
                    System.out.println("combined matracies gives you:");
                    int[][] add = addition(matrix1, matrix2, size);
                    print(add, size);
                    break;

                case 2: // subtraction
                    System.out.println("How big do you want the matricies?");
                    size = getint(scanner);
                    int[][] matrix3 = genMatrix(size);
                    int[][] matrix4 = genMatrix(size);
                    System.out.println("This is the first matrix:");
                    print(matrix3, size);
                    System.out.println("This is the sceond matrix:");
                    print(matrix4, size);
                    System.out.println("The difference of the matracies gives you:");
                    int[][] sub = subtraction(matrix3, matrix4, size);
                    print(sub, size);
                    break;

                case 3: // multiplying 2 matricies together
                    System.out.println("How big do you want the matracies?");
                    size = getint(scanner);
                    int[][] mat1 = genMatrix(size);
                    int[][] mat2 = genMatrix(size);
                    System.out.println("This is the first matrix:");
                    print(mat1, size);
                    System.out.println("This is the sceond matrix:");
                    print(mat2, size);
                    System.out.println("The 2 matracies multiplied together gives you:");
                    int[][] mult = multMatrix(size, mat1, mat2);
                    print(mult, size);

                    break;

                case 4: // multiplying by a constant
                    System.out.println("How big do you want the matrix?");
                    size = getint(scanner);
                    System.out.println("What constant do you want to multiply by?");
                    int constant = getint(scanner);
                    int[][] matrix5 = genMatrix(size);
                    int[][] multiplyCons = constant(matrix5, size, constant);
                    System.out.println("This is the first matrix:");
                    print(matrix5, size);
                    System.out.println("This is the first matrix:");
                    print(multiplyCons, size);

                    break;

                case 5: // transposing the matricies
                    System.out.println("How big do you want the matrix?");
                    size = getint(scanner);
                    int[][] martix = genMatrix(size);
                    int[][] tranMatrix = transpose(martix, size);
                    System.out.println("The origonal matrix is:");
                    print(martix, size);
                    System.out.println("The transposed matrix is:");
                    print(tranMatrix, size);
                    break;

                case 6: // trace
                    System.out.println("How big do you want the matrix?");
                    size = getint(scanner);
                    int[][] traceArray = genMatrix(size);
                    int traced = trace(traceArray, size);
                    System.out.println("This is the origional matrix:");
                    print(traceArray, size);
                    System.out.println("The trace of the matrix is: " + traced);
                    break;

                default:
                    System.out.println("Error!");
            }
            counter++;
            System.out.println(counter + " Task(s) have been completed");
        } while (option != 0);
    }

    public static int menu(Scanner scanner) {
        System.out.println("your options are" + "\n" + "-------------------");
        System.out.println("1) Add 2 matrices");
        System.out.println("2) Subtract 2 matrices");
        System.out.println("3) Multiply 2 matrices");
        System.out.println("4) Multiply matrix by a constant");
        System.out.println("5) Transpose matrix");
        System.out.println("6) Matrix trace");
        System.out.println("0) Exit");
        int option = getint(scanner);
        while (option > 6 || option < 0) {
            System.out.println("Please enter a number between 0-6");
            option = getint(scanner);
        }
        return option;

    }

    public static int[][] genMatrix(int size) {
        int matrix[][] = new int[size][size];
        Random rand = new Random();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = rand.nextInt(10) + 1;
            }

        }
        return matrix;
    }

    public static int[][] multMatrix(int size, int[][] array1, int[][] array2) {
        int[][] multpliedMat = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    multpliedMat[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return multpliedMat;

    }

    public static int[][] constant(int[][] a, int size, int constant) {
        int[][] multiplyCons = new int[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                multiplyCons[r][c] = a[r][c] * constant;
            }
        }
        return multiplyCons;
    }

    public static int trace(int[][] arr, int size) {
        int trace = 0;
        for (int c = 0; c < size; c++) {
            trace += arr[c][c];

        }
        return trace;
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

    public static int[][] addition(int[][] matrix1, int[][] matrix2, int size) {
        int[][] summatrix = new int[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                summatrix[r][c] = matrix1[r][c] + matrix2[r][c];
            }
        }
        return summatrix;
    }

    public static int[][] transpose(int[][] matrix, int size) {
        int[][] result = new int[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                result[c][r] = matrix[r][c];

            }
        }
        return result;
    }

    public static int[][] subtraction(int[][] matrix1, int[][] matrix2, int size) {
        int[][] subtractmatrix = new int[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                subtractmatrix[r][c] = matrix1[r][c] - matrix2[r][c];
            }
        }
        return subtractmatrix;
    }

    public static void print(int[][] a, int size) {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.printf("%5d", a[r][c]);
            }
            System.out.println();
        }

    }

    public static int[][] multiply(int[][] a, int[][] b, int size) {
        int[][] multi = new int[size][size];
        for (int r = 0; r < size; r++) {// loops throgh normally
            for (int c = 0; c < size; c++) {
                int sum = 0;
                for (int n = 0; n < size; n++) {
                    sum += a[r][c] * b[n][c];// does the math then jupms to the next row then comes back
                }
                multi[r][c] = sum;
            }
        }
        return multi;
    }
}