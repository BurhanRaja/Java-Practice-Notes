package com.Burhan;

public class Shadowing {
    // Lets say we initialized a variable for the whole class
    // This 'x' can be accessed anywhere in this class
    
    // Universal variable
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // 90

        // Here the local variable will overriding the universal variable known as shadowing.
        int x = 40;
        System.out.println(x); // 40
        func(); // 90
    }

    static void func(){
        System.out.println(x);
    }
}
