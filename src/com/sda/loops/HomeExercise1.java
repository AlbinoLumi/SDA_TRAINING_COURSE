package com.sda.loops;

//* Te KRIJONI NJE PROGRAM QE TE SHKRUAJE fizz NE MOMENTIN KUR
        /* NUMRI PLOTPJESTOHET EM 3 DHE buzz NE MOMENTIN E PLOTPJESTIMIT ME 5
        NESE PLOTESOHEN TE GJITHA KUSHTET PRA PLOTPJESTOHET ME 5 DHE ME 3
        * ATEHERE DO PRINTONI FIZZBUZZ - Metoda (while)*/

public class HomeExercise1 {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else
                System.out.println("Buzz");
            i++;

        }
    }
}
