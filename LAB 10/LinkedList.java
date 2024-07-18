import java.util.*;

class Linked_List {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    // insert a node at first position
    Node first = null;

    public void InsertAtStart(int data) {
        Node New_Node = new Node(data);

        if (first == null) {
            // System.out.println("LinkList is empty");
            first = New_Node;
        } else {
            New_Node.link = first;
            first = New_Node;
        }

    }

    // insert a node at last position
    public void InsertAtLast(int data) {
        Node New_Node = new Node(data);

        if (first == null) {
            first = New_Node;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = New_Node;
        }
    }

    // insert a node at ordered position
    public void Ordered(int data) {
        Node New_Node = new Node(data);

        if (first == null) {
            first = New_Node;
        } else {
            Node save = first;
            if (New_Node.info <= first.info) {
                New_Node.link = first;
                first = New_Node;
            } else {
                while (save.link != null && New_Node.info >= save.link.info) {
                    save = save.link;
                }
                New_Node.link = save.link;
                save.link = New_Node;
            }
        }
    }

    // delete a Node , data is info value
    public void Delete_as_info(int data) {
        Node save = first.link;
        Node pred = first;
        if (first == null) {
            System.out.println("LinkedLIst is empty!!");
            return;
        }
        if (first.info == data) {
            first = first.link;
            save = null;
        }
        while (save.info != data) {
            save = save.link;
            pred = pred.link;
        }
        pred.link = save.link;
        save.link = null;

    }

    // Delete position

    public void Delete_Position(int x) {
        Node save = first.link.link;
        Node pred = first.link;
        Node t = first;
        int temp = 0;
        if (first == null) {
            System.out.println("LinkedList is empty!!");
            return;
        }
        if (temp == x) {
            first = first.link;
            save = null;
        }

        while (temp != x) {
            save = save.link;
            pred = pred.link;
            t = t.link;
            temp++;

        }
        t.link = save;
        pred.link = null;
        // save.link=null;
    }

    // Node count
    public void count() {
        int count = 1;
        Node save = first;

        if (first == null) {
            count = 0;

        }
        while (save.link != null) {
            save = save.link;
            count++;
        }
        System.out.println("count =" + count);

    }

    // Display a Node

    public void displayLL() {
        Node temp = first;
        System.out.println(".......final ans.......");
        while (temp != null) {
            System.out.println("Your list consists of =>" + temp.info + ",");
            temp = temp.link;
        }

    }
}

public class LinkedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Linked_List LL = new Linked_List();
        while (true) {

            System.out.println("Enter 1 then insert a node at first position");
            System.out.println("Enter 2 then insert a node at last position");
            System.out.println("Enter 3 then insert a node at ordered");
            System.out.println("Enter 4 then delete a Node");
            System.out.println("Enter 5 then display");
            System.out.println("Enter 6 then count a node");
            System.out.println("Enter 7 then Delete Position");
            System.out.println("Enter 8 to Exit");
            int c = sc.nextInt();// c=choice

            int b;

            if (c == 1) {
                System.out.println("Enter a Node at value is first");
                b = sc.nextInt();
                LL.InsertAtStart(b);
            }

            if (c == 2) {
                System.out.println("Enter a Node at value is last");
                b = sc.nextInt();
                LL.InsertAtLast(b);
            }

            if (c == 3) {
                System.out.println("Enter a Node add at ordered");
                b = sc.nextInt();
                LL.Ordered(b);
            }

            if (c == 4) {
                System.out.println("Enter number you want to delete particular element:");
                b = sc.nextInt();
                LL.Delete_as_info(b);
            }

            if (c == 5) {
                System.out.println("display a Node");
                LL.displayLL();
            }

            if (c == 6) {
                LL.count();
            }

            if (c == 7) {
                System.out.println("Enter a index of node which you want to delete");
                int x = sc.nextInt();
                LL.Delete_Position(x);
            }

            if (c == 8) {
                break;
            }
        }
    }
}