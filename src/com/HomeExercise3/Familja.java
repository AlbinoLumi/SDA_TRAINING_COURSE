package com.HomeExercise3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Familja {

    Person[] personat;


    public Familja() {
    }

    public Familja(Person[] personat) {
        this.personat = personat;
    }

    public Person[] getPersonat() {
        return personat;
    }

    public void setPersonat(Person[] personat) {
        this.personat = personat;
    }

    public String gjatesiaMaEmadheSe5() {
        String longerThan5 = personat[0].getEmri();

        String emri = " ";

        for (int i = 0; i < personat.length; i++) {
            if (personat[i].getEmri().length() > 5) {

                longerThan5 = personat[i].getEmri();

                emri = personat[i].getEmri();
            }
        }
        return emri;
    }

    public String emriMeIvogel() {
        String shortestName = personat[0].getEmri();
        for (int i = 0; i < personat.length; i++) {
            if (personat[i].getEmri().length() < shortestName.length()) {
                shortestName = personat[i].getEmri();
            }
        }
        return shortestName;

    }

    public String longestName() {
        String longestName = personat[0].getEmri();
        for (int i = 0; i < personat.length; i++) {
            if (personat[i].getEmri().length() > longestName.length()) {
                longestName = personat[i].getEmri();
            }
        }
        return longestName;
    }

    public float moshaMesatare() {
        float mesatarja = 0f;
        for (int i = 0; i < personat.length; i++) {
            mesatarja += personat[i].getMosha();

        }
        return mesatarja / personat.length;
    }

    public String meIshkruti() {
        float gjatesia = 0.0f;
        String emri = " ";
        for (int i = 0; i < personat.length; i++) {
            if (personat[i].getGjatesia() < gjatesia) {
                gjatesia = personat[i].getGjatesia();
                emri = personat[i].getEmri();

            }
        }
        return emri;
    }

    public String meIgjati() {
        float gjatesia = 0.0f;
        String emri = " ";
        for (int i = 0; i < personat.length; i++) {
            if (personat[i].getGjatesia() > gjatesia) {
                gjatesia = personat[i].getGjatesia();
                emri = personat[i].getEmri();

            }
        }
        return emri;
    }

    public float gjatesiaMesatare() {
        float mesatarja = 0.0f;
        String emri = " ";
        for (int i = 0; i < personat.length; i++) {
            mesatarja += personat[i].getGjatesia();
        }
        return mesatarja / personat.length;
    }

    public String manAndWomen() {
        int total = 0;
        int total2= 0;

        for (int i = 0; i < personat.length; i++) {
            if (personat[i].getGjinia() == 'M') {
                total += 1;

            } else if (personat[i].getGjinia() == 'F'){
                total2 += 1;

            }



        }
        return (" \nTotal male : " + (total) + "\nTotal Female: " + (total2));


        }

        public String rrogaMeEvogel(){
        float min = personat[0].getRroga();
        String emri = personat[0].getEmri();

        for(int i=0; i <personat.length;i++){
            if(min > personat[i].getRroga()){
                min = personat[i].getRroga();
                emri = personat[i].getEmri();
            }
        }
        return emri;
        }
    public String rrogaMeEmadhe(){
        float max = personat[0].getRroga();
        String emri = personat[0].getEmri();

        for(int i=0; i <personat.length;i++){
            if( personat[i].getRroga() > max){
                max = personat[i].getRroga();
                emri = personat[i].getEmri();
            }
        }
        return emri;
    }

    public float rrogaMesatare(){
        int mesatarja = 0;
        String Emri = " ";
        for(int i = 0; i < personat.length; i++){
            mesatarja += personat[i].getRroga();
        }
        return mesatarja/ personat.length;

    }

    public int llogaritDitetEKaluara(LocalDate userInput){

        return Period.between(userInput, LocalDate.now()).getDays();
    }



    }



