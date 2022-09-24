package com.homeExercise2;

//Write Java methods to calculate the area of a triangle.

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for sides of Triangle : ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double semiPerimeter;
        double result;

        semiPerimeter = (a+b+c)/2;

        result =  Math.sqrt(semiPerimeter * (semiPerimeter -a) * (semiPerimeter -b) *(semiPerimeter -c));
        System.out.println("The area of triangle is : " + result);
    }


}
