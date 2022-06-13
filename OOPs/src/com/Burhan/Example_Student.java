package com.Burhan;

public class Example_Student {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.rno = 12;
        std1.name = "Burhan";
        std1.marks = 89.5f;
        System.out.println(std1);

        // Student is a class instantialize.
        // std1 is an object of a student.
        // rno, name and marks are reference variable for objects to access.
        // new is to create new object.
        // A constructor defines what will happen when your object is created. It is also a special function.
        // Student() is a default constructor, already present in the class. 
    }
}

class Student {
    int rno;
    String name;
    float marks;
}