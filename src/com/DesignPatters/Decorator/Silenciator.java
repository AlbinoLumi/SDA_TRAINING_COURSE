package com.Decorator;

public class Silenciator extends Aksesor{

    public Silenciator(Arme arme){
        this.arme = arme;
    }
    @Override
    public void shoot() {

        this.arme.shoot();

        System.out.println("Heard anything ?? ?");


    }
}
