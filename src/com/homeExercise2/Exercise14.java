package com.homeExercise2;

//Write a Java program to take the last three characters
// from a given string and add the three characters at both the front and back of the string.
// String length must be greater than three and more.

public class Exercise14 {

    public static void main(String[] args) {
        String words = "Hazard";
        int slength = 3;
        if (slength > words.length()){
            slength=words.length();
        }
        String subpart = words.substring(words.length()-3);
        System.out.println(subpart + words + subpart);
        }
}
