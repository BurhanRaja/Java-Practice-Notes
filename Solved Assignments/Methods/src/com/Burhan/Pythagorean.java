package com.Burhan;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int num3 = inp.nextInt();

        pythagorean_triplet(num1, num2, num3);

        inp.close();
    }

    static void pythagorean_triplet(int a, int b, int c) {
        if (a*a == b*b + c*c) {
            System.out.println("Pythagorean Triplet");
        }
        if (b*b == a*a + c*c) {
            System.out.println("Pythagorean Triplet");
        }
        if (c*c == a*a + b*b) {
            System.out.println("Pythagorean Triplet");
        }

        else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }
}
