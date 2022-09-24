package com.JavaAdvancedCodingTasks;
//Create a method that takes a string list as a parameter,
// then returns the list sorted alphabetically from Z to
//A.

import java.util.*;

public class Task1 {

    public static String[] fromZtoA (String[] array){
        Arrays.sort(array, Collections.reverseOrder());
       return array;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the strings");
        String[] array = new String[5];
        for(int i = 0; i <array.length; i++){
            array[i] = input.next();
        }

        System.out.println(Arrays.toString(fromZtoA(array)));

    }
}
