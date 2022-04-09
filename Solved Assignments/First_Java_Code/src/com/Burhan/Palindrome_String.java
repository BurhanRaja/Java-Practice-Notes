package com.Burhan;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        // Taking input
        String word = inp.next();
        // Declaring the character variable to store characters one by one from the String
        char ch;
        // Declaring the empty string to store
        String revWord = "";
        // Storing a the string in the temperary variable
        String temp = word;

        // Loop to store the char of strings in 'ch' variable and adding it to revWord. 
        for (int i = 0; i < word.length(); i++) {
            ch= word.trim().charAt(i);
            revWord = ch + revWord;
        }
        
        // Condition to determine whether it true or false
        if (temp.equals(revWord)) {
            System.out.println("The string is Palindrome string");
        }
        else {
            System.out.println("Not a Palindrome string");
        }

        inp.close();
    }
}
