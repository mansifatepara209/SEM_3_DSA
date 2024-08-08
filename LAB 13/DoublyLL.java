import java.util.*;

class Doubly_LL {
    class Node {
        int info;
        Node lptr;
        Node rptr;

        public Node(int data) {
            this.info = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    Node L = null;
    Node R = null;
    Node M = L;

    public void InsertAtMiddle(int x) {
        Node New_Node = new Node(x);
        if (R == null) {
            New_Node.lptr = null;
            New_Node.rptr = null;
            L = New_Node;
            R = New_Node;
            return;
        } else if (M == L) {
            New_Node.lptr = null;
            New_Node.rptr = M;
            M.lptr = New_Node;
            L = New_Node;
            return;
        } else {
            New_Node.lptr = M.lptr;
            New_Node.rptr = M;
            New_Node.lptr.rptr = New_Node;
            return;
        }
    }

    public void Display_DLL() {
        Node save = L;
        save = L;
        while (save.rptr != null) {
            System.out.println(save.info);
            save = save.lptr;
        }
    }
}

// main method
public class DoublyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doubly_LL DLL = new Doubly_LL();
        boolean flag = true;

        while (true) {
            System.out.println("Enter 1 for insert number");
            System.out.println("Enetr 2 for display node");
            int num = sc.nextInt();
            int d;

            switch (num) {
                case 1:
                    System.out.println("Enter a num for insert");
                    d = sc.nextInt();
                    DLL.InsertAtMiddle(d);
                    break;

                case 2:
                    DLL.Display_DLL();
                    break;

                case 3:
                    flag = false;
            }
        }
    }
}

// class Double {
// int f = -1;
// int r = -1;
// int n;
// int arr[];

// public Double(int n) {
// this.n = n;
// this.arr = new int[n];
// }

// public boolean isFull() {
// return (r == n - 1);
// }

// public void dqinsert_front(int val) {
// if (f == 0) {
// System.out.println("cannot insert at first");
// return;
// }
// if (f == -1) {
// f = r = 0;

// } else {
// f--;
// arr[f] = val;

// }
// arr[f] = val;
// return;

// }

// public void dqinsert_rear(int val) {
// if (isFull()) {
// System.out.println("Queue Overflow");
// return;
// }
// if (f == -1) {
// f = 0;
// }
// r++;
// arr[r] = val;
// }

// public int dqdelete_front() {
// if (f == -1) {
// return 0;
// }
// if (f == r) {
// f = r = -1;
// } else {
// f++;

// }
// return arr[f - 1];

// }

// public int dqdelete_rear() {
// if (r == -1) {
// System.out.println("Underflow");
// return 0;
// }
// if (r == f) {
// r = f = -1;
// } else {
// r--;
// }
// return arr[r - 1];
// }

// public void display() {
// for (int i = f; i <= r; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// }

// public class DoublyLL {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// Double q = new Double(5);
// q.dqinsert_front(1);
// q.dqinsert_rear(3);
// q.dqinsert_rear(2);
// q.dqinsert_rear(6);
// q.dqdelete_rear();
// q.dqdelete_front();
// q.display();

// }
// }