import java.util.Scanner;

public class AdditionOf2crs2MatrixInto3rdMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element of array a: ");
        int a[][] = new int[2][2];
        System.out.println("Enter element of array b: ");
        int b[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("a[" + i + "][" + j + "]:" + a[i][j]);
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("b[" + i + "][" + j + "]:" + b[i][j]);
                a[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("c[" + i + "][" + j + "]:" + a[i][j] + b[i][j]);
            }
        }
    }
}