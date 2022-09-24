package com.FirstandSecondDay;

import java.util.Scanner;

public class HomeExercise8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ne kete program do te llogarisim vleren e EUR kur kthehet nga dollari");
        System.out.println("Ju lutem vendosni shumen ne Eur : ");


        float vleraEur = input.nextFloat();
        float vleraEurNeDollar = 1.02f;


        float ngaEurNeDollar =  vleraEur *  vleraEurNeDollar;
        System.out.println("Shuma nga Eur ne dollar eshte: " +ngaEurNeDollar+ " Dollars " );













        }




    }

