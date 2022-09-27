package com.sda.classess;

public class ImplemntationCars {
    public static void main(String[] args) {
        Cars[] cars_1 = new Cars[3];
        Cars mercedez = new Cars("Mercedez", "white", 683);
        Cars ford = new Cars("Ford", "white", 65468);
        Cars toyota = new Cars("Toyota", "blue", 468438);

        cars_1[0] = mercedez;
        cars_1[1] = ford;
        cars_1[2] = toyota;


        System.out.println(mercedez.getSerialNumber());
        System.out.println(mercedez.getColor());
        System.out.println(mercedez.getMark());
        System.out.println(ford.getMark());
        System.out.println(ford.getColor());
        System.out.println(ford.getSerialNumber());
        System.out.println(toyota.getSerialNumber());
        System.out.println(toyota.getColor());
        System.out.println(toyota.mark);


    }


    }







