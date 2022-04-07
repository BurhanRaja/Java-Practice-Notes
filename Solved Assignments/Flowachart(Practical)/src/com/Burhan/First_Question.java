package com.Burhan;

import java.util.Scanner;

class First_Question {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int year = inp.nextInt();

        if (year % 4 == 0 ) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }

        inp.close();
    }
}