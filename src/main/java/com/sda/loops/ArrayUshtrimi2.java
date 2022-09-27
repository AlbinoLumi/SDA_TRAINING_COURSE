package com.sda.loops;

//Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class ArrayUshtrimi2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of array ");

        int[] number = new int[]{15, 25, 30};
        int value = input.nextInt();


        for (int i = 0; i < number.length; i++) {
            if (value == number[i]) {
                System.out.println("Array contains the given element");
                break;
            }else
                System.out.println("Array does not contain the given element");
            break;
        }
    }
}

























