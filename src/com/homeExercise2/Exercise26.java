package com.homeExercise2;

//Write a Java method that accept three integers and check whether they are consecutive are not.
// Return true or false.

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vendos numrin e pare: ");
        int a = input.nextInt();
        System.out.println("Vendos numrin e dyte: ");
        int b = input.nextInt();
        System.out.println("Vendos numrin e trete: ");
        int c = input.nextInt();

        System.out.println("Shofim nese numrat jan consecutive apo jo");
        System.out.println(test(a, b , c));



    }
    public static  boolean test(int a, int b , int c ){
        int max_num = Math.max(a, Math.max(b, c));
        int min_num = Math.min(a, Math.min(b, c));
        int midle_num = a + b +c - max_num - min_num;
        return (max_num - midle_num )== 1 && (midle_num - min_num == 1);
    }


}
