import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a element for insert:");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
