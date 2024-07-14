import java.util.Scanner;

public class FindPositionOfSNOrLNFromNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elemnets: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter an elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ln = 0;
        int sn = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[sn]) {
                sn = i;
            } else if (a[i] > a[ln]) {
                ln = i;
            }
        }
        System.out.println("Possiton of smallest number:" + (sn + 1));
        System.out.println("Possiton of largest number:" + (ln + 1));
    }
}