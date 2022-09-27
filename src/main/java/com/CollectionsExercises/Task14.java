package com.CollectionsExercises;

//Write a Java program to insert some elements at the specified position into a linked list.

import java.util.LinkedList;

public class Task14 {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        LinkedList<Integer> numbers_2 = new LinkedList<>();
        numbers_2.add(5);
        numbers_2.add(6);


        insertSomeElements(numbers, numbers_2);
    }
    public static void insertSomeElements(LinkedList<Integer>numbers, LinkedList<Integer> numbers_2){
        numbers.addAll(1,numbers_2);
        System.out.println(numbers);
    }

}
