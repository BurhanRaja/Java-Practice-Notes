package com.Burhan;

import java.util.Scanner;

public class Fibinacci_Series {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = b + a;
            a = b;
            b = c;
        }

        inp.close();
    }
}
