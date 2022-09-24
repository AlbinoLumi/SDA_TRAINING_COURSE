package com.sda.loops;
//Ushtrimi :
//        Do merrni 2 Strings nga perdoruesi dhe do :
//        i bashkoni te dy string ne nje te vetem
//        do i ktheni te 2 string ne UPPER dhe LOWER CASE
//        do te printoni gjatesine e te 2 variablave string
//        do krahasoni te 2 string me njeri tjetrin
//        do krahasoni te 2 string duke e injoruar case
//        te stringu pare do te beni replace A me B
//        te string 2 do te beni replace C me R

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HomeExercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a letter or a group of letters: ");
        String test = input.next();
        System.out.println(" pLEASE enter a letter or a group of letters: ");
        String test2 = input.next();

        String tedhena = test.concat(test2);
        System.out.println("Total data for te dhena is : " + tedhena);
        System.out.println(" Upper case is : "+  test.toUpperCase());
        System.out.println(" Lower case is : " + test.toLowerCase());
        System.out.println(" Upper case is : "+  test2.toUpperCase());
        System.out.println(" Lower case is : " + test2.toLowerCase());
        System.out.println(" Gjatesia e test eshte : " + test.length());
        System.out.println(" gjatesia e test 2 eshte : " + test2.length());
        System.out.println(" Krahasimi i stringeve eshte: " + test.equals(test2));
        System.out.println(" Krahasimi me ignore case eshte: " + test.equalsIgnoreCase(test2));
        System.out.println(" Replacement A with B : " + test.replaceAll("A", "B"));
        System.out.println(" Replacement C with R is : " + test2.replaceAll("C", "R"));


    }
}
