package com.CollectionsExercises.ArrayListTasks;

//Write a Java program to shuffle elements in a array list.
//Write a Java program to reverse elements in a array list.
//Write a Java program to extract a portion of a array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);


        extractPortion(numbers);
        reverseCollection(numbers);
        System.out.println("After reversing " + numbers);

        shuffleUsingCollection(numbers);
        System.out.println("After shuffling" + numbers);




    }
    public static void shuffleUsingCollection(List<Integer> numbers){
        Collections.shuffle(numbers);
    }
    public static void reverseCollection(List<Integer> numbers){
        Collections.reverse(numbers);
    }

    public static void extractPortion(List<Integer> numbers){

        List<Integer> sub_numbers = numbers.subList(0,3);

        System.out.println("Extracting three numbers from the List " + sub_numbers);
    }
}
