package com.sda.loops;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Jepni gjatesine e array :");
        int n = input.nextInt();
        //Krijimim i nje array me gjatesi 7
        String emrat[] = new String[n];

        //menyra e pare e popullimit te array me vlera
        emrat[0] = "Lejrat";
        //System.out.println(emrat[0]);



        //Menyra e dyte per popullimin e array eshte me cikel for
        for (int i = 0; i<emrat.length;i++){
            System.out.println("Jepni vlerat e array");
            emrat[i] = input.next();
        }

        for (int i = 0;i < emrat.length;i++){
            System.out.println(emrat[i]);
        }
    }
}



