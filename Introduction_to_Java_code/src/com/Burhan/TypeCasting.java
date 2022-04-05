package Introduction_to_Java_code.src.com.Burhan;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // float num = in.nextFloat();

        // Try this:-
        // Input a float value below
        int num = in.nextInt();

        System.out.println(num);
        in.close();
    }
}

// Here, the nextfloat will convert the integer into float.
// But, nextInt cannot convert the float into integer.
// Because the value of float is always greater than integer.
// For Example:- float 50.0 has upper hand than integer 50.
// This is known as type conversion.
// This could only be done when both are compatible i.e., you cannot convert a String into an integer in type conversion.