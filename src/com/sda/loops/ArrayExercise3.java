package com.sda.loops;

import java.util.Scanner;

public class ArrayExercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nexenesit[][] = new String[4][4];

        for (int i = 0; i < nexenesit.length; i++) {
            System.out.print("RReshti " + (i + 1) + " :");
            for (int j = 0; j < nexenesit[i].length; j++) {
                System.out.print(" Kolonat" + (1 + j));
            }
            System.out.println();

        }
    }
}
