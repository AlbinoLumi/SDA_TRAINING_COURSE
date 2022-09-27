package com.ClassExercise;
//Write an application that "stutters", that is, reads the user's text (type String), and prints
//the given text, in which each word is printed twice.
//For example, for the input: "This is my test" the application should print "This This is is
//my my test test".

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String text = input.nextLine();

        String[] repeatedText = text.split(" ");
        for(String n : repeatedText){
            System.out.print(n + " " + n + " ");
        }

    }

}
