package com.CollectionsExercises.ArrayListTasks;
// Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<Integer> years = new ArrayList<>();

        years.add(2009);
        years.add(2010);
        years.add(2011);
        years.add(2012);

        retrieveYears(years);

    }
    public static void retrieveYears(List<Integer> years){
        years.get(2);
        System.out.println("We are retrieving this year: " + years.get(2));

    }

}

