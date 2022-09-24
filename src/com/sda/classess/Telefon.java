package com.sda.classess;

public class Telefon {
    private double kamera;
    private String marka;
    private double procesor;

    public Telefon(){};

    public Telefon(double kamera, String marka, double procesor){
        this.kamera = kamera;
        this.marka = marka;
        this.procesor = procesor;
    }
    public double getKamera(){
        return  kamera;
    }
    public String getMarka(){
        return marka;
    }
    public double getProcesor(){
        return procesor;
    }
    public void setMarka(){
        this.marka = marka;
    }
    public void setProcesor(){
        this.procesor =procesor;
    }
    public void setKamera(){
        this.kamera = kamera;
    }
}
