package com.Burhan;

import java.util.Scanner;

// To find Armstrong Number between two given number.
public class Armstrong_Number {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        
        int temp2 = n;
        int sum = 0;

        while (n != 0) {
            int temp1 = n;
            temp1 = n % 10;
            sum += (int) Math.pow(temp1, 3);
            n /= 10;
        }

        System.out.println(sum);

        if (sum == temp2) {
            System.out.println("ArmStrong Number.");
        }
        else {
            System.out.println("Not an ArmStrong Number.");
        }

        inp.close();

    }
}
