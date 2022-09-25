package com.DesignPatters.Decorator;

public class Pistolete implements Arme{
    @Override
    public void shoot() {
        System.out.println("Pauuu Pauu...");
    }
}
