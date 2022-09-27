package com.sda.loops;

import com.sda.Person;

public class Familja {
    private Person[] personat;

    public Familja(){}

    public Familja(Person[] personat){
        this.personat = personat;
    }
    public String longestName(){

        String longestName = personat[0].getEmri();
        for(int i = 0; i<personat.length;i++){
            if(personat[i].getEmri().length() >longestName.length()  ){
                longestName = personat[i].getEmri();


            }

        }
            return longestName;
    }
    public float gjatesiaMesatare(){
        float average = personat[0].getGjatesia();
        float  sum = 0.0f;
        for (int i = 0; i< personat.length; i++){
            sum +=personat[i].getGjatesia();
             average = sum/ personat.length;
        }
        return average;
    }
    public String rrogaMeElarte(){
        int max = personat[0].getRroga();
        String emri =personat[0].getEmri();
        for (int i = 0; i< personat.length;i++){
            if(max <personat[i].getRroga()){
                max = personat[i].getRroga();
                emri = personat[i].getEmri();
            }
        }
        return emri;

    }

}
