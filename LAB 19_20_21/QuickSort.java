import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size(n) of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an element for array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        int lower = 0;
        int upper = n - 1;
        Quick_Sort(arr, lower, upper);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quick_Sort(int[] arr, int lower, int upper) {
        boolean flag = true;
        int j;
        int i = lower;
        j = upper + 1;
        int key = arr[lower];

        if (lower < upper) {
            while (flag == true) {
                i++;
                while (i <= upper && arr[i] < key) {
                    i++;
                }
                j--;
                while (j >= lower && arr[j] > key) {
                    j--;
                }
                if (i < j) {
                    int random = arr[i];
                    arr[i] = arr[j];
                    arr[j] = random;
                } else {
                    flag = false;
                }
            }

            int random = arr[lower];
            arr[lower] = arr[j];
            arr[j] = random;

            Quick_Sort(arr, lower, j - 1);
            Quick_Sort(arr, j + 1, upper);
        }
    }
}