package com.homeExercise2;
//Write a Java program to create a new array of length 2 from two arrays of integers
// with three elements and the new array will contain the first and last elements from the two arrays.

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[3];
        int [] numbers2 = new int[3];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("ENTER THE ELEMENTS " + (i +1) + " :");
            numbers[i] = input.nextInt();
        }

        for (int j = 0; j< numbers2.length; j++){
            System.out.println("ENTER THE ELEMENTS FOR THE NUMBER2 ARRAY");
            numbers2[j] = input.nextInt();
        }
        System.out.println("Numbers " + Arrays.toString(numbers));
        System.out.println("Numbers2 "+ Arrays.toString(numbers2));

        int [] array_new = { numbers[0], numbers2[2]};
        System.out.println("New array "+ Arrays.toString(array_new));


    }
}
