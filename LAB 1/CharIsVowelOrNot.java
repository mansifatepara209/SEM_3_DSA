import java.util.Scanner;

public class CharIsVowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character C:");
        char c = sc.charAt();
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println("Entered Character Is Vowel!!");
        } else {
            System.out.println("Entered Character Is Not Vowel!!");
        }
    }
}
