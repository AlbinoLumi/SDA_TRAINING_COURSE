package com.CollectionsExercises.ArrayListTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Write a Java program of swap two elements in an array list.

public class Task10 {

    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);

        System.out.println("Original array "+grades);


        swapElements(grades);
    }

    public static void swapElements(List<Integer>grades){

    Collections.swap(grades,4,2);
        System.out.println("After swaping"+grades);


    }
}
