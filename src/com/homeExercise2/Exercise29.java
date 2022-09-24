package com.homeExercise2;
//Write a Java program to find the k largest elements in a given array.
// Elements in the array can be in any order

import java.util.Arrays;
import java.util.Collections;

public class Exercise29 {
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[]{2, 8, 33, 12, 10, 74, 120};
        int k = 3;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(k +" largest elements of the said array are:");
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }
}

