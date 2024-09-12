//ERROR aave che!!!!

import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size(n) of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Heap_Sort(arr);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void Heap_Sort(int[] arr) {
        BuildMaxHeap(arr);
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            Heapify(arr, i, 0);
        }
    }

    public static void BuildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(arr, n, i);
        }
    }

    public static void Heapify(int[] arr, int n, int i) {

        int MaxIndex = i;
        int LeftChild = 2 * i + 1;
        int RightChild = 2 * i + 2;

        // jo leftchild maxindex krta motu hoi to leftchild j maxindex bni jashe
        if (LeftChild < n && arr[LeftChild] > arr[MaxIndex]) {
            MaxIndex = LeftChild;
        }

        // jo rightchild maxindex krta motu hoi to rightchild j maxindex bni jashe
        if (RightChild < n && arr[RightChild] > arr[MaxIndex]) {
            MaxIndex = RightChild;
        }
        // jo root ae maxHeap na hoi to swapping thshe...
        if (i != MaxIndex) {
            int temp = arr[i];
            arr[i] = arr[MaxIndex];
            arr[MaxIndex] = temp;
            Heapify(arr, n, MaxIndex);
        }
    }
}
