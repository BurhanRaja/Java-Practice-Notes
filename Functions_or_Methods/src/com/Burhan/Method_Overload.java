package com.Burhan;

public class Method_Overload {
    public static void main(String[] args) {
        func(2);
        func(2, "Burhan");
    }

    // The functions with the same name but have different outputs or different parameters.
    // This is known as method overloading

    static void func(int a) {
        System.out.println(a);
    }

    static void func(int b, String a) {
        System.out.println(b);
        System.out.println(a);
    }

}
