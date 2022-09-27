package com.sda.classess;

public class Continent {
    private String emri;
    private int siperfaqe;
    private int numriIshteteve;
    private int mosha;
    public static int planeti=7;
    public static void printoPlanetin(){
        System.out.println(planeti);
    }




    public Continent(String emri, int siperfaqe, int numriIshteteve, int mosha){
        this.emri= emri;
        this.siperfaqe = siperfaqe;
        this.mosha = mosha;

    }
    public String getEmri(){
        return emri;
    }
    public int getSiperfaqe(){
        return siperfaqe;
    }
    public int getNumriIshteteve(){
        return numriIshteteve;
    }
    public int getMosha(){
        return mosha;
    }
}
