package com.FirstandSecondDay;

import java.util.Scanner;

public class HomeExercise10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" In this program we will exchange the value of dollar to Eur");
        System.out.println(" Please enter the sum in dollars");

        float eurValue = input.nextFloat();
        float fromDollartoEur = 0.98f;


        float totalFromDollarToEur = fromDollartoEur * eurValue;
        System.out.println(" The total is " + totalFromDollarToEur + " Eur ");



    }

}
