import java.util.Scanner;

public class I_and_O {
   public static void main(String[] args) {

    // To input from the keyboard
    Scanner input = new Scanner(System.in);

    // To get output in command line
    System.out.println(input.next());

    // If error like "'input' is never close" occurs. Write the code below.
    input.close();
   }
}
