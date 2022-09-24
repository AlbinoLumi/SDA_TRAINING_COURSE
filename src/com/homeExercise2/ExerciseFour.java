package com.homeExercise2;
// Write a Java program that accepts two integer values from the user and return the larger values.
// However if the two values are the same, return 0 and return the smaller value
// if the two values have the same remainder when divided by 6.

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni numrin e pare");
        int a = input.nextInt();
        System.out.println("Venosni numrin e dyte");
        int b = input.nextInt();

        System.out.println(result(a, b));


    }
    public static int result(int x, int y) {
        if (x == y)
            return 0;
        if (x % 6 == y % 6)

            if (x < y) {
                return x;
            }else
                return y;
            if (x > y){
                return x;
            }else
                return y;
    }
}








