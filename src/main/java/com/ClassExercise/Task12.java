package com.ClassExercise;

//Write an application that reads a text from the user (type String) and counts a percentage
//of occurrences of a space character

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int count=0;
        int spaceCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String for count characters \n ");
        String perdoruesi = input.nextLine();

        for (char c : perdoruesi.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Numri i Hapësirave " + spaceCount);
        float perqindja = ((float)spaceCount/perdoruesi.length()) *100;
        System.out.println("Numri Total i Karakteve: "+perdoruesi.length());
        System.out.println("Perqindja e hapesira tek fjala qe ju keni dhene eshte : "+perqindja + " %");
    }
}
