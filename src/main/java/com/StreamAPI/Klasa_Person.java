package com.StreamAPI;

public class Klasa_Person {

    private final String name;
    private final int age;
    private final Gjinia geneder;


    Klasa_Person(String name, int age, Gjinia gender){
        this.name = name;
        this.age = age;
        this.geneder = gender;
    }

    @Override
    public String toString() {
        return "com.StreamAPI.Klasa_Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", geneder=" + geneder +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gjinia getGeneder() {
        return geneder;
    }
}
