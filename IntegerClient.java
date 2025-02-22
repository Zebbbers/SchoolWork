import java.util.*;

public class IntegerClient {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> intList = new DoubleLinkedList<Integer>();
        Scanner input = new Scanner(System.in);
        
        intList.insertNode(1);
        intList.insertNode(5);
        intList.insertNode(8);
        intList.insertNode(17);
        intList.insertNode(13);
        intList.insertNode(20);
        intList.insertNode(7);
        
        System.out.println("The list: " + intList);
        System.out.println("Backwards list: " + intList.backwardsString());

        
        System.out.println("Length: " + intList.length());
        System.out.println("Is 20 in the list? " + intList.search(20));
        
        DoubleLinkedList<Integer> intListCopy = new DoubleLinkedList<Integer>();
        intListCopy.copy(intList);
        System.out.println("Copy of the list: " + intListCopy);
        
        DoubleLinkedList<Integer> intListReversedCopy = new DoubleLinkedList<Integer>();
        intListReversedCopy.reversedCopy(intList);
        System.out.println("Reversed copy of the list: " + intListReversedCopy);
        
        System.out.println("Are the two lists equal? " + intList.equals(intListCopy));
        
        System.out.println("Recursive toString: " + intList.recursiveToString());
        System.out.println("Recursive backwards string: " + intList.recursiveBackwardsString());
        
        System.out.println("Enter a list of integers to insert into the list (separated by spaces): ");
        String[] items = input.nextLine().split("\\s+");
        for (String item : items) {
            intList.insertNode(Integer.parseInt(item));
        }
        System.out.println("List after insertion: " + intList);
        
        System.out.println("Enter an integer to delete from the list: ");
        int item = input.nextInt();
        intList.deleteNode(item);
        System.out.println("List after deletion: " + intList);
    }
}

