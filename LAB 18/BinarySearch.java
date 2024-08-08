import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size(n) of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an element for array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a integer key:");
        int key = sc.nextInt();

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                System.out.println("found at: " + middle);
                break;
            } else if (key < arr[middle]) {
                right = middle + 1;
            } else {
                left = middle - 1;
            }
            System.out.println("Element not found");
            break;
        }
    }
}