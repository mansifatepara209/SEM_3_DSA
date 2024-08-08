import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an size of an array");
        int n = sc.nextInt();
        int q[] = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Print Array:" + q[i]);
        }

        Dequeue DQ = new Dequeue();
        DQ.dequeue();
    }

    public int dequeue(int f, int r) {
        // check if queue is overflow or not?
        if (f == 0) {
            System.out.println("Queue is overflow!");
            return 0;
        }

        // delete element
        y = q[r];

        // is single element left from queue?
        if (f == r) {
            f = 0;
            r = 0;
        } else {
            f++;
        }
        return y;
    }

}