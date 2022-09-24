package com.sda.loops;

import java.util.Locale;
import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem jepni nje te dhene");

        String emri = input.nextLine();
        String mbiemri = input.nextLine();
        String emriMbiemri = emri.concat(" ").concat(mbiemri);
        String teDhenat = emri.concat( " ").concat(mbiemri);
        System.out.println(teDhenat.toLowerCase(Locale.ROOT));
        System.out.println(teDhenat.toUpperCase(Locale.ROOT));
        System.out.println(teDhenat.length());
        System.out.println(emri.equals(mbiemri));
        System.out.println(emri.equalsIgnoreCase(mbiemri));
        System.out.println(teDhenat.replaceAll("A", "B"));
        System.out.println(teDhenat.replaceAll("C","R"));

    }
}
