package com.Burhan.Questions;

import java.util.Scanner;

public class Count_given_digits {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Type any integer with more than 4 digits: ");
        int n = inp.nextInt();

        System.out.print("Which digit to count in the given number: ");
        int digit = inp.nextInt();

        int temp = 0;
        int count = 0;

        while (n != 0) {
            temp = n % 10;
            if (temp == digit) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);

        inp.close();
    }
}
