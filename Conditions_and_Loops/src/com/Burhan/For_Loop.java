package com.Burhan;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        
        // Use for loop when you know the total prints you have to make.
        // For example in below case it is 5.


        // Print number 1 to 5
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        // }

        // Print n numbers
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        // To print the numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // To print Hello World
        for (int i = 1; i <= n; i++) {
            System.out.print("Hello World ");
        }

        inp.close();
    }
}
