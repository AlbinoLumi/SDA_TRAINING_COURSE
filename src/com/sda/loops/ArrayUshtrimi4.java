package com.sda.loops;
//Write a Java program to copy an array by iterating the array.

import java.util.Scanner;

public class ArrayUshtrimi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int[] number = new int[value];

        iterating(number,value, input);


    }

    static void iterating (int[] number, int value , Scanner input){
        for (int i = 0; i < number.length; i++) {
            value = i;
            System.out.println(i);

        }

    }
}

