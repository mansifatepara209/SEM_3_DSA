import java.util.*;

public class LinearSearch {
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

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not key found!");
        }
    }
}