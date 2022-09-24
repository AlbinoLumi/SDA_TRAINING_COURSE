package com.DesignPatters.PolyMorphism;

public class Bird extends SkyAnimal{
    @Override
    public void breath() {
        System.out.println("Zogu merr fryme me hunde");

    }

    @Override
    public void fly() {

        System.out.println("Zogu fluturon ne qiell");

    }
    public void sing(){
        System.out.println("Ciu, ciu , ciu...");
    }
}
