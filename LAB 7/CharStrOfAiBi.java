import java.util.Scanner;

public class CharStrOfAiBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string which contains a's and b's: ");
        String str = sc.next();
        str.toLowerCase();

        int acount = 0;
        int bCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                acount++;
            } else if (str.charAt(i) == 'b') {
                bCount++;
            } else {
                continue;
            }
        }

        if (acount == bCount) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}