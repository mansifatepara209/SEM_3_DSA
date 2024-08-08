import java.util.*;
import java.util.Stack;

public class Evalution_Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a postfix string:");
        String str = sc.nextLine();

        Evalution_Postfix obj = new Evalution_Postfix();
        obj.evaluate_postfix(str);
    }

    public void evaluate_postfix(String str) {
        Stack<Integer> Stack = new Stack<>();
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isDigit(temp)) {
                Stack.push(Character.getNumericValue(temp));
            } else {
                int opr2 = Stack.pop();
                int opr1 = Stack.pop();
                switch (temp) {
                    case '+':
                        Stack.push(opr1 + opr2);
                        break;
                    case '-':
                        Stack.push(opr1 - opr2);
                        break;
                    case '*':
                        Stack.push(opr1 * opr2);
                        break;
                    case '/':
                        Stack.push(opr1 / opr2);
                        break;
                    case '^':
                        Stack.push(opr1 ^ opr2);
                        break;
                }
            }
        }
        System.out.println("evalution:" + Stack.pop());
    }
}