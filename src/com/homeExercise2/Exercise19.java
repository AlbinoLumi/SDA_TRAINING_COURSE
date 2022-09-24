package com.homeExercise2;

//Write a Java program to find a number that appears only once in a given array of integers, all numbers occur twice

import java.util.Arrays;

public class Exercise19 {
    public static void main(String[] args) {

        int[] num = {7, 7,5,15, 15, 13, 13, 12, 12, 10, 10};

        int result;
        System.out.println("Original Array is : " + Arrays.toString(num));
        result = getSingleNumber(num);
        System.out.println("this number appears once " + result);





    }

    public static int getSingleNumber(int[] num) {

       int result = 0;
        for (int i : num){
            result ^= i;
        }
        return result;
    }

}
