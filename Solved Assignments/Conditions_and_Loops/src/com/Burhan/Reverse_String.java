package com.Burhan;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        String strInput = inp.next();
        char c;
        String revstr = "";

        // System.out.println(strInput.length());

        for (int i = 0; i < strInput.length(); i++) {
            c = strInput.trim().charAt(i);
            revstr = c + revstr;
        }
        System.out.println(revstr);

        inp.close();
    }
}
