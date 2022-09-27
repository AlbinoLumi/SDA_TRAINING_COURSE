package com.ClassExercise;
//Write an application that takes a positive number from the user (type int) and prints all
//prime numbers greater than 1 and less than the given number

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0)
                counter = counter + 1;
                {


                }

            }
            if (counter == 2) {
                System.out.println(i);


            }
        }
    }
}


