package com.FirstandSecondDay;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeExercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Pyetja 3 : Cila nga keto data type eshte me e madhe ne memorie se Float  " +
                "1)byte ; 2)short ; 3;int  ; 4)double ");
        System.out.println("Ju lutem zgjidhni pergjigjen tuaj");

        int pergjigja = input.nextInt();
        switch (pergjigja) {
            case 4:
                System.out.println("Pergjigja juaj eshte e sakte");
                break;
            case 2:
            case 3:
            case 1:
                System.out.println("Pergjigja juaj eshte e gabuar");
                break;
            default:
                System.out.println("Pegjigja juaj nuk eshte e vlefshme");


        }


    }

    static {
        Scanner input = new Scanner(System.in);
        System.out.println(" Pyetja 1 eshte: Kursi SDA qe ne zhvillojme eshte kurs: 1) Java ; 2) PHP ; 3) PYTHON ; 4) JAVASCRIPT");
        System.out.println("Ju lutem zgjidhni pergjigjen tuaj");

        int pergjigja = input.nextInt();
        switch (pergjigja) {
            case 1:
                System.out.println("Pergjigja juaj eshte e sakte");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Pergjigja juaj eshte e gabuar");
                break;
            default:
                System.out.println("Pegjigja juaj nuk eshte e vlefshme");

        }

    }

    static {
        Scanner input = new Scanner(System.in);
        System.out.println("Pyetja 2: Sa eshte vlera e int ne byte : 1) 4byte ; 2) 8byte ; 3) 16byte ; 4) 32byte  ");
        System.out.println("Ju lutem zgjidhni pergjigjen tuaj");

        int pergjigja = input.nextInt();
        switch (pergjigja) {
            case 4:
                System.out.println("Pergjigja juaj eshte e sakte");
                break;
            case 2:
            case 3:
            case 1:
                System.out.println("Pergjigja juaj eshte e gabuar");
                break;
            default:
                System.out.println("Pegjigja juaj nuk eshte e vlefshme");

        }

        }




}

