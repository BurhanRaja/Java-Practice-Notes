package com.Burhan;

import java.util.Scanner;

public class Print_Prime {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int n1 = inp.nextInt();
        int n2 = inp.nextInt();

        is_Prime(n1, n2);

        inp.close();
    }

        static void is_Prime(int a, int b) {

            for (int i = a; i <= b; i++) {

                // Running the loop from 2 
                int j;
                for (j = 2; j < i; j++) {

                    // Handling if a number is divisible
                    if (i % j == 0) {
                        break;
                    }

                    // Handling square of a number
                    int s = j*j;
                    if (s == j) {
                        break;
                    }
                }
                
                if (j==i) {
                    System.out.print(i + " ");
                }
            }
        }
}
