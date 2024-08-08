
//LIFO(Last In First Out)
//insert at firt and delete at first

import java.util.*;

class Stack_LL {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node top = null;
    Node first = null;

    public void push(int data) {
        Node new_Node = new Node(data);

        if (first == null) {
            first = new_Node;
            return;
        }
        Node temp = first;
        first = new_Node;
        first.link = temp;
    }

    public int pop() {
        if (first == null) {
            System.out.println("Stack is underflow");
        } else {
            first = first.link;
        }
        return first.info;
    }

    public void DisplaySL() {
        System.out.println("............final ans...............");
        while (first != null) {
            System.out.println(first.info + "");
            first = first.link;

        }
    }
}

public class Stack_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_LL SLL = new Stack_LL();

        while (true) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter 4 to Exit");
            int c = sc.nextInt();
            int b;

            if (c == 1) {
                System.out.println("Enter Element for push");
                b = sc.nextInt();
                SLL.push(b);
            }
            if (c == 2) {
                SLL.pop();
            }
            if (c == 3) {
                SLL.DisplaySL();

            }
            if (c == 4) {
                break;

            }
        }
    }
}