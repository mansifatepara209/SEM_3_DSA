import java.util.*;
import java.util.Stack;

public class Evalution_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Prefix string:");
        String str = sc.nextLine();
        Evalution_Prefix obj = new Evalution_Prefix();
        obj.evaluate_prefix(str);
    }

    public void evaluate_prefix(String str) {
        Stack<Integer> Stack = new Stack<>();
        int value = 0;
        for (int i = str.length(); i < 0; i--) {
            char temp = str.charAt(i);
            if (Character.isDigit(temp)) {
                Stack.push(Character.getNumericValue(temp));
            } else {
                int opr1 = Stack.pop();
                int opr2 = Stack.pop();
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
                    default:
                        System.out.println("Invalid Choice!!");
                }
            }
        }
        System.out.println("Evaluation: ");
        System.out.println(Stack.pop());
    }
}