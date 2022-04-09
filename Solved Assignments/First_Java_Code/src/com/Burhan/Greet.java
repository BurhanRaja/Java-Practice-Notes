package com.Burhan;

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.

public class Greet {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        String name = inp.next();

        System.out.println("Hello " + name );

        inp.close();
    }
}
