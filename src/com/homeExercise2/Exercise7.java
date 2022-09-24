package com.homeExercise2;
//Write a Java program to test if the first and the last element of an array of integers are same.
// The length of the array must be greater than or equal to 2.

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] numbers = new int[5];

        for (int i = 0; i < numbers.length ; i++){
            System.out.print("Enter element " + (i + 1) + " :");
            numbers[i] = input.nextInt();
        }
        if (numbers[0] == numbers[numbers.length -1]){
            System.out.println(" The result is : True ");

        }else
            System.out.println(" The result is : False ");

    }
}
