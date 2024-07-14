import java.util.Scanner;

public class ArrayConatinDubOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of element");
            array[i] = sc.nextInt();
        }
        boolean duplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicate = true;
                }
            }
        }
        if (duplicate) {
            System.out.println("Given array contain duplicate value");
        } else {
            System.out.println("Given array contain not duplicate value");
        }
    }
}