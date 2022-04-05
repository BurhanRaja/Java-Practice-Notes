package Basic_Code_Day_5;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // The conversion of integer into float is known as type conversion.
        // Here, the nextfloat will convert the integer into float.
        // But, nextInt cannot convert the float into integer.
        // Because the value of float is always greater than integer.
        // For Example:- float 50.0 has upper hand than integer 50.
        // This could only be done when both are compatible i.e., you cannot convert a String into an integer in type conversion.

        // float num = in.nextFloat();
        // System.out.println(num);

        // Try this:-
        // Input a float value below
        
        // int num = in.nextInt();
        // System.out.println(num);

        // float to Integer conversion:-
        // This conversion from float to integer is known as TypeCasting.
        
        // int num = (int)(67.57);
        // System.out.println(num);


        // Automatic Type promotion in expressions

        // Here it will not convert the integer into byte.
        // 1 byte = 256 characters

        // int a = 257;
        // byte b = (byte)(a); // 257 % 256 = 1
        // System.out.println(b); // This will give you 1
        
        // Here, first the byte is converted to integer and then it performs the given program.
        
        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int any = a*b/c;
        // System.out.println(any);

        // Cannot do this
        // byte b = 50;
        // b = b*2;

        // Example-2
        
        // It prints the ASCII value of the object
        // ASCII represents a character value of an Alphabet.
        
        // int a = 'A';
        // System.out.println(a);

        // Java is a Unicode language
        
        // System.out.println("नमस्ते");
        // System.out.println("你好");



        in.close();
    }
}

