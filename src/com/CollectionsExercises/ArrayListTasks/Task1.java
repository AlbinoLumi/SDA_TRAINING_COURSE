package com.CollectionsExercises.ArrayListTasks;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to replace the second element of a ArrayList with the specified element.

//Write a Java program to print all the elements of a ArrayList using the position of the elements.

public class Task1 {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Albino");
        names.add("Briselda");
        names.add("Marta");
        names.add("Asra");
        names.add("Marco");

        replaceSecondElement(names);

        printAllPositions(names);
    }

    public static void replaceSecondElement(List<String> names){

        names.set(2, "Elvira");
        System.out.println(names);
    }

    public static void printAllPositions(List<String> names){

        for(int i = 0; i < names.size(); i ++){
            System.out.println(names.get(i));
        }
    }



}
