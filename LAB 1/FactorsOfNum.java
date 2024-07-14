import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N(Positive Interger) : ");
        int n = sc.nextInt();
        System.out.print("Factors of " + n + " are: ");
        // Loop to find factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
