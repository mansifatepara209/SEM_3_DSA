import java.util.*;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an element for array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a integer key:");
        int key = sc.nextInt();

        
    int left = 0;
    int right =n-1;

        BinarySearchUsingRecursion BSC = new BinarySearchUsingRecursion();
        BSC.binary_search(left,right,key,arr[n]);

    }

    public int binary_search(left,right,key,arr[]){
        if(left<=right){
            int middle = (left+right)/2;
            return middle;
        }
        else if(key<arr[middle]){
            return binary_search(left,middle-1,key,arr[]);
        }
        else{
            return binary_search(middle+1,right,key,arr[]);
        }
    }
}