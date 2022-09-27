package com.FirstandSecondDay;

public class HomeExercise3 {

    public static void main(String[] args) {

        int nota = 3 ;

        if (nota == 9 || nota == 10  ){
            System.out.println("Nota juaj eshte:A");
            
        } else if (nota == 7 || nota == 8) {
            System.out.println("Nota juaj eshte: B");
            
        } else if (nota ==5 || nota == 6) {
            System.out.println("Nota juaj eshte: C");
            
        } else if (nota <4 && nota >0) {
            System.out.println("Nota juaj eshte: D");
            
        } else if (nota <0 || nota >10) {
            System.out.println("Nota juaj nuk ben sens");
        }else {
            System.out.println("Nota juaj eshte me madhe ose me vogel se 4");
        }
    }
}
