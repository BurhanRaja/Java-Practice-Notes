package com.Burhan;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        
            // Marks        Grade 
        // 91-100         AA 
        // 81-90          AB 
        // 71-80          BB 
        // 61-70          BC 
        // 51-60          CD 
        // 41-50          DD 
        // <=40          Fail 

        Scanner inp = new Scanner(System.in);

        int marks = inp.nextInt();

        grade(marks);

        inp.close();
    }

    static void grade(int a) {
        if (a > 91) {
            System.out.println("AA");
        }
        else if (a > 81) {
            System.out.println("AB");
        }
        else if (a > 71) {
            System.out.println("BB");
        }
        else if (a > 61) {
            System.out.println("BC");
        }
        else if (a > 51) {
            System.out.println("CD");
        }
        else if (a > 41) {
            System.out.println("DD");
        }
        else if (a <= 40) {
            System.out.println("Fail");
        }
    }
    
}
