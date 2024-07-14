import java.util.Scanner;

public class Swap2NumWithUserDefined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter m:");
        int m = sc.nextInt();
        swap(n, m);
    }

    public static void swap(int n, int m) {
        int temp;
        temp = n;
        n = m;
        m = temp;
        System.out.println(n);
        System.out.println(m);
    }
}