public class Factorial {
    public static int factorial(int n) {
        // Base case: If n is 0 or 1, the factorial is 1.
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: Multiply n by the factorial of (n-1).
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}
