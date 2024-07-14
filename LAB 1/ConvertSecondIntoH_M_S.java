import java.util.Scanner;

public class ConvertSecondIntoH_M_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds :");
        int Sec = sc.nextInt();

        int s = Sec % 60;
        int h = Sec / 60;
        int m = h % 60;
        h = h / 60;

        System.out.println(h + ":" + m + ":" + s);
    }
}
