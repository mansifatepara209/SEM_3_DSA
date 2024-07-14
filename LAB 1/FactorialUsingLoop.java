import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] rags) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        for (fact = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
