package com.IOexamples;

//Merrni 8 emra nga perdoruesi ruajini ne nje array dhe do gjeni
//emrin qe ka gjatesine me te madhe
//emrin qe ka gjatesine me te vogel
// 3. mesataren e gjatesive te emrave
//dhe keto te dhena do i ruani ne nje file

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Jepni Gjatësinë e Array");
            int gjatesiaArray = input.nextInt();
            String[] arrayEmra = new String[gjatesiaArray];

            popullimiArray(input, arrayEmra);

            String longestName = emriMadh(arrayEmra);
            String shortestName = emriVogel(arrayEmra);
            Double mesatarja = mestarjaString(arrayEmra);
            System.out.println(longestName);
            System.out.println(shortestName);
            System.out.println(mesatarja);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("eltionFile.txt"));
            bufferedWriter.write("Emri qe ka gjatesine me te madhe eshte : ");
            bufferedWriter.write(longestName);
            bufferedWriter.newLine();
            bufferedWriter.write("Emri qe ka gjatesine me te vogel eshte : ");
            bufferedWriter.write(shortestName);
            bufferedWriter.newLine();
            bufferedWriter.write("Mesatarja e gjatesise se emrit tek array eshte : ");
            bufferedWriter.write(String.valueOf(mesatarja));
            bufferedWriter.newLine();

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Something went wrong in application " + e.getMessage());
        }
    }

    public static void popullimiArray (Scanner input, String[] arrayEmra) {
        for (int i=0; i<arrayEmra.length; i++) {
            System.out.println("Ju lutemi vendosni vlerat e array");
            arrayEmra[i] = input.next();
        }
    }

    public static String emriMadh (String[] arrayEmra) {
        int max = arrayEmra[0].length();
        String longestWord = arrayEmra[0];
        for (int i=1; i<arrayEmra.length; i++) {
            if (arrayEmra[i].length() > max) {
                max = arrayEmra[i].length();
                longestWord = arrayEmra[i];
            }
        } return longestWord;
    }

    public static String emriVogel (String[] arrayEmra) {
        int min = arrayEmra[0].length();
        String shortWord = arrayEmra[0];
        for (int i=1; i<arrayEmra.length; i++) {
            if (arrayEmra[i].length() < min) {
                min = arrayEmra[i].length();
                shortWord = arrayEmra[i];
            }
        }
        return shortWord;
    }

    public static double mestarjaString (String [] arrayEmra) {
        double shuma = 0.0;
        for (int i=0; i< arrayEmra.length; i++) {
            shuma += arrayEmra[i].length();
        }
        return (shuma/ arrayEmra.length);
    }
}