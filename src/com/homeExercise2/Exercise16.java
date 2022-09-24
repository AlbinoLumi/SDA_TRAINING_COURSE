package com.homeExercise2;
//write a Java program to compute the square root of a given integer.

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        System.out.println("Ju lutem vendosni nje numer :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        double squareOfNumber =  Math.sqrt(num);
        System.out.println("Rrenja katrore e numrit eshte : " + squareOfNumber);



    }
}
