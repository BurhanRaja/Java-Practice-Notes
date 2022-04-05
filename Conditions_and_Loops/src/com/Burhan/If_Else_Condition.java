package com.Burhan;

public class If_Else_Condition {
   public static void main(String[] args) {

        int salary = 25400;

        if (salary > 10000) {
            salary += 2000;
        }
        else if (salary > 20000) {
            salary += 3000;
        }
        else {
            salary += 1000;
        }

        System.out.println(salary);

   }
}