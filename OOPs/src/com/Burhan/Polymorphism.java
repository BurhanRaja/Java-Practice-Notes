package com.Burhan;

public class Polymorphism {
    public static void main(String[] args) {
        Students std = new Students();

        std.name = "Burhan";
        std.ages = 20;
        // System.out.println(std.name);
        // System.out.println(std.ages);

        std.printInfo(std.ages);
        std.printInfo(std.name, std.ages);
        std.printInfo(std.name);
    }
}

// Polymorphism means more than one.
// It has two types 1. Function overloading and 2. Function Overiding
// 1. Function Overloading runs at the compile time.
// 2. Function Overiding runs at runtime.

// We are using function overloading here, function overiding will be used in inheritance
class Students {
    String name;
    int ages;

    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
    public void printInfo(String name) {
        System.out.println(name);
    }
}