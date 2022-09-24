package com.JavaAdvancedCodingTasks;
//Create a method that takes a string list as a parameter,
// then returns that list sorted alphabetically from Z to
//A case-insensitive.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {

    public static String[] fromZtoA(String[] arrays){
        Arrays.sort(arrays, Collections.reverseOrder());
        return arrays;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String[] arrays = new String[5];
        for(int i = 0; i < arrays.length;i ++){
            arrays[i] = input.next();
        }
        System.out.println(Arrays.toString(arrays).equalsIgnoreCase(String.valueOf(arrays)));
    }
}
