package com.CollectionsExercises.ArrayListTasks;

//Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("Albino");
        name.add("Rais");
        name.add("Eltion");
        name.add("Elvira");

        insertElement(name);



    }

    public static void insertElement(List<String> name){
        name.add(0,"Randon");
        System.out.println(name);
    }
}
