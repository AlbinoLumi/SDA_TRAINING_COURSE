package com.sda.classess;

public class ImplementationContinenti {
    public static void main(String[] args) {

        Continent europa = new Continent("Europa", 26515,150, 25);

        System.out.println(europa.getEmri());
        System.out.println(europa.getMosha());
        System.out.println(europa.getNumriIshteteve());
        System.out.println(europa.getSiperfaqe());

        System.out.println(Continent.planeti);


    }
}
