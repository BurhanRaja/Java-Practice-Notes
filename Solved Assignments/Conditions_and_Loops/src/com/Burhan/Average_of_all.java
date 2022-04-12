package com.Burhan;

import java.util.Scanner;

public class Average_of_all {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int count = 0;
        float sum = 0;
        float average;

        while (true) {
            int num = inp.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
            count++;
        }
        
        average = sum / count;

        System.out.println(average);

        inp.close();
    }
}
