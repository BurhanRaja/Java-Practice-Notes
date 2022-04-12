package com.Burhan;

import java.util.Scanner;

// Input a number and print all the factors of that number 
public class Factors_of_number {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        inp.close();
    }
}
