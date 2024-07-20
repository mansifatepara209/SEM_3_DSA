//FIFO(First In First Out)
//insert at first and delete at last

import java.util.*;

class Queue_LL {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node top = null;
    Node first = null;

    public void Push(int data) {
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

    public int Pop() {
        if (first == null) {
            System.out.println("stack is underflow");
        } else {
            first = first.link;
        }
        return first.info;
    }

    public void DisplayQL() {
        Node temp = first;
        System.out.println(".............final ans............");
        while (temp != null) {
            System.out.println(temp.info + "");
            temp = temp.link;
        }
    }
}

public class Queue_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue_LL QLL = new Queue_LL();

        while (true) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to Pop");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter 4 to Exit");
            int c = sc.nextInt();
            int b;

            if (c == 1) {
                System.out.println("Enter a push value");
                b = sc.nextInt();
                QLL.Push(b);
            }
            if (c == 2) {
                QLL.Pop();
            }
            if (c == 3) {
                QLL.DisplayQL();
            }
            if (c == 4) {
                break;
            }
        }
    }
}
