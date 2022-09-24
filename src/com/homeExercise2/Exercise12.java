package com.homeExercise2;
//Write a Java program to get the larger value between first and last element of an array of integers .

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i= 0; i<numbers.length ; i++){
            System.out.print("Enter the value "+(i + 1) + " :");
            numbers[i] = input.nextInt();
        }
        if (numbers[0] > numbers[numbers.length -1]){
            System.out.print(" Larger value between first and last element :" + numbers[0]);
        } else if (numbers[numbers.length -1] > numbers[0]) {
            System.out.print("Larger value between first and last element :" +numbers[numbers.length-1]);

        }

    }

}
