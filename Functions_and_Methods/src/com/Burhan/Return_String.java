package com.Burhan;

public class Return_String {
    public static void main(String[] args) {

        // String greeting = greet();
        // System.out.println(greeting);

        String personalizedGreet = myGreet("Burhan");
        System.out.println(personalizedGreet);
    }
    
    // return value by giving input in function
    static String myGreet (String name) {
        String greetings = "Hello " + name;
        return greetings;
    }

    // return value
    static String greet(){
        String greetings = "How are you?";
        return greetings;
    } 
}
