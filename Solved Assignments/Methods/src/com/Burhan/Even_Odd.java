package com.Burhan;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        
        even_odd(num);

        inp.close();
    }

    static void even_odd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
