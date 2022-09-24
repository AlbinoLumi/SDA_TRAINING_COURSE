package com.homeExercise2;
// Write a Java program to merge two given sorted array of integers and create a new sorted array.

import java.util.Arrays;

public class Exercise15 {
    public static void main(String[] args) {
        int[] array1 = {10,11,12,13,14};
        int[] array2 = {15,16,17,18,19};

       int a1 = array1.length;
       int a2 = array2.length;

       int b = a1 + a2;

       int [] array3 = new int[b];

       System.arraycopy(array1,0,array3,0,a1);
       System.arraycopy(array2,0,array3,a1,a2);
        System.out.println(Arrays.toString(array3));


    }
}
