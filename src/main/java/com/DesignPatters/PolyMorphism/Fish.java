package com.DesignPatters.PolyMorphism;

public class Fish extends SeaAnimal {
    @Override
    public void swim() {
        System.out.println("Peshku noton...");

    }

    @Override
    public void breath() {
        System.out.println("Peshku merr fryme me veleza");

    }

    public void jump(){
        System.out.println("Peshku kercen mbi uje");
    }
}
