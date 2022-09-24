package com.sda.loops;

//Write a Java program to find the index of an array element.

import java.util.Scanner;

public class ArrayUshtrimi3 {

    public static void main(String[] args) {
        System.out.println("Please enter the value : ");

        Scanner input = new Scanner(System.in);

        int[] numbers = {8,17,25,45,96,88};
        int element = input.nextInt();
        int index=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                index = i;
                System.out.println("Index of " + element + " is : " + index);
            }

            }
        }
    }



