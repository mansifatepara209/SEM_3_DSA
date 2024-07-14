import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        int r = sc.nextInt();
        double A = Math.PI * r * r;
        System.out.println(A);
    }
}