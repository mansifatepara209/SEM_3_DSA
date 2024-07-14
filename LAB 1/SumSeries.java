import java.util.Scanner;

//1+(1+2)+(1+2+3)...
public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. Of Terms");
        int n = sc.nextInt();

        int sum = 0, i = 0;
        for (int j = 1; j <= n; j++) {
            for (i = 1; i <= j; i++) {
                sum = sum + i;
            }
            i = 1;
        }
        System.out.println("Sum If Series Is :" + sum);
    }
}
