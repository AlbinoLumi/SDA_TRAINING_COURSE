package com.sda.loops;

import java.util.Scanner;

//Shkruani nje program qe gjatesine dhe vlerat e array i merr nga perdoruesi
// ndertoni nje metode qe ben popoullimin e array me input nga useri
// ndertoni nje metode qe ben printimin e array
// nderoni nje metode qe gjen shumen e gjith array.
public class MethodsJavaExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ju Lutemi Vendosni Gjatesine e Array");
        int gjatesiaArray = input.nextInt();
        int vlera[] = new int[gjatesiaArray];
        popullimi(vlera, input);
        printimi(vlera);
        mbledhja(vlera);
    }

    static void popullimi (int[] vlera, Scanner input) {
        for (int i = 0; i< vlera.length; i++){
            System.out.println("Ju lutem vendosni vlerat e arrayt");
            vlera[i] = input.nextInt();
        }
    }

    static void printimi (int [] vlera) {
        for (int i=0; i<vlera.length; i++) {
            System.out.println(vlera[i]);
        }
    }

    static void mbledhja (int [] vlera) {
        int shuma = 0;
        for (int i=0; i< vlera.length; i++) {

            shuma = shuma + vlera[i];

        }
        System.out.println(shuma);
    }
}




