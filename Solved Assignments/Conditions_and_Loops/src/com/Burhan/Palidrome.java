package com.Burhan;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        int revnum = 0;
        int tempnum = num;

        while (num != 0) {
            int temp = num % 10;
            revnum = revnum*10 + temp;
            num /= 10;
        }
        if (revnum == tempnum) {
            System.out.println("It is a Palindrome number");
        }
        else {
            System.out.println("Not a Plaidrome number");
        }

        inp.close();
    }
}
