package Basic_Code_Day_4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;
        
        System.out.println(sum);

        in.close();
    }
}
