import java.util.*;

class SLL {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node first = null;

    public void InsertAtStart(int data) {
        Node new_Node = new Node(data);

        if (first == null) {
            first = new_Node;
            return;
        }
        Node save = first;
        while (save.link != null) {
            save = save.link;

        }
        save.link = new_Node;
    }

    public void Display() {
        Node temp = first;
        System.out.println("....final Ans......");
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.link;
        }
    }
}

public class Singly_LL_SameOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL LL1 = new SLL();
        while (true) {
            System.out.println("Enter 1 to insert a start");
            System.out.println("Enter 2 to display");
            System.out.println("Enter 3 to exit");
            int c = sc.nextInt();
            int b;

            if (c == 1) {
                System.out.println("Enter a insert node value");
                b = sc.nextInt();
                LL1.InsertAtStart(b);
            }
            if (c == 2) {
                LL1.Display();
            }
            if (c == 3) {
                System.out.println(LL1.first.info);
                break;
            }
        }
        SLL LL2 = new SLL();
        while (true) {
            System.out.println("Enter2 1 to insert a start");
            System.out.println("Enter2 2 to display");
            System.out.println("Enter2 3 to exit");
            int c = sc.nextInt();
            int b;

            if (c == 1) {
                System.out.println("Enter a insert node value");
                b = sc.nextInt();
                LL2.InsertAtStart(b);
            }
            if (c == 2) {
                LL2.Display();
            }
            if (c == 3) {
                System.out.println(LL2.first.info);
                break;
            }
        }
        while (LL1.first != null && LL2.first != null) {
            if (LL1.first.info != LL2.first.info) {
                System.out.println("Linked List is not same");
            } else {
                LL1.first = LL1.first.link;
                LL2.first = LL2.first.link;
                return;
            }
        }
        System.out.println("Linked List is same");
    }
}