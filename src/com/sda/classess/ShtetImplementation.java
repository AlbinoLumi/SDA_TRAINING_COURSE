package com.sda.classess;

import java.util.Scanner;

public class ShtetImplementation {
    public static void main(String[] args) {
        Shtet shetet[] = new Shtet[2];
        Shtet shqiperia = new Shtet("Shqiperia", 28748, "Tirana" );
        Shtet kosova = new Shtet("Kosova", 17480, "Prishtina");
        shetet[0]= shqiperia;
        shetet[1]= kosova;
        //populloArray(shetet);
        maxSiperfaqe(shetet);


        System.out.println(shqiperia.getEmri());
        System.out.println(shqiperia.getSiperfaqja());
        System.out.println(shqiperia.getKryeqyteti());
        System.out.println(kosova.getEmri());
        System.out.println(kosova.getSiperfaqja());
        System.out.println(kosova.getKryeqyteti());
    }

    private static void populloArray(Shtet[] shetet) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < shetet.length;i++){
            Shtet shteti = new Shtet();
            System.out.println("Jepni emirn e shetetit");
            shteti.setEmri(input.next());
            System.out.println("Jepni siperfaqen e shetetit");
            shteti.setSiperfaqja(input.nextInt());
            System.out.println("Jepni kryeqytetin e shetetit");
            shteti.setKryeqyteti(input.next());
            shetet[i]= shteti;
        }

    }

    public static void maxSiperfaqe(Shtet shetet[]){
        int max = shetet[0].getSiperfaqja();
        for(int i = 1;i<shetet.length;i++){
            if(max< shetet[i].getSiperfaqja())
                max = shetet[i].getSiperfaqja();
        }

        System.out.println(max);

    }
}
