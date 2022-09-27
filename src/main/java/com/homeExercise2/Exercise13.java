package com.homeExercise2;
//Write a Java program to multiply corresponding elements of two arrays of integers.

import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        String result = " ";
        int[] array_num1 = {1, 2, 3};
        int[] array_num2 = {4, 5, 6};


        for (int i = 0; i < array_num1.length; i++) {

            result += Integer.toString(array_num1[i] * array_num2[i]) + " ";

        }
        System.out.println("Result is : " + result);
    }
}









