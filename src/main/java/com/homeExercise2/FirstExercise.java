package com.homeExercise2;

// Write a Java program to compute the area of a polygon.
//	Area of a polygon = (n*s^2)/(4*tan(π/n))
//	where n is n-sided polygon and s is the length of a side
//	Input Data:

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ns = input.nextInt();
        double side = input.nextDouble();

        System.out.println(areaOfPolygon(ns, side) + "");
    }

    public static double areaOfPolygon(int ns, double side){
        return (ns *(side * side))/(4.0*  Math.tan(Math.PI/ ns));
    }
}
