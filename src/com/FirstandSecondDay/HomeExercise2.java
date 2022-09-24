package com.FirstandSecondDay;

import org.w3c.dom.ls.LSOutput;

public class HomeExercise2 {

    public static void main(String[]args) {

        int number_1 = 7;
        int number_2 = 8;

        System.out.println( number_1 == number_2 ); // false
        System.out.println( number_1 != number_2); // true
        System.out.println( number_1 >= number_2); // false
        System.out.println( number_1 <= number_2); // true
        System.out.println( number_1 > number_2); // false
        System.out.println( number_1 < number_2); // true

        int shume = number_1 + number_2;
        shume = shume + number_1;
        System.out.println(shume);

        System.out.println("Vlera e variablit number1 eshte =" + ++number_1);
        System.out.println("Vlera e variablit number2 eshte =" + --number_2);

        System.out.println("Vlera e variablit number1 eshte =" + number_1++);
        System.out.println("Vlera e variablit number2 eshte =" + number_2--);

        boolean vlera1 = false;
        boolean vlera2 = false, vlera4 = true;

        System.out.println( vlera1 && vlera2); // false
        System.out.println( vlera2 && vlera4); // false
        System.out.println( vlera1 || vlera4); // true
        System.out.println(!vlera1); //true

        byte vleraByte = 20;
        int vlera = vleraByte;
        float vleraFloat = vlera;
        float vleraFloat1 = vleraByte;
        System.out.println(vleraFloat);
        char character = 'a';
        int numberOfCharacter = (int) character;
        System.out.println(numberOfCharacter);
        long vleraLong = vleraByte;
        int vlera3 = (int) vleraFloat;
        char vlera6 = (char) numberOfCharacter;
        System.out.println(vleraLong);
        System.out.println(vlera3);
        System.out.println(vlera6);

        long vlera8 = 11;
        short vlera9 = (short) vlera8;
        System.out.println(vlera9);








    }





}
