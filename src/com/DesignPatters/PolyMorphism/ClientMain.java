package com.DesignPatters.PolyMorphism;

public class ClientMain {
    public static void main(String[] args) {
        Animal animal = new Fish();
        animal.breath();

        Fish myFish = (Fish) animal;
        myFish.swim();
        myFish.breath();




    }
}
