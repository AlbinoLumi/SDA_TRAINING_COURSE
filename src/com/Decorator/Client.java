package com.Decorator;

public class Client {
    public static void main(String[] args) {
        Arme pistolete = new Pistolete();
        Arme silenciator = new Silenciator(pistolete);
        Arme pistoleteMeSilenciatorDheDylbi = new Dylbi(silenciator);
        pistoleteMeSilenciatorDheDylbi.shoot();
    }
}
