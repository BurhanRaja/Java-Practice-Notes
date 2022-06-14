package com.Burhan;

public class Constructor {
    public static void main(String[] args) {

        Student BurhanRaja = new Student();
        System.out.println(BurhanRaja.rno);
        System.out.println(BurhanRaja.name);
        System.out.println(BurhanRaja.marks);


        // A constructor defines what will happen when your object is created. It is also a special function.
        // Student() is a default constructor, already present in the class. 


        Student Rahul = new Student(34, "Rahul Bajaj", 67.8f);
        System.out.println(Rahul.rno);
        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);


        // Calling an object from a constructor of another object
        Student other = new Student(Rahul);
        System.out.println(other.name);


        Student random = new Student();
        System.out.println(random.name);

        // using final, you cannot change the variable object
        // final int bonus = 4;
        // bonus = 5; // cannot change


        final A Burhan = new A();
        Burhan.name="Burhan Bro";

        // But you cannot change or create new object with same instance variabel
        // A Burhan = new A(); // Not possible

    }
}

class A {
    final int num = 10;
    String name;
}

class Student {
    int rno;
    String name;
    float marks;

    // This will call the Student constructor that contains parameters
    Student () {
        this (34, "Bro", 78.9f); // Student (int rno, String name, float marks)
    }

    // To call an object from another object
    Student (Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    // This will set something like default value for the object created
    // Student () {
    //     this.rno = 12;
    //     this.name = "Burhanuddin Raja";
    //     this.marks = 90.5f;
    // } 

    // Student Rahul = new Student(34, Rahul Bajaj, 67.8)
    // Here you can just assign the values in constructor only.
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
