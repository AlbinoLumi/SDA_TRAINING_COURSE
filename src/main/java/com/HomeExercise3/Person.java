package com.HomeExercise3;

import java.util.Date;

public class Person {
   private String emri;
   private String mbiemri;
  private    int mosha;
  private   float gjatesia;
  private   char gjinia;
  private String fakulteti;
  private  String puna;
  private  float rroga;
  private String gjendjaCivile;
  private  boolean kaMakine;
  private Date ditelindja;
  private boolean kaVellezer;
  private boolean kaMotra;


    public Person(){}

    public Person(String emri, String mbiemri, int mosha, float gjatesia, char gjinia, String fakulteti, String puna,
                  float rroga, String gjendjaCivile, boolean kaMakine, Date ditelindja, boolean kaVellezer, boolean kaMotra){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.fakulteti = fakulteti;
        this.gjatesia = gjatesia;
        this.gjinia = gjinia;
        this.rroga = rroga;
        this.gjendjaCivile = gjendjaCivile;
        this.kaMakine = kaMakine;
        this.ditelindja = ditelindja;
        this.kaVellezer = kaVellezer;
        this.kaMotra = kaMotra;
        this.puna = puna;
    }

    public String getEmri(){
        return emri;
    }
    public String getMbiemri(){
        return mbiemri;
    }
    public int getMosha(){
        return mosha;
    }
    public String getFakulteti(){
        return fakulteti;
    }
    public float getGjatesia(){
        return gjatesia;
    }
    public char getGjinia(){
        return gjinia;
    }
    public float getRroga(){
        return rroga;
    }
    public String getGjendjaCivile(){
        return gjendjaCivile;
    }
    public String getPuna(){
        return  puna;
    }
    public boolean isKaMakine(){
        return kaMakine;
    }
    public boolean isKaVellezer(){
        return kaVellezer;
    }
    public boolean isKaMotra(){
        return kaMotra;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public void setGjatesia(float gjatesia) {
        this.gjatesia = gjatesia;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    public void setFakulteti(String fakulteti) {
        this.fakulteti = fakulteti;
    }

    public void setPuna(String puna) {
        this.puna = puna;
    }

    public void setRroga(float rroga) {
        this.rroga = rroga;
    }

    public void setGjendjaCivile(String gjendjaCivile) {
        this.gjendjaCivile = gjendjaCivile;
    }

    public void setKaMakine(boolean kaMakine) {
        this.kaMakine = kaMakine;
    }

    public void setDitelindja(Date ditelindja) {
        this.ditelindja = ditelindja;
    }

    public void setKaVellezer(boolean kaVellezer) {
        this.kaVellezer = kaVellezer;
    }

    public void setKaMotra(boolean kaMotra) {
        this.kaMotra = kaMotra;
    }
}
