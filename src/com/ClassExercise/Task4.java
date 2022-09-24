package com.ClassExercise;

//Write an application that takes a positive number from the user (type int) and writes all
//numbers from 1 to the given number, each on the next line, with the following changes:
//● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//● in place of numbers divisible by 7, instead of a number the program should write
//"Buzz"
//● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 7 == 0) {

                System.out.println("Fizz Buzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);

            } else if (i % 7 == 0)
                System.out.println("Buzz  " + i);

        }
    }
}
