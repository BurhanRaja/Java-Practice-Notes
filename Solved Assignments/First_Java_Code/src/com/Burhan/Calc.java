package com.Burhan;

import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Calc {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int op = inp.next().trim().charAt(0);

        if (op == '+') {
            int sum = num1 + num2;
            System.out.println(sum);
        }

        if (op == '-') {
            int sub = 0;
            if (num1 > num2) {
                sub = num1 - num2;
            }
            if (num2 > num1) {
                sub = num2 - num1;
            }
            System.out.println(sub);
        }

        if (op == '*') {
            int product = num1 * num2;
            System.out.println(product);
        }

        if (op == '/') {
            if (num1 == 0 || num2 == 0) {
                System.out.println("0 cannot be used under division. Try again!");
            }

            float division = num1 / num2;
            System.out.println(division);
        }


        inp.close();
    }
}
