package com.Burhan;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        int sum = 0;
        int tempNum = num;

        // Some perfect numbers are 6, 28, 496, 8128

        // Here, I didn't use 'i*i' because we need all the factors of the number including the repeating ones but not itself.

        for (int i = 1; i < num; i++) { // try putting i*i instead of i
            if (num % i == 0) {
                sum += i;
                // System.out.println(i); // try this to understand
            }
        }

        if (sum == tempNum) {
            System.out.println("It is a Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }

        inp.close();
    }
}
