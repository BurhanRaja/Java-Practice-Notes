package com.Burhan;

import java.util.Scanner;

public class Large_Number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max=0;
        int n;
        
        while (true) {
            n = inp.nextInt();
            if (n <= 0) {
                break;
            }
            if (n > max) {
                max = n; 
            }
        }

        System.out.println(max);

        inp.close();
    }
}
