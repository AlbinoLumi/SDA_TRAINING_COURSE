package com.sda.classess;

public class Qyteti {

    private String shtetiKueshte;
    private String emri;
    private int siperfaqja;

    public Qyteti(){}

    public Qyteti(String shtetiKueshte, String emri, int siperfaqja){
        this.shtetiKueshte = shtetiKueshte;
        this.emri = emri;
        this.siperfaqja= siperfaqja;
    }
    public String getShtetiKueshte(){
       return shtetiKueshte;
    }
    public String getEmri(){
        return emri;
    }
    public int getSiperfaqja(){
        return siperfaqja;
    }
    public void setShtetiKueshte(){
        this.shtetiKueshte = shtetiKueshte;
    }
    public void setEmri(){
        this.emri = emri;
    }
    public void setSiperfaqja(){
        this.siperfaqja = siperfaqja;
    }

}
