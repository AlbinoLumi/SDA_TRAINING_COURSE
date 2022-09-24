package com.homeExercise2;

// Write a Java program to get the difference between the largest and smallest values in an array of integers.
// The length of the array must be 1 and above.

import java.util.Arrays;

public class Exercise21 {

    public static void main(String[] args) {

        int [] num = {2,12,8,36,23};


        System.out.println("The maximum number is : " +max(num));
        System.out.println("The minimum number is : " +min(num));
        System.out.println("The difference between the largest and smallest number is : " + (max(num) - min(num)));


    }
    public static int max (int [] num){
        int max = num[0];
        for (int i = 0; i< num.length; i++){
           if (num[i] > max){
               max = num[i];
           }
        }
        return max;
    }
    public static int min(int[] num){
        int min =num[0];
        for (int i = 0; i< num.length ; i++){
            if(num[i] < min){
                min = num[i];

            }
        }
        return min;
    }
}
