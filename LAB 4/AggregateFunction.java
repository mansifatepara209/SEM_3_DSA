//Suppose you are senior developer for an Relational Database Management System 
//named "Array Database" where everything is implemented using only array, today 
//your task is to implement aggregate function like sum, min, max, avg. For simplicity, 
//assume that your database can only store integers

import java.util.*;

public class AggregateFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Num1: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter Num2: ");
        // int num2 = sc.nextInt();

        System.out.println("1) For Sum");
        System.out.println("2) For min");
        System.out.println("3) For max");
        System.out.println("4) For avg");
        int aggr = sc.nextInt();

        if (aggr == 1) {
            System.out.println("Enter num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter num2:");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum is:" + sum);
        } else if (aggr == 2) {
            System.out.println("Enter num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter num2:");
            int num2 = sc.nextInt();
            if (num1 < num2) {
                System.out.println("Num1 is minimum");
            } else {
                System.out.println("Num2 is minimum");
            }
        } else if (aggr == 3) {
            System.out.println("Enter num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter num2:");
            int num2 = sc.nextInt();
            if (num1 < num2) {
                System.out.println("Num2 is maximum");
            } else {
                System.out.println("Num1 is maximum");
            }
        } else if (aggr == 4) {
            System.out.println("Enter n:");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            int avg = sum / n;
            System.out.println("Average is:" + avg);
        }
    }
}