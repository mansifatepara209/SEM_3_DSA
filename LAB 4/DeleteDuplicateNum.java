import java.util.Scanner;
public class DeleteDuplicateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0 ; i<size ; i++){
            array[i] = sc.nextInt();
        }
        int newLength = array.length;
        for(int i=0 ; i<newLength ; i++){
            for(int j=i+1 ; j<newLength ; j++){
                if(array[i] == array[j]){
                    for(int k=j ; k<newLength-1 ; k++){
                        array[k] = array[k+1];
                    }
                    newLength--;
                    j--;
                }
            }
        }
        for(int i=0; i<newLength ; i++){
            System.out.println(array[i]+",");
        }
    }
}