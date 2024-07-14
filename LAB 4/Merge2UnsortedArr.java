import java.util.Scanner;

public class Merge2UnsortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size");
        int size1 = sc.nextInt();
        int[] first = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter value for first array");
            first[i] = sc.nextInt();
        }
        System.out.println("Enter second array size");
        int size2 = sc.nextInt();
        int[] second = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter value for second array");
            second[i] = sc.nextInt();
        }
        int[] third = new int[size1 + size2];
        int newArraySize = size1 + size2;
        for (int i = 0; i < size1; i++) {
            third[i] = first[i];
        }
        for (int i = 0; i < size2; i++) {
            third[size1] = second[i];
            size1++;
        }
        for (int i = 0; i < newArraySize; i++) {
            System.out.println(third[i]);
        }
    }
}