package com.sda.loops;

import java.util.Scanner;

public class  ArrayExercise {

    /*Krijoni nje array qe mban notat e klases
 notat do futen ne array nga perdoruesi
 ju do me printoni noten me te larte ne klase.*/

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int gjatesiaArray = input.nextInt();
            int notat[] = new int[gjatesiaArray];

            //Vlerat merren sipas kesaj menyre
            for (int i = 0; i< notat.length; i++){
                System.out.println("Jepni noten e studentit " + (i+1));
                notat[i] = input.nextInt();
            }

            int max = notat[0];

            for (int i = 1;i< notat.length;i++){
                if(notat[i] > max){
                    max = notat[i];
                }
            }

            System.out.println(max);
        }
    }




