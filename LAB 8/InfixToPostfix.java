import java.util.*;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Infix String str:");
        String str = sc.nextLine();
        Infix_To_Postfix(str);
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

    public static void Infix_To_Postfix(String str) {
        Stack<Character> Stack = new Stack<>();
        Stack.push('(');
        String polish = "";
        int rank = 0;

        for (int i = 0; i < str.length(); i++) {
            char next = str.charAt(i);
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
        System.out.println(polish);
    }
}