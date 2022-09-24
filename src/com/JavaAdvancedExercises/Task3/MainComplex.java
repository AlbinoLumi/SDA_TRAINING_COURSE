package com.JavaAdvancedExercises.Task3;

import com.JavaAdvancedExercises.Task3.Complex;

import java.util.Scanner;

import static com.JavaAdvancedExercises.Task3.Complex.*;

public class MainComplex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first real number : ");
        double number1 = input.nextDouble();
        System.out.println("Enter the first imaginary number :");
        double number2 = input.nextDouble();
        System.out.println("Enter the second real number : ");
        double number3 = input.nextDouble();
        System.out.println("Enter the second imaginary number :");
        double number4 = input.nextDouble();

        Complex c1 = new Complex(number1, number2);
        Complex c2 = new Complex(number3, number4);

        Complex temp = sum(c1 , c2);
        Complex temp1  = difference(c1, c2);
        Complex temp2 = product(c1, c2);


        System.out.println("Sum is: "+ temp.real+" + "+ temp.imaginary +"i");
        System.out.println("Difference is: "+ temp1.real+" - "+ temp1.imaginary +"i");
        System.out.println("Product is: "+ temp2.real+" * "+ temp2.imaginary +"i");


    }
}
