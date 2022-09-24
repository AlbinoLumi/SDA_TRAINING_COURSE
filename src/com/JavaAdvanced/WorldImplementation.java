package com.JavaAdvanced;

public class WorldImplementation {
    public static void main(String[] args) {

        System.out.println("Po printojm te dhenat mbi planetin toke: ");

        Toka toka = new Toka();
        System.out.println(toka.numriiKontinenteve());
        System.out.println(toka.merrEmrinEKontinentitTePare());
        System.out.println(toka.ktheSiperfaqeneUjit());
        toka.printoEmrineGalaksise();

        System.out.println("Po printojm te dhenat mbi planetin marsi: ");

        Marsi marsi = new Marsi();
        System.out.println(marsi.numriiKontinenteve());
        System.out.println(marsi.merrEmrinEKontinentitTePare());
        System.out.println(marsi.ktheSiperfaqeneUjit());
        marsi.printoEmrineGalaksise();

        System.out.println("Po printojm te dhenat mbi planetin Jupiter: ");
        Jupiteri jupiteri = new Jupiteri();
        System.out.println(jupiteri.merrEmrinEKontinentitTePare());
        System.out.println(jupiteri.numriiKontinenteve());
        System.out.println(jupiteri.ktheSiperfaqeneUjit());
        jupiteri.printoEmrineGalaksise();

    }
}
