package com.homeExercise2;

//Write a Java program to test if 10 appears as either the first or last element of an array of integers.
// The length of the array must be greater than or equal to 2

import java.util.Scanner;

public class ExerciseSix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[4];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        boolean test = false;
        if (numbers[0] == 10 || numbers[numbers.length - 1] == 10) {

            test = true;
                System.out.println(" The result is : " + test);

            } else
                System.out.println(" The result is : " + test);
        }
    }






