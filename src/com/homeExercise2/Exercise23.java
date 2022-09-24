package com.homeExercise2;
//Write a Java method to count all words in a string.
//	Test Data:
//	Input the string: The quick brown fox jumps over the lazy dog.
//	Expected Output: Number of words in the string: 9

import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        System.out.println("Enter the words of the string :");
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();

        int count = 1;

        for (int i = 0; i < words.length() - 1; i++) {
            if (words.charAt(i) == ' ' && (words.charAt(i+1) != ' ')) {

                count++;

            }

        }
        System.out.println("Number of words in this string are : " + count);
    }

}


