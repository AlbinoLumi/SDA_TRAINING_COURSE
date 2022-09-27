package com.CollectionsExercises.ArrayListTasks;

//Write a Java program to iterate through all elements in a array list

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        iterating(number);
    }
    public static void iterating(List<Integer> number){
        for(int i =0; i < number.size(); i++){
            System.out.println(number.get(i));
        }
    }
}
