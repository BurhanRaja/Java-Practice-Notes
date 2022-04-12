package com.Burhan;

import java.util.Scanner;

public class Vowels_Consonant {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter the letters in smallcase: ");
        String letter = inp.next();
        char l;

        l = letter.trim().charAt(0);
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
            System.out.println("It is a Vowel");
        }
        else {
            System.out.println("It is a Consonant");
        }

        inp.close();
    }
}
