import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size(n) of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        CountingSort sort = new CountingSort();
        sort.Counting_Sort(arr);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public void Counting_Sort(int[] arr) {
        int n = arr.length;
        int m = getMax(arr);
        int c[] = new int[m + 1];
        int b[] = new int[n];

        // intialize all element with 0
        for (int i = 0; i <= m; i++) {
            c[i] = 0;
        }

        // count element and increase this...
        for (int i = 0; i < n; i++) {
            c[arr[i]]++;
        }

        // commulative sum
        for (int i = 1; i <= m; i++) {
            c[i] = c[i] + c[i - 1];
        }

        // store elements with reverse loop
        for (int i = n - 1; i >= 0; i--) {
            b[c[arr[i]] - 1] = arr[i];
            c[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = b[i];
        }
    }

    // find largest element
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
