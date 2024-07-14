import java.util.Scanner;

public class CalAvgOfNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double avg = (double) sum / n;
        System.out.println(avg);
    }
}
