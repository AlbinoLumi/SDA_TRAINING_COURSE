package com.FirstandSecondDay;

import java.util.Scanner;

public class ElseifExercise2 {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Ju lutem vendosni noten e studentit");
            int nota = input.nextInt();
            double not3 = input.nextDouble();
            String nota2 = input.nextLine();
            if (nota < 0) {
                System.out.println("Nota nuk ben sens");
            } else if(nota > 0 && nota < 5){
                System.out.println("D");
            } else if(nota == 5 || nota == 6 ){
                System.out.println("C");
            } else if (nota == 7 || nota == 8) {
                System.out.println("B");
            } else if(nota>= 9 && nota < 11){
                System.out.println("A");
            } else{
                System.out.println("Nota eshte me e madhe se 10");
            }
        }
    }