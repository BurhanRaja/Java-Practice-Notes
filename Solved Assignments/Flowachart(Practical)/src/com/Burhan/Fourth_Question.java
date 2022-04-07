package com.Burhan;

import java.util.Scanner;

public class Fourth_Question {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int hcf = 1;

        // HCF
        int i;
        for (i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF = " + hcf);

        int lcm = (num1*num2) / hcf;
        System.out.println("LCM = " + lcm);

        inp.close();

    }
}
