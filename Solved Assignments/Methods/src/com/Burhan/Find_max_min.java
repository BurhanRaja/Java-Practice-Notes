package com.Burhan;

import java.util.Scanner;

class Find_max_min {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();

        max_min(num1, num2, num3);

        inp.close();
    }

    static void max_min(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b ) {
            max = c;
        }
        System.out.println(max);
    }
}