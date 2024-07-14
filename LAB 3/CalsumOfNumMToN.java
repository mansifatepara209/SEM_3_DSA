import java.util.Scanner;

public class CalsumOfNumMToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number m:");
        int m = sc.nextInt();
        System.out.println("Enter a number n:");
        int n = sc.nextInt();
        int i = m;
        int sum = 0;
        for (i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
