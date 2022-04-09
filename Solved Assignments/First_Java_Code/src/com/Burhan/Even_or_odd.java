package com.Burhan;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.

class Even_or_odd {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        inp.close();
    }

}
