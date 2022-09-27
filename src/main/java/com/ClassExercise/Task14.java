package com.ClassExercise;
//Write an application that reads two lowercase letters of the Latin alphabet (type char)
//and calculates how many characters is there in the alphabet between given letters.
//Hint - use the ASCII code table and treat the characters as int numbers.

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni germen e pare");
        char letter1 = input.next().charAt(0);
        System.out.println("Ju lutem vendosni germen e dyte");
        char letter2 = input.next().charAt(0);


        //  char letter1 = 'a';
        // char letter2 = 'e';
        int shkronja = (int) letter1;
        int shkronja2 = (int) letter2;
        int shuma = Math.abs(shkronja2 - shkronja);
        System.out.println("numri i karaktereve  midis  dy germave eshte: " + shuma);

    }
}
