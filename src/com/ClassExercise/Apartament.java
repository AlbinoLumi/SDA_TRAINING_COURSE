package com.ClassExercise;

import java.lang.reflect.Array;

public class Apartament {

    private int shtepiTeShitura;

    private int numriKateve;

    private String ngjyra;

    private String emri;

    public Apartament(){}

    public Apartament(int shtepiTeShitura, int numriKateve, String ngjyra, String emri) {
        this.shtepiTeShitura = shtepiTeShitura;
        this.numriKateve = numriKateve;
        this.ngjyra = ngjyra;
        this.emri = emri;
    }

    public int getShtepiTeShitura() {
        return shtepiTeShitura;
    }

    public int getNumriKateve() {
        return numriKateve;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public String getEmri() {
        return emri;
    }

    public void setShtepiTeShitura(int shtepiTeShitura) {
        this.shtepiTeShitura = shtepiTeShitura;
    }

    public void setNumriKateve(int numriKateve) {
        this.numriKateve = numriKateve;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }



  }

