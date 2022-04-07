package com.Burhan;

import java.util.Scanner;

public class Third_Question {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        int c = 1;
        int product = 1;

        while (c <= 10) {
            product = num * c;
            System.out.println( num + " * " + c + " = " + product);
            c = c + 1;
        }

        inp.close();

    }
}
