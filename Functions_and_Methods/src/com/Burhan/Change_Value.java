package com.Burhan;

import java.util.Arrays;

public class Change_Value {

    // Here the value of the array in the 0th position is changed
    // Because here we are not creating a whole new object instead we are modifying the value of 1 by 99.
    // This happens only in non-primitive data types.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change_arr(arr);
        System.out.println(Arrays.toString(arr));        
    }

    static void change_arr(int[] num){
        num[0] = 99;
    }
}
