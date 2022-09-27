package com.sda.classess;

public class Shtet {

    private String emri;
    private int siperfaqja;
    private String kryeqyteti;

    public Shtet(){}

    public Shtet(String emri, int siperfaqja, String kryeqyteti){
        this.emri = emri;
        this.siperfaqja = siperfaqja;
        this.kryeqyteti = kryeqyteti;


        }

        public String getEmri(){
        return emri;
    }
    public int getSiperfaqja(){
        return  siperfaqja;
    }
    public String getKryeqyteti(){
        return kryeqyteti;
    }
    public void setEmri(String next){
        this.emri = emri;
    }
    public void setSiperfaqja(int i){
        this.siperfaqja = siperfaqja;
    }
    public void setKryeqyteti(String next){
        this.kryeqyteti = kryeqyteti;
    }
}
