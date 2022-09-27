package com.sda.loops;

public class WhileLoopExercise {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");

            } else if (i % 3 == 0) {
                System.out.println("FIZZ");

            } else if (i % 5 == 0){
                System.out.println("BUZZ");

            } i++;
        }

    }
}
