package com.sda.classess;

public class Person {

    //Atributet e klases Person
    private String emri;
    private String mbiEmri;
    private int mosha;
    public String gjinia;

    private String rroga;

    private int index;

    //Konstruktori qe eshte metoda qe ben te mbundur inicializimi e objektit

    //Default constructor
    public Person(){
        this.emri = "Lejrat";
        this.mbiEmri="Mesi";
        this.mosha=12;
        index++;
    }

    //Constructor me nje parameter
    public Person(String emri){
        this.emri = emri;
    }

    //Constructor me nje parameter
    public Person(String emri,String mbiEmri){
        this.emri=emri;
        this.mbiEmri = mbiEmri;
    }

    public Person(String emri,int mosha){
        this.emri=emri;
        this.mosha = mosha;
    }

    //Constuctori me te gjitha parametrat
    public Person(String emri, String mbiemri, int mosha){
        this.emri = emri;
        this.mbiEmri = mbiemri;
        this.mosha = mosha;
    }


    public int getMosha(){
        return mosha;
    }
    public void setMosha(int mosha){
        this.mosha=mosha;
    }

    public void setEmri(String emri){
        this.emri=emri;
    }

    public String getEmri(){
        return this.emri;
    }

    public void setMbiEmri(String mbiEmri){
        this.mbiEmri=mbiEmri;
    }

    public String getMbiEmri(){
        return this.mbiEmri;
    }



    public String printoVlerat() {
        return "Person + {" +
                "emri='" + this.emri + '\'' +
                ", mbiEmri='" + this.mbiEmri + '\'' +
                ", mosha=" + this.mosha +
                '}';
    }

}

