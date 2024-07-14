import java.util.Scanner;

public class DisplayNNumUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            System.out.println(a[i]);
        }
    }
}
