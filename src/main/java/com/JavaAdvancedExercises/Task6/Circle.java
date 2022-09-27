package com.JavaAdvancedExercises.Task6;

public class Circle {

     double  radius;


    public Circle(){}

    public Circle(double radius ){
        this.radius = radius;

    }

    public double getCircumference(){
        return  2*Math.PI*radius;
    }

}
