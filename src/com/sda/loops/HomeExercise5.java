package com.sda.loops;

/*Krijoni nje array qe mban notat e klases
notat do futen ne array nga perdoruesi
ju do me printoni noten me te larte ne klase.*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeExercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int nota [] = new int[arrayLength];

        for (int i = 0; i<nota.length; i++){
            System.out.println("Jepni noten e studentit" + (i + 1));
           nota [i] = input.nextInt();
        }

        int max = nota [0];
        for (int i = 1; i<nota.length; i++) {
            if (nota[i] > max)
                max = nota[i];
        }
        int min = nota [0];
        for (int i = 1; i<nota.length; i ++)
            if (nota [i] < min)
                min = nota [i];
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
        }


    }


