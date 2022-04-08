package com.Burhan;

public class Scoping {
    public static void main(String[] args) {
        
        // Not possible
        // System.out.println(num);

        int a = 10;

        {
            // If you have initialized a variable outside the block you can use it in the block
            // But if you have initialized a variable inside the block it can only used in the block
            a = 78;
            int c = 10;

            // possible
            System.out.println(c);
        }

        // possible
        System.out.println(a); // answer will be 78

        // Not possible
        // System.out.println(c);
    }

    // Here I can onlu acces num in this function and not in the main
    static void any(){
        int num = 1;

        // possible
        System.out.println(num);

        // This is called scope.
        // The scope of a variable can be accessed only where they have initialized. 
    }
}


// Whatever is initialized outside the block can be used inside the block but,
// Whatever is initialized inside the block cannot be used outside and can be initialized outside again.

// This above sentences applies same in loop