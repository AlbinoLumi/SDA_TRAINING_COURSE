package com.sda.classess;

public class KrijimiObjekteve {
    public static void main(String[] args) {
        //krijimi i nje objekti
        Person personPare = new Person();
        Person personDyte = new Person("Lejratasdfasdf", "asdfasdfasdf", 12);

        //Therritja e atributeve publike
        System.out.println(personPare.gjinia);
        //Therritja e atributeve private
        System.out.println(personPare.getEmri());
        System.out.println(personDyte.getMosha());
        personDyte.setEmri("Elvis");
        System.out.println(personDyte.getEmri());
        personPare.setEmri("Albino");
        System.out.println(personPare.getEmri());

        //Therritja e metodave publike sepse metodat private nuk mund te aksesohen
        System.out.println(personPare.printoVlerat());
        System.out.println(personDyte.printoVlerat());

        //Dhenja e vleres kur atributi eshte privat
        personDyte.setMosha(99);
        System.out.println(personDyte.printoVlerat());
    }
}


