package com.homeExercise2;

// Write a Java method (takes a number n as input) to displays an n-by-n matrix.

import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {
        System.out.println("Input a number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix ( int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }

}
