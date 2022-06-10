package com.Burhan;

import java.util.Arrays;

public class Example_Student {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.rno = 12;
        std1.name = "Burhan";
        std1.marks = 89.5f;
        System.out.println(std1);

        // Student[] students = new Student[5];

        // System.out.println(Arrays.toString(students));
    }
}

class Student {
    int rno;
    String name;
    float marks;
}