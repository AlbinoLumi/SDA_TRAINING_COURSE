package com.sda.loops;

import java.util.Arrays;

//Write a Java program to sort a given binary array in linear times.
public class ArrayUshtrimi8 {

    public static void main(String[] args) {

        int binaryNumbers[] = {0, 1, 1, 0, 1, 0, 1, 1, 0, 1};

        total(binaryNumbers);


    }

    static void total(int binaryNumbers[]) {
        for (int i = 0; i < binaryNumbers.length; i++) {
            Arrays.sort(binaryNumbers);
            System.out.print(binaryNumbers[i]);
        }

    }
}





