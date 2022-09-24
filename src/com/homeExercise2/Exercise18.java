package com.homeExercise2;
//Write a Java program to calculate the median of a given unsorted array of integers.

import java.util.Arrays;

public class Exercise18 {

    public static void main(String[] args) {
        int[] num = {0, 25, 35, 12, 24, 18, 19,24};

        System.out.println(Arrays.toString(num));
        System.out.println("Median of given array is " + getMedian(num));
    }

    public static int getMedian(int[] array) {
        if (array.length % 2 == 0) {
            return (array[array.length/2] + array[array.length/2 - 1]) / 2;
        }
        return array[array.length/2];
    }
}



