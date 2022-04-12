package com.Burhan;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        int sum = 0;
        int tempnum = num;

        while (num != 0) {
            int temp = num % 10;
            sum += temp*temp*temp;
            num /= 10;
        }
        int armstrongNum = sum;
        if (armstrongNum == tempnum) {
            System.out.println("It is an Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }

        inp.close();

    }
}
