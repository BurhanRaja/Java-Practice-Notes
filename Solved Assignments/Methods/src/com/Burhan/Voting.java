package com.Burhan;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int age = inp.nextInt();

        vote(age);

        inp.close();
    }    

    static void vote(int a){
        if (a >= 18) {
            System.out.println("You can Vote");
        }
        else {
            System.out.println("You cannot Vote");
        }
    }
}
