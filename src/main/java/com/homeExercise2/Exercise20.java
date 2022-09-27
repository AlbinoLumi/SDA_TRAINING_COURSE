package com.homeExercise2;
//Write a Java program to check if a given string has all unique characters.

import java.util.HashSet;
import java.util.Set;

public class Exercise20 {

    public static void main(String[] args) {
        String words = "wefoqboiisndf";
        String words2 = "sudfqnibe";
        System.out.println(hasUniqueChar(words));
        System.out.println(hasUniqueChar(words2));


    }
    public static boolean hasUniqueChar(String toTest){
        Set<Character> set = new HashSet<>();
        for (char c : toTest.toCharArray()){
           if  (set.contains(c)){
               return false;
           }
           set.add(c);
        }
        return true;
    }
}
