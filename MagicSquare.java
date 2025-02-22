public class MagicSquare {
    public static void main(String[] args) {
        int n = 3; // replace with desired odd number
        int[][] matrix = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;
        matrix[row][col] = num;
        while (num < n * n) {
            num++;
            row--;
            col++;
            if (row < 0 && col >= n) { // case 1
                row += 2;
                col--;
            } else if (row < 0) { // case 2
                row = n - 1;
            } else if (col >= n) { // case 2
                col = 0;
            } else if (matrix[row][col] != 0) { // case 3
                row += 2;
                col--;
            }
            matrix[row][col] = num;
        }
        int magicSum = n * (n * n + 1) / 2;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != magicSum || colSum != magicSum) {
                System.out.println("Error: not a magic square");
                return;
            }
        }
        int diagSum1 = 0;
        int diagSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagSum1 += matrix[i][i];
            diagSum2 += matrix[i][n - 1 - i];
        }
        if (diagSum1 != magicSum || diagSum2 != magicSum) {
            System.out.println("Error: not a magic square");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}