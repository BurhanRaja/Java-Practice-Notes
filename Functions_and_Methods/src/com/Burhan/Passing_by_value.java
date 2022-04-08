package com.Burhan;

public class Passing_by_value {
    public static void main(String[] args) {
        
        // int a = 10;
        // int b = 20;

        // This will not print the swapped the value of a and b
        // swap(a, b);
        // System.out.println(a + " " + b);

        // Here it will print 'Burhan Raja' because
        // The variable name is saved in Stack memory and its value is saved in Heap memory
        // It copies value of the reference variable name in greet(naam), so we can say that naam is also pointing towards the same name 'Burhan Raja'.
        // Then again we say that naam = "Rahul ....".
        // So, name remains 'Burhan Raja' and naam changes again to "Rahul ....".
        // And name is printed. 
        // Java is the passing by value and not passing by reference
        // So it passes the value instead of variables.
        // Here, we are not modifying the object we are changing it.

        // This happens only in primitive data type.
        String name = "Burhan Raja";
        getName(name);
        System.out.println(name);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void getName(String naam){
        naam = "Rahul Raj";
    }
}
