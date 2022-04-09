package com.Burhan;

import java.util.Arrays;

class Variable_args{
    public static void main(String[] args) {
        func(1, 56, 2, 78, 3, 67, 4);
    }

    // Here, the int ...v will be declared as an array of integers.
    // This is known as variable args

    static void func(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // Here, you cannot declare the variable args before any variable.
    // For example:- 
    // Not possible
    // static void multiple(int a, String ...v, int b) 
    
    // Possible
    static void multiple(int a, int b, String ...v) {
        
    }
}