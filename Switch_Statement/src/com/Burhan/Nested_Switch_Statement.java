package com.Burhan;

import java.util.Scanner;

public class Nested_Switch_Statement {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int emailId = inp.nextInt();
        String department = inp.next();

        switch (emailId) {
            case 1 -> System.out.println("Employee no. 1");
            case 2 -> System.out.println("Employee no. 2");
            case 3 -> {
                System.out.println("Employee no. 3");
                // Nested case
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("Enter the correct department");
                }
                break;
            }
            default -> System.out.println("Enter the correct emailId");
        }

        inp.close();
    }
}
