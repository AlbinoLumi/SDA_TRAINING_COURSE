package com.homeExercise2;

//Write a Java program to find the numbers greater than the average of the numbers of a given array.

import java.util.Arrays;

public class Exercise30 {
    public static void main(String[] args) {

        int sum = 0;
        int[] a = new int[]{4, 8, 12, 10, 24};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }


        double average = sum / a.length;
        System.out.println("Numbers that are greater than average are : ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {

                System.out.println(a[i]);


            }

        }

    }

}





