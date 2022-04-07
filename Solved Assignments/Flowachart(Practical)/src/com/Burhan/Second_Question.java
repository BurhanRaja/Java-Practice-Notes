package com.Burhan;

import java.util.Scanner;

public class Second_Question {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int sum = 0;

        sum = num1 + num2;

        System.out.println(sum);

        inp.close();
    }
}
