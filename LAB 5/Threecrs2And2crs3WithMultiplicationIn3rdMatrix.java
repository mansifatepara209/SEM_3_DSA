import java.util.*;

public class Threecrs2And2crs3WithMultiplicationIn3rdMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][2];
        int b[][] = new int[2][3];
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("a[" + i + "][" + j + "]:" + a[i][j]);
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("b[" + i + "][" + j + "]:" + b[i][j]);
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int ans = 0;
                for (int k = 0; k < 2; k++) {
                    ans = ans + (a[i][k] * b[k][j]);
                }
                c[i][j] = ans;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("c[" + i + "][" + j + "]:" + c[i][j]);
            }
        }
    }
}
