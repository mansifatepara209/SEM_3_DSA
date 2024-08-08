import java.util.*;
import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Infix String str:");
        String str = sc.nextLine();
        Infix_To_Prefix(str);
    }

    public static int IPF(char i) {
        if (i == '+' || i == '-') {
            return 1;
        } else if (i == '*' || i == '/') {
            return 3;
        } else if (i == '^') {
            return 6;
        } else if (i >= 'A' && i <= 'Z' || i >= 'a' && i <= 'z') {
            return 7;
        } else if (i == '(') {
            return 9;
        } else if (i == ')') {
            return 0;
        } else {
            return -1;
        }
    }

    public static int SPF(char i) {
        if (i == '+' || i == '-') {
            return 2;
        } else if (i == '*' || i == '/') {
            return 4;
        } else if (i == '^') {
            return 5;
        } else if (i >= 'A' && i <= 'Z' || i >= 'a' && i <= 'z') {
            return 8;
        } else if (i == '(') {
            return 0;
        }
        return 7;
    }

    public static int RF(char i) {
        if (i == '+' || i == '-' || i == '*' || i == '/' || i == '^') {
            return -1;
        } else {
            return 1;
        }
    }

    public static void Infix_To_Prefix(String str) {
        Stack<Character> Stack = new Stack<>();
        Stack.push('(');
        String polish = "";

        String newstr = null;
        String newPolish = "";
        int rank = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            char c = str.charAt(i);
            if (c == '(') {
                c = ')';
            } else if (c == ')') {
                c = '(';
            }

            char next = c;

            while (SPF(Stack.peek()) > IPF(next)) {

                char temp = Stack.pop();
                polish = polish + temp;
                rank = rank + RF(temp);

                if (rank < 1) {
                    System.out.println("Invalid!!");
                    return;
                }
            }
            if (SPF(Stack.peek()) != IPF(next)) {
                Stack.push(next);
            } else {
                Stack.pop();

            }
        }
        if (!Stack.isEmpty() || rank != 1) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
        System.out.println("postfix string:" + polish);
        for (int i = polish.length() - 1; i >= 0; i--) {
            char m = polish.charAt(i);
            newPolish = newPolish + m;
        }
        System.out.println("Evaluated Polish is:" + newPolish);
    }
}