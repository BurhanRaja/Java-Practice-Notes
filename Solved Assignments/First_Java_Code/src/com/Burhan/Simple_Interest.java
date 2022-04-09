package com.Burhan;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        int principle = inp.nextInt();
        
        System.out.print("Enter the time (in years): ");
        float time = inp.nextInt();
        
        System.out.print("Enter the rate (in percentage): ");
        float rate = inp.nextInt();

        float simpleInterest = principle * (1 + rate * time);

        System.out.print("The Simple Interest = " + simpleInterest);

        inp.close();
    }   
}
