// Node class represents each element (or node) in the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class manages the linked list operations
class LinkedList {
    Node top;

    // Method to insert a new node with given data at the end of the linked list
    public void insertAtLast(int data) {
        Node new_node = new Node(data);
        if (top == null) {
            top = new_node;
        } else {
            Node current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    // Method to print the contents of the linked list
    public void printList() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

// Main class to test the LinkedList implementation
public class PrintTheNode {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting nodes with data
        linkedList.insertAtLast(1);
        linkedList.insertAtLast(2);
        linkedList.insertAtLast(3);
        linkedList.insertAtLast(4);
        linkedList.insertAtLast(5);

        // Printing the linked list
        System.out.println("Contents of the linked list:");
        linkedList.printList();
    }
}