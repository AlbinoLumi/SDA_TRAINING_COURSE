package com.sda.loops;

public class ForExampleExercise {

        /*
* Te KRIJONI NJE PROGRAM QE TE SHKRUAJE fizz NE MOMENTIN KUR
* NUMRI PLOTPJESTOHET EM 3 DHE buzz NE MOMENTIN E PLOTPJESTIMIT ME 5
NESE PLOTESOHEN TE GJITHA KUSHTET PRA PLOTPJESTOHET ME 5 DHE ME 3
* ATEHERE DO PRINTONI FIZZBUZZ*/


        public static void main (String[] args){

            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FIZZBUZZ");
                } else if (i % 3 == 0) {
                    System.out.println("FIZZ");
                } else {
                    System.out.println("BUZZ");
                }
            }
        }
    }





