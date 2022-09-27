package com.ClassExercise;
//Write a program for solving a quadratic equation. The program should take three integers
//(coefficients of the quadratic equation a, b, c) and calculate the roots of the
//equation
// If delta ∆ comes out negative, print "Delta negative" and exit the program.
//Formulas youЀll need:

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double delta = (b * b) - (4 * a * c);

        if (delta < 0){
            System.out.println("Delta Negative");

        }else {
            double x1 = -b - Math.sqrt(delta)/ 2 *a;
            double x2 = -b + Math.sqrt(delta)/ 2 *a;

            System.out.println(" X1 = " + x1);
            System.out.println(" X2 = " + x2);
        }
    }

}
