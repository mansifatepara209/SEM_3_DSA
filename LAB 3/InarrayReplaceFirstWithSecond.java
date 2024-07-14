import java.util.Scanner;

public class InarrayReplaceFirstWithSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of element");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        System.out.println("----------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}