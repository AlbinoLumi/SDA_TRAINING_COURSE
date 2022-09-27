package com.sda.loops;

import java.util.Scanner;

public class ArrayExercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gjatesiaArray = input.nextInt();
        int notat[] = new int[gjatesiaArray];

        for (int i = 0; i < notat.length; i++) {
            System.out.println("Jepni noten e studentit" + (i + 1));
            notat[i] = input.nextInt();
        }

        int min = notat[0];
        for (int i = 1; i < notat.length; i++) {
            if (notat[i] < min) {
                min = notat[i];
            }
        }
        System.out.println(min);
    }
}
