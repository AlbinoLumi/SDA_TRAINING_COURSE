package com.ClassExercise;

import java.lang.reflect.Array;

public class Bllok {

   private Apartament[] apartaments;

   private String emriBllokut;

  public Bllok (){}

    public Bllok(Apartament[] apartaments, String emriBllokut) {
        this.apartaments = apartaments;
        this.emriBllokut = emriBllokut;
    }


    public static void maxShitje(Apartament[] apartaments){
        int max = apartaments[0].getShtepiTeShitura();
        for (int i = 0; i < apartaments.length; i++){
            if (max <apartaments[i].getShtepiTeShitura()){
                max = apartaments[i].getShtepiTeShitura();
            }
            System.out.println(max);
        }

    }





}

