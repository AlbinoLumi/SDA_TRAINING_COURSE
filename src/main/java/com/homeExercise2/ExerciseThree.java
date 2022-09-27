package com.homeExercise2;

//Write a Java program that accepts three integer
// values and return true if one of them is 20 or
// more and less than the substractions of others

import java.util.Scanner;

public class ExerciseThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni numrin e pare: ");
        int a = input.nextInt();
        System.out.println("Ju lutem vendosni numrin e dyte: ");
        int b = input.nextInt();
        System.out.println("Ju lutem vendosni numrin  e trete");
        int c = input.nextInt();

        System.out.println(Math.abs(a-b )>=20 || Math.abs(b-c) >=20 || Math.abs(c-a) >=20);

    }
}
