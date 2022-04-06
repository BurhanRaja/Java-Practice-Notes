package com.Burhan;

import java.util.Scanner;

public class Case_Recognition {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        char ch = inp.next().trim().charAt(0);

        
        if (ch >= 'a' && ch <= 'z'){
            System.out.print("It is a LowerCase");
        }
        else {
            System.out.print("It is an UpperCase");
        }

        inp.close();

    }
}
