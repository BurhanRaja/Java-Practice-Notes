package com.Burhan;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int number = inp.nextInt();
        int product = 1;

        while (number != 0) {
            product *= number;
            number--;
        }
        System.out.println(product);

        inp.close();
    }
}
