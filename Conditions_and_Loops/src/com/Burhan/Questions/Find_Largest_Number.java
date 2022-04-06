package com.Burhan.Questions;

import java.util.Scanner;

public class Find_Largest_Number {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();


        // if (a > b){
        //     if (a > c){
        //         System.out.print("a is the largest integer.");
        //     }
        // }
        // else if (b > c){
        //     if (b > a){
        //         System.out.print("b is the largest integer.");
        //     }
        // }
        // else if (c > a){
        //     if (c > b){
        //         System.out.print("c is the largest integer.");
        //     }
        // }



        // You can also write this code as
        // int max = a;

        // if (b > max) {
        //     max = b;
        // }
        // if (c > max){
        //     max = c;
        // }
        
        // System.out.println("The largest integer is: " + max);
        


        // You can also write this code as
        // int max = 0; 

        // if (a > b){
        //     max = a;
        // }
        // else{
        //     max = b;
        // }

        // if (c > max){
        //     max = c;
        // }
        // System.out.println("The largest integer is: " + max);
        
        
        
        // You can also write this code as
        int max = Math.max(c, Math.max(a, b));
        System.out.println("The largest integer is: " + max);

        
        inp.close();
    }
    
}
