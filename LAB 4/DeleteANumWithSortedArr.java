import java.util.Scanner;

public class DeleteANumWithSortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] first = new int[size];
        int[] second = new int[size - 1];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of element");
            first[i] = sc.nextInt();
        }
        System.out.println("Enter element value to delete");
        int element = sc.nextInt();
        for (int i = 0; i < second.length; i++) {
            if (first[i] < element) {
                second[i] = first[i];
            } else if (first[i] == element) {
                second[i] = first[i + 1];
            } else if (first[i] > element) {
                second[i] = first[i + 1];
            }
        }
        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i] + " ");
        }
    }
}