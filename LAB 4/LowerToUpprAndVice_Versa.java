//WAP to replace lowercase characters by uppercase & vice-versa in a user specified 
//string.

import java.util.Scanner;

public class LowerToUpprAndVice_Versa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Before:" + str);
        str = str.toLowerCase();
        System.out.println("After But In Lower:" + str);
        str = str.toUpperCase();
        System.out.println("After But In Upper:" + str);
    }
}
