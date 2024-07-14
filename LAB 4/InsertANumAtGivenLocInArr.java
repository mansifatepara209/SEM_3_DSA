import java.util.*;

public class InsertANumAtGivenLocInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Print Array:" + a[i]);
        }
        System.out.println("Enter position:");
        int c = sc.nextInt();
        int position = c;
        System.out.println("Enter Index:");
        int d = sc.nextInt();
        int index = d;
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i < position) {
                b[i] = a[i];
            } else if (i == position) {
                b[i] = d;
            } else if (i > position) {
                b[i] = a[i - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(+b[i]);
        }
    }
}