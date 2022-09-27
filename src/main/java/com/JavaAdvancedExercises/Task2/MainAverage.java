package com.JavaAdvancedExercises.Task2;

import com.JavaAdvancedExercises.Task2.Average;

import java.util.Scanner;

public class MainAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        Average average = new Average();
        System.out.println("The average is : " + average.getAverage(number1, number2, number3));
    }
}
