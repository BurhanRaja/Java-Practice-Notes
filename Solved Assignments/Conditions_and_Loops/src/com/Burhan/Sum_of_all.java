package com.Burhan;

import java.util.Scanner;

public class Sum_of_all {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            num = inp.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
        inp.close();

    }
}
