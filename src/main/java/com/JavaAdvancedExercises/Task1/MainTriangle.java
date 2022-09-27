package com.JavaAdvancedExercises.Task1;

import com.JavaAdvancedExercises.Task1.Triangle;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {


        Triangle triangle = new Triangle();
        System.out.println("Enter the lenght : ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        System.out.println("Enter the width");
        int number2 = input.nextInt();
        System.out.println("Enter the height");
        int number3 = input.nextInt();
        System.out.println("The perimeter for the triangle is : " + triangle.perimeter(number1, number2, number3));
        System.out.println("The area for this triangle is : " +triangle.area(number1, number2, number3));
    }
}
