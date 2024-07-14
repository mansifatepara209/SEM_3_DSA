import java.util.*;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base:");
        int base = sc.nextInt();
        System.out.println("Enter Exponent:");
        int Exponent = sc.nextInt();
        long result = calculatePower(base, Exponent);
        System.out.println(base + " raised to the power of " + Exponent + " is: " + result);
    }

    public static long calculatePower(int base, int Exponent) {
        long result = 1;

        // Handle negative exponent by converting to positive and multiplying by
        // reciprocal
        if (Exponent < 0) {
            base = 1 / base;
            Exponent = -Exponent;
        }

        // Loop to calculate power
        for (int i = 0; i < Exponent; i++) {
            result *= base;
        }

        return result;
    }
}