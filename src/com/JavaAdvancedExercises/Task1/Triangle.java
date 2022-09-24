package com.JavaAdvancedExercises.Task1;

public class Triangle {

    private int length;
    private int width;
    private int height;


    public Triangle() {
        length = 3 ; width  = 4; height = 5;
    }

    public double perimeter(int length, int width, int height) {

        return   length + width + height;

    }

    public double area(int a, int b, int c) {
        double area = 0.0;

        double s = perimeter(length, width, height) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;

    }
}


