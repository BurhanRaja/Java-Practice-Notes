package com.Burhan;

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "blue";
    }
}

// This is called inheritance
// You can acces the properties from class Shape in Triangle
// Inheritance are of 3 types:-

// 1. Single class inheritance :- Base Class -> Derived Class
class Shape {
    String color;
    public void area() {
        System.out.println("display area");
    }
}
// Derived Class from Shape
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    } 
}

// 2. Multilevel Inheritance :- Base Class -> Derived Class -> Derived Class
// Extending the Trinagle class which itself is a derived class
class EquiLateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    } 
}

// 3. Hierarchial inheritance :-  Derived Class <- Base Class -> Derived Class
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}