package Basic_Code_Day_4;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INTEGER:-
        // System.out.println("Please enter your roll no: ");
        // int rollno = input.nextInt();
        // System.out.println("Your roll no is " + rollno);

        // int a = 2_34_00_000;
        // System.out.println(a);

        // STRING
        // String name = input.next();
        // String name = input.nextLine(); // this will print the whole sentence
        // System.out.println(name);

        // FLOAT
        // float decimal = input.nextFloat();
        // System.out.println(decimal);

        // DOUBLE
        // double largeDecimal = input.nextDouble();
        // System.out.println(largeDecimal);

        // LONG
        // long largeInt = input.nextLong();
        // System.out.println(largeInt);

        // BOOLEAN
        // boolean check = input.nextBoolean();
        // System.out.println(check);
        
        input.close();
    }
}


// int a = 10;

// Here, a is a reference variable which is also called 'literals'.
// literals can be a classname, functio name, package name or folder name etc.
// 10 is an object also called identifiers.

// In order to understand a large integer instead of commas you can use '_' :-
// int a = 2_34_00_000