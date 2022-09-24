package com.homeExercise2;

//Write a Java program to test if the first or the last element of two array of integers are same.
// The length of the array must be greater than or equal to 2.

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        int[] numbers1 = new int[4];
        int[] numbers2 = new int[4];

        for (int i = 0; i<numbers1.length; i ++) {

            System.out.print("Enter the first value " + (i + 1)+ " :");
            numbers1[i] = input.nextInt();

        }
        int j;
        for (j = 0; j < numbers2.length; j++){
            System.out.print("Enter the second value " + (j +1)+ " :");
            numbers2[j] = input.nextInt();
        }
        if (numbers1[0] == numbers2[0] || numbers1[numbers1.length -1] == numbers2[numbers2.length - 1]){
            System.out.println("TRUE");
        }else
            System.out.println("FALSE");

    }
}
