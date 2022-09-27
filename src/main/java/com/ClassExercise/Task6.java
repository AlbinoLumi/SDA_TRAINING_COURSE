package com.ClassExercise;

//Write an application that takes a number n from the user (type int) and calculates the
//sum of the harmonic series from 1 to n, according to the formula below:

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double sum = 0.0;

        for (int i = 1; i<= number ; i++){
            sum += 1.0 /i;

        }
        System.out.println(sum);
    }

}
