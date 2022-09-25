package com.Decorator;

public class Dylbi extends Aksesor{
    public Dylbi(Arme arme){
        this.arme = arme;
    }
    @Override
    public void shoot() {
        System.out.println("ZOOOOOOM 150XXX");
        this.arme.shoot();

    }
}
