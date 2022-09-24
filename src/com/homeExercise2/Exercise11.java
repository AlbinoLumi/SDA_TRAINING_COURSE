package com.homeExercise2;
//Write a Java program to rotate an array (length 3) of integers in left direction.

public class Exercise11 {

    public static void main(String[] args) {
        int[] array_num = {25,30,45};
        int n = 1;

        for (int i = 0; i< array_num.length; i++){
            System.out.println("Original Array :" + array_num[i]+ " ");
        }
        for (int i = 0; i < n ; i++){
            int j, first;
            first = array_num[0];
            for( j = 0;j < array_num.length-1; j++ ){
                array_num[j] = array_num[j +1];
            }
            array_num[j] = first;
        }
        System.out.println("Arrays after left rotation");
        for (int i = 0 ; i< array_num.length; i++){
            System.out.println(array_num[i]);
        }
    }
}
