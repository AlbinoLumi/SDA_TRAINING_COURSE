package com.ClassExercise;
//Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
//Your application should read two variables: weight (in kilograms, type float) and height
//(in centimeters, type int). BMI should be calculated given following formula:

//The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
//values. Your program should write "BMI optimal" or "BMI not optimal", according to the
//assumptions above.

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight");
        float weight = input.nextFloat();
        System.out.println("Enter your height");
        int height = input.nextInt();

        float BMI = (float) (weight / Math.pow(height , 2) * 10000);

        if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("BMI OPTIMAL " + BMI);
        }else
            System.out.println("BMI NOT OPTIMAL " + BMI);


    }


}
