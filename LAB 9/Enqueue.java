import java.util.*;

public class Enqueue {
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
        System.out.println("Enter a element for insert:");
        int y = sc.nextInt();

        Enqueue ENQ = new Enqueue();
        ENQ.enqueue();
    }

    int f = 0;
    int r = 0;

    public void enqueue(int f, int r, int n, int y, int q[]) {
        // check for queue is overflow?
        if (r >= n) {
            System.out.println("Queue is overflow!");
            return;
        }
        // increment rear pointer
        else {
            r++;
            // insert element
            q[r] = y;
        }
        // is front poiner properly set?
        if (f == 0) {
            f = 1;
        } else {
            return;
        }
    }
}