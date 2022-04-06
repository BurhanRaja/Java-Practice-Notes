package com.Burhan;

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {

        // Fibonacci Series is as follows:-
        // 0 1 1 2 3 5 8 13 21 34 55 89 .....

        Scanner inp = new Scanner(System.in);

        // Assigning the values
        int n = inp.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        // To print the nth number 
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

        // To print the whole fibonacci series
        for (int index = 0; index <= n; index++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }


        inp.close();
    }
}
