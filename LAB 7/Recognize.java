import java.util.Scanner;

public class Recognize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string (also enter 'C' between two strings also enter space at end ): ");
        String str = sc.next();

        str.toLowerCase();

        int index = 0;
        stack stc = new stack(str.length());

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                index = i;
                break;
            } else {
                stc.push(str.charAt(i));
            }
        }
        boolean isFound = true;
        for (int i = index + 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != stc.pop()) {
                isFound = false;
                break;
            }
        }
        if (!isFound) {
            System.out.println("InValid");
        } else {
            System.out.println("Valid");
        }
        
        sc.close();
    }
}

class stack {
    int n;
    char[] arr;
    int top = -1;

    public stack(int n) {
        this.n = n;
        arr = new char[n];
    }

    void push(char x) {
        if (top >= (n - 1)) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            arr[top] = x;
        }
        return;
    }

    int pop() {
        if (top == -1) {
            return -1;
        } else {
            top = top - 1;
            return arr[top + 1];
        }
    }
}