package com.JavaAdvancedExercises.Task3;

public class Complex {

    public double real;
    public double imaginary;


    public Complex(){};

    public Complex (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }

    public static Complex sum(Complex c1, Complex c2){
        Complex temp = new Complex(0,0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    public static Complex difference(Complex c1 , Complex c2){
        Complex temp = new Complex(0, 0);
        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;
        return temp;
    }
    public static Complex product(Complex c1, Complex c2){
        Complex temp = new Complex(0,0);
        temp.real = c1.real * c2.real;
        temp.imaginary = c1.imaginary * c2.imaginary;
        return temp;
    }

}
