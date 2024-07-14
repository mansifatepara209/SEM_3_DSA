import java.util.Scanner;

public class ConvertDayIntoY_W_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days:");
        int day = sc.nextInt();

        int years = (day / 365);
        int weeks = (day % 365) / 7;
        int days = (day % 365) % 7;

        System.out.println("Years :" + years);
        System.out.println("Years :" + weeks);
        System.out.println("Years :" + days);
    }
}
