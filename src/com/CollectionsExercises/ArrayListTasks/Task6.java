package com.CollectionsExercises.ArrayListTasks;

// Write a Java program to update specific array element by given element.
//Write a Java program to remove the third element from a array list.
//Write a Java program to search an element in a array list.
//Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {

    public static void main(String[] args) {

        List<String> car = new ArrayList<>();

        car.add("Mercedez");
        car.add("Toyota");
        car.add("Alfa");


        sortCar(car);
        updateCar(car);
        removeCar(car);
        searchCar(car);


    }

    public static void updateCar(List<String> car) {

        car.set(0, "BMW");
        System.out.println(car);
    }

    public static void removeCar(List<String> car) {
        car.remove(2);
        System.out.println(car);
    }

    public static void searchCar(List<String> car) {
        if (car.contains("BMW")) {
            System.out.println("Car is found");
        } else
            System.out.println("Car is not found");
    }

    public static void sortCar(List<String> car) {
        for (int i = 0; i < car.size(); i++) {
            for (int j = car.size() - 1; j > i; j--) {
                if (car.get(i).length() > car.get(j).length()) {

                    String tmp = car.get(i);
                    car.set(i, car.get(j));
                    car.set(j, tmp);

                }


            }
            for (String cars : car) {


            }


        }
        System.out.println(car);
    }
}

