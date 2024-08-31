import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size(n) of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an element for array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Unsorted array is:" + arr[i]);
        }
        System.out.println();

        int i = 1;
        int key = 0;
        while (i < n) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            i++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Sorted array is: " + arr[k]);
        }
    }
}