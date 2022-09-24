package com.homeExercise2;

//Write a Java method to check whether every digit of a given integer is even.
// Return true if every digit is odd otherwise false.

import java.util.Scanner;

public class Exercise27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(test(num));

    }
    public static boolean test(int num){
        final int f = 10;
        if (num == 0){
            return false;
        }
        while ( num != 0){
            if((num % f) % 2 != 0){
                return true;
            }

            num /= 10;

        }
        return false;
    }

}
