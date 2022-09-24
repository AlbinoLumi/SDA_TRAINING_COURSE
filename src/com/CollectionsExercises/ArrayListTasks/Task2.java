package com.CollectionsExercises.ArrayListTasks;
//Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>();

        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Blue");

        for(String colours : color){

        }
        System.out.println(color);

    }

}