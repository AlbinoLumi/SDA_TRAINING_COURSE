package com.homeExercise2;

//Write a Java program to reverse a string.
//	Input Data:
//	Input a string: The quick brown fox
//	Expected Output
//	Reverse string: xof nworb kciuq ehT

public class ExerciseTwo {

    public static void main(String[] args) {

        String n = reverse("The quick brown fox");
        System.out.println(n);


    }

    public static  String reverse (String a) {

        char[] letters = new char[a.length()];
        int letterIndex = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            letters[letterIndex] = a.charAt(i);
            letterIndex++;

        }
        String reverse = " ";
        for (int i = 0; i<a.length(); i++){
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}






