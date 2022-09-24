package com.sda.classess;

public class Laptop {



    private int ram;
    private String marka;
    private double procesor;

    public Laptop(){}

    public static int memoria=580;
    public static void printoMemoria(){

    }


    public Laptop(int ram, String marka, double procesor){
        this.ram = ram;
        this.marka =marka;
        this.procesor = procesor;
    }
    public int getRam(){
        return ram;
    }
    public String getMarka(){
        return marka;
    }
    public double getProcesor(){
        return procesor;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }
    public void setProcesor(double procesor){
        this.procesor = procesor;
    }


}
