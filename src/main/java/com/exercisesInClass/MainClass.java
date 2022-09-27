package com.exercisesInClass;

public class MainClass {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Jamil ","Gordon", 3 );
        Autor autor2 = new Autor("Stephen", "King", 26);
        Autor autor3 = new Autor("Albino", "Lumi",1);

        Autor autors [] = new Autor[]{autor1, autor2, autor3 };

        Shkrimtare shkrimtare = new Shkrimtare(autors);
        System.out.println(shkrimtare.gjejEmrinEAutoritMeA());
        System.out.println(shkrimtare.gjejAutorin());
        System.out.println(shkrimtare.mbaronMeIl());


    }




}
