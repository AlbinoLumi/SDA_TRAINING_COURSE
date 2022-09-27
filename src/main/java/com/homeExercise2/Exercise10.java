package com.homeExercise2;

// Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[2];

        for (int i = 0; i< array.length; i++){
            System.out.print("Enter the element " + (i +1) + " :");
            array[i] = input.nextInt();
        }
        if (array[0] == 4  || array[0] == 7 ){
            System.out.println("True");
        }else
            System.out.println(array[1] == 4 || array[1] == 7);
    }


}
