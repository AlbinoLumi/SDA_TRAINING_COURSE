package com.JavaAdvanced;

public class Toka implements World{

   public static Integer NUMRI_I_KONTINENTEVE = 7;
   public static String Emri_KONTINENTIT_PARE = "Pangea";
    public static Double SIPERFAQJA_UJIT = 381381.1D;


    @Override
    public Integer numriiKontinenteve() {
        return NUMRI_I_KONTINENTEVE;
    }

    @Override
    public void printoEmrineGalaksise() {
        System.out.println("Rruga Qumeshtit");
    }

    @Override
    public String merrEmrinEKontinentitTePare() {
        return Emri_KONTINENTIT_PARE;
    }

    @Override
    public double ktheSiperfaqeneUjit() {
        return SIPERFAQJA_UJIT;
    }
}
