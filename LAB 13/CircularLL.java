import java.util.*;

class Linked_List {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;
    Node last;

    // insert at first position
    public void InsertAtFirst(int data) {
        Node New_Node = new Node(data);
        if (first == null) {
            New_Node.link = New_Node;
            first = last = New_Node;
        } else {
            New_Node.link = first;
            last.link = New_Node;
            first = New_Node;
        }
    }

    // insert at last position
    public void InsertAtLast(int data) {
        Node New_Node = new Node(data);
        if (first == null) {
            New_Node.link = New_Node;
            first = last = New_Node;
        } else {
            New_Node.link = first;
            last.link = New_Node;
            last = New_Node;
        }
    }

    // insert at ordered in circular linked list
    public void InsertAtOrdered(int data) {
        Node New_Node = new Node(data);
        if (first == null) {
            New_Node.link = New_Node;
            first = last = New_Node;
        } else if (New_Node.info <= first.info) {
            New_Node.link = first;
            last.link = New_Node;
            first = New_Node;
            return;
        }
        Node save = first;
        while (save != last && New_Node.info >= save.link.info) {
            save = save.link;
        }
        New_Node = save.link;
        save.link = New_Node;

        if (save == last) {
            last = New_Node;
        }
        return;
    }

    // delete node from specified node of info
    public void delete_node(int x) {
        Node save = first;
        Node pred = null;
        if (first == null) {
            System.out.println("LinkedLIst Is Empty!");
        } else {
            while (save.info != x && save != last) {
                pred = save;
                save = save.link;
            }
            if (save.info != x) {
                System.out.println("Node is not found!!");
            } else {
                if (first == last) {
                    first = null;
                    last = null;
                } else if (x == first.info) {
                    first = first.link;
                    last.link = first;
                } else {
                    pred.link = save.link;
                    if (x == last.info) {
                        last = pred;
                        pred.link = first;
                    }
                    return;
                }
            }
        }
    }

    // Display method
    public void displayLL() {
        Node temp = first;
        if (first != null) {
            do {
                System.out.println(temp.info);
                temp = temp.link;
            } while (temp != first);
        }
    }
}

// main method
public class CircularLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List CL = new Linked_List();

        boolean falg = true;
        while (true) {
            System.out.println("Enter 1 for Insert at first in Circular LinkedList");
            System.out.println("Enter 2 for Insert at last in Circular LinkedList");
            System.out.println("Enter 3 for Insert at ordered in Circular LinkedList");
            System.out.println("Enter 4 for delete node in Circular LinkedList");
            System.out.println("Enter 5 for Display in Circular LinkedList");
            System.out.println("Enter 6 for exit");
            int choice = sc.nextInt();
            int d;

            switch (choice) {
                case 1:
                    System.out.println("Enter a node at value is first:");
                    d = sc.nextInt();
                    CL.InsertAtFirst(d);
                    break;

                case 2:
                    System.out.println("Enter a node at value is last:");
                    d = sc.nextInt();
                    CL.InsertAtLast(d);
                    break;

                case 3:
                    System.out.println("Enter a node at Value Is Ordered:");
                    d = sc.nextInt();
                    CL.InsertAtOrdered(d);
                    break;

                case 4:
                    System.out.println("Enter a info to delete a node");
                    d = sc.nextInt();
                    CL.delete_node(d);
                    break;

                case 5:
                    CL.displayLL();
                    break;

                case 6:
                    flag = false;
            }
        }
    }
}