package com.CollectionsExercises.ArrayListTasks;
//Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {

        List<String> fruit1 = new ArrayList<>();

        fruit1.add("Apple");
        fruit1.add("Orange");
        fruit1.add("Lemon");
        fruit1.add("Mango");

        List<String> fruit2 = new ArrayList<>();
        fruit2.add("Apple");
        fruit2.add("Orange");
        fruit2.add("Lemon");
        fruit2.add("Mango");

        compareList(fruit1, fruit2);



    }
    public static void compareList(List<String> fruit1, List<String> fruit2){
        if(fruit1.equals(fruit2)){
            System.out.println("Lists are the same");
        }else
            System.out.println("Lists are not the same");
    }
}
