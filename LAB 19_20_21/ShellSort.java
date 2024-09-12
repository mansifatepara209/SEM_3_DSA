import java.util.*;

public class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size(n) of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Shell_Sort(arr);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void Shell_Sort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    }
}
