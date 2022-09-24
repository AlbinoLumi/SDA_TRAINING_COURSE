package com.exercisesInClass;

public class Shkrimtare {

    private Autor autors[];

    public Shkrimtare() {
    }

    public Shkrimtare(Autor[] autors) {
        this.autors = autors;
    }

    public String gjejEmrinEAutoritMeA() {

        for (int i = 0; i < autors.length; i++) {
            if (autors[i].getEmri().startsWith("A")) {
                return autors[i].getEmri();
            }
        }
        return " ";
    }






    public String mbaronMeIl() {

        for (int i = 0; i < autors.length; i++) {

            if (autors[i].getEmri().endsWith("il")) {
                return  autors[i].getEmri();
            }
        }
        return " ";

    }

    public String gjejAutorin(){
        int max = autors[0].getNumriIveprave();
        String emri = autors[0].getEmri();
        for (int i = 0; i < autors.length; i++){
            if(autors[i].getNumriIveprave() > max){
                max = autors[i].getNumriIveprave();

                emri = autors[i].getEmri();
            }

        }
        return emri;
    }
}




