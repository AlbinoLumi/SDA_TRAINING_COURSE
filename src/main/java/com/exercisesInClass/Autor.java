package com.exercisesInClass;

public class Autor {

    private String emri;
    private String mbiemri;
    private int numriIveprave;


    public Autor(){}

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getNumriIveprave() {
        return numriIveprave;
    }

    public void setNumriIveprave(int numriIveprave) {
        this.numriIveprave = numriIveprave;
    }

    public Autor(String emri, String mbiemri, int numriIveprave){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.numriIveprave = numriIveprave;
    }
}
