package com.ClassExercise;

//Write an application that will read diameter of a circle (variable of type float) and
//calculate perimeter of given circle.
//Firstly, assume π = 3.14. Later, use value of π from built-in Math class

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the circle of diameter");

        Scanner input = new Scanner(System.in);
        float diameter = input.nextFloat();

        float perimeter = (float) (2 * Math.PI * (diameter / 2));

        System.out.println("Perimeter of the circle is : " + perimeter);





    }

}
