package com.ClassExercise;
//Write an application that will take a positive number from the user (type int) and
//calculate the Fibonacci number at the indicated index. For example, if the number equals
//5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
//number is the sum of the two preceding ones

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("F("+number+") = " + fibonacci(number));



    }
    public static int fibonacci (int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
