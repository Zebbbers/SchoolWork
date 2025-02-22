import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it's a palindrome: ");
        String word = scanner.nextLine();
        scanner.close();

        Stack<Character> letters = new Stack<>();
        Queue<Character> characters = new LinkedList<>();

        for (char c : word.toCharArray()) {
            letters.push(c);
            characters.add(c);
        }

        while (!letters.isEmpty() && !characters.isEmpty() && letters.peek() == characters.peek()) {
            letters.pop();
            characters.poll();
        }

        if (letters.isEmpty() && characters.isEmpty()) {
            System.out.println("The word " + word + " is a palindrome.");
        } else {
            System.out.println("The word " + word + " is not a palindrome.");
        }
    }
}
