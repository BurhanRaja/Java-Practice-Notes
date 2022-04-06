package com.Burhan.Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        float ans = 0;

        while (true) {
            
            System.out.print("Enter an operator: ");
            char op = inp.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                
                System.out.print("Enter two numbers: ");

                float num1 = inp.nextFloat();
                float num2 = inp.nextFloat();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0){
                        ans = num1 * num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }

            else if (op == 'x' || op == 'X'){
                break;
            }
            
            else{
                System.out.print("Invalid Operator. Try again!");
            }

            System.out.println(ans);
        }

        inp.close();

    }
}
