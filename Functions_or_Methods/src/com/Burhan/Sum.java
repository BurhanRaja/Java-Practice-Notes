package com.Burhan;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Calling sum one time

        // sum();

        // Calling sum 10 times;

        // for (int i = 1; i <= 10; i++) {
        // sum();
        // }

        // storing function in reference variable and printing it

        // int ans = sum2();
        // System.out.println(ans);

        // Calling sum2 10 times

        // for (int i = 1; i <= 10; i++) {
        // int ans = sum2();
        // System.out.println(ans);
        // }

        // Calling sum3

        int allsum = sum3(3, 5);
        System.out.print(allsum);
    }

    // return by giving input in function
    static int sum3(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = inp.nextInt();
        System.out.print("Enter 2st number: ");
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        inp.close();
        return sum;
    }

    // printing value
    static void sum() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = inp.nextInt();
        System.out.print("Enter 2st number: ");
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum of num1 and num2 is: " + sum);
        inp.close();
    }
}
