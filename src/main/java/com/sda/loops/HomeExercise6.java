package com.sda.loops;

import java.util.Scanner;
/*Krijoni nje array qe mban notat e klases
notat do futen ne array nga perdoruesi
ju do me printoni noten me te larte ne klase.*/

public class HomeExercise6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sa studenta do kontrollosh ? ");
        int perdoruesi = input.nextInt();
        int nota[] = new int[perdoruesi];

        for (int i =0 ; i<nota.length; i++){
            System.out.println("Ju lutem vendosni noten e studentit: "+ (i +1) );
            nota[i] = input.nextInt();
        }

        int max = nota[0];

        for (int i = 1 ; i <nota.length ; i++){
            if (nota[i]> max){
                max = nota[i];
                System.out.println(max);
            }

        }





    }
    }