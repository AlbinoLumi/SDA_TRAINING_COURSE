package com.JavaAdvancedExercises.Task9;

public class MainClass {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle() {
            @Override
            public String getName() {
                return "Renault";
            }
        };
       System.out.println(vehicle.getName());

    }

}






