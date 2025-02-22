import java.util.Stack;

public class DoubleLinkedList<T> implements DoubleLinkedListADT<T> {
    // Double linked list node class
    public class DoubleLinkedListNode<T> {
        T info;
        DoubleLinkedListNode<T> next;
        DoubleLinkedListNode<T> back;

        public DoubleLinkedListNode() {
            info = null;
            next = null;
            back = null;
        }


        public String toString() {
            return info.toString();
        }

        
    }

    protected int count; // number of nodes
    protected DoubleLinkedListNode<T> first; // reference to first node
    protected DoubleLinkedListNode<T> last; // reference to last node

    public DoubleLinkedList(){
        first = null;
        last = null;
        count =0;
    }

    public void initializeList(){
        first = null;
        last = null;
        count = 0;
    }

    public boolean isEmptyList(){
        return (first == null);
    }

    public T front(){
        return first.info;
    }
    
    public T back(){
        return last.info;
    }

    public int length(){
        return count;
    }

    public void print(){
        DoubleLinkedListNode<T> currentNode = first;
        if(currentNode == null){
            System.out.println("list should be empty. Nothing printed.");
        }
        while(currentNode != null){
            System.out.println(currentNode.info + " ");
            currentNode = currentNode.next;
        }
        
        

    }

    public void reversePrint(){
        DoubleLinkedListNode<T> currentNode = last;
        while(currentNode != null){
            System.out.println(currentNode.info + " ");
            currentNode = currentNode.back;
        }
    }

    public boolean search(T searchItem){
        DoubleLinkedListNode<T> currentNode = first;
        while(currentNode != null){
            if(currentNode.info.equals(searchItem)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;

    }

    public String toString() {
        if (isEmptyList()) {
            return "[head] - [tail]";
        }

        String result = "[head] - ";
        DoubleLinkedListNode<T> currentNode = first;
        while (currentNode != null) {
            result += currentNode.toString() + " - ";
            currentNode = currentNode.next;
        }
        result += "[tail]";
        return result;
    }

    
    public String backwardsString() {
        if (isEmptyList())
            return "";
    
        String result = "[tail] - ";
        DoubleLinkedListNode<T> current = last;
    
        while (current != null) {
            result += current.info + " - ";
            current = current.back;
        }
    
        return result + "[head]";
    }
    

    public void copy(DoubleLinkedList<T> otherList) {
        DoubleLinkedListNode<T> copyFirst = otherList.first;
        while (copyFirst != null) {
             insertNode(copyFirst.info);
            copyFirst = copyFirst.next;
        }
    }

    public void reversedCopy(DoubleLinkedList<T> otherList) {
        if (otherList.isEmptyList()) {
            initializeList();
            return;
        }
    
        Stack<DoubleLinkedListNode<T>> stack = new Stack<>();
        DoubleLinkedListNode<T> current = otherList.first;
    
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
    
        current = stack.pop();
        first = new DoubleLinkedListNode<T>();
        first.info = current.info;
        first.back = null;
        first.next = null;
        last = first;
        count++;
    
        while (!stack.isEmpty()) {
            current = stack.pop();
            DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>();
            newNode.info = current.info;
            newNode.next = null;
            newNode.back = last;
            last.next = newNode;
            last = newNode;
            count++;
        }
    }
    
    
    
    

    public boolean equals(Object o) {
        if (o == this) { 
            return true;
        }
        if (!(o instanceof DoubleLinkedList)) { 
            return false;
        }
        DoubleLinkedList<T> otherList = (DoubleLinkedList<T>) o;
        if (length() != otherList.length()) { 
            return false;
        }
        DoubleLinkedListNode<T> node1 = first;
        DoubleLinkedListNode<T> node2 = otherList.first;
        while (node1 != null) { 
            if (node1.info != node2.info) { 
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }
    
    public String recursiveBackwardsString() {
        return "[tail] - " + recursiveBackwardsString(last) + "[head]";
    }

    private String recursiveBackwardsString(DoubleLinkedListNode<T> node) {
        if (node == null) {
            return "";
        } else {
            return node.toString() + " - " + recursiveBackwardsString(node.back);
        }
    }


    public String recursiveToString() {
        return "[head] - " + recursiveToString(first) + "[tail]";
    }

    private String recursiveToString(DoubleLinkedListNode<T> node) {
        if (node == null) {
            return "";
        } else {
            return node.toString() + " - " + recursiveToString(node.next);
        }
    }

public void insertNode(T insertItem){
    boolean found;
    DoubleLinkedListNode<T> current;//moving reference 
    DoubleLinkedListNode<T> trailCurrent = null; //just before current
    // Set up node to be inserted
    DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>();
    newNode.info = insertItem;
    newNode.next = null;
    newNode.back = null;
    //if the list is empty, newNode is the only node
    if (first == null) {
        first = newNode;
        last = newNode;
        count++;
    }
    else {
        found = false;
        current = first;
        //search the list
        while (current != null && !found) {
            Comparable<T> temp = (Comparable<T>) current.info;
            if (temp.compareTo(insertItem) >= 0)
                found = true;
            else {
                trailCurrent = current;
                current = current.next;
            }
        } 
        //insert new node before first
        if (current == first) {
            first.back = newNode;
            newNode.next = first;
            first = newNode;
            count++;
        }
        else {
            //insert newNode between trailCurrent and current
            if (current != null) {
                trailCurrent.next = newNode;
                newNode.back = trailCurrent;
                newNode.next = current;
                current.back = newNode;
            }
            else {
                //insert new node after last
                trailCurrent.next = newNode;
                newNode.back = trailCurrent;
                last = newNode;
            }
            count++;
        }
    }
}
 
public void deleteNode(T deleteItem) {
    DoubleLinkedListNode<T> current; //moving reference 
    DoubleLinkedListNode<T> trailCurrent;//just before current 
    boolean found;
    if (first == null)
        System.err.println("Cannot delete from an empty list.");
    //if node to be deleted is the first node
    else if (first.info.equals(deleteItem)) {
        current = first;
        first = first.next;
        if (first != null)
            first.back = null;
        else
            last = null;
        count--;
    }
    else {
        found = false;
        current = first;
        //search the list
        while (current != null && !found) {
            Comparable<T> temp = (Comparable<T>) current.info;
            if (temp.compareTo(deleteItem) >= 0)
                found = true;
            else
                current = current.next;
        }
        if (current == null)
            System.out.println("The item to be deleted is not in the list.");
        else if (current.info.equals(deleteItem)) {
            trailCurrent = current.back;
            trailCurrent.next = current.next;
            if (current.next != null)
                current.next.back = trailCurrent;
            if (current == last)
                last = trailCurrent;
            count--;
        }
        else
            System.out.println("The item to be deleted is not in list.");
    }
}  
}