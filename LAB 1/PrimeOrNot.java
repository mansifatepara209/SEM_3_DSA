import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
