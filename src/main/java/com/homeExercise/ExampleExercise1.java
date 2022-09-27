package com.homeExercise;
//Write a program that takes a positive integer N - n (int) from the user,
// and then displays all powers of the number 2 in the console that are not
// greater than the number given (each number should be displayed in new line.
//
//For example, for the number 71 the program should write in the console the numbers: 1 2 4 8 16 32 64, in new line each.

import java.util.Scanner;

public class ExampleExercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int currentPowerOftwo = 1;

        do {
            System.out.println(currentPowerOftwo);
            currentPowerOftwo *= 2;
        } while
        (currentPowerOftwo < n);
    }
}




