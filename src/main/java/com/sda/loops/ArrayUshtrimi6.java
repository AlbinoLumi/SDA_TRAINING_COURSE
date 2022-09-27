package com.sda.loops;

//Write a Java program to find the duplicate values of an array of string values.

public class ArrayUshtrimi6 {

    public static void main(String[] args) {

        String [] names = {"Albino", "Lumi", "SDA", "Albino", "shkoder", "course", "SDA"};

        value(names);


    }
    static void value(String[] names){
        for (int i =0; i <names.length; i++){
            for (int j = i+1; j<names.length; j++)
                if (names[i] == names[j])
                    System.out.println("The duplicate is : " +names[j]);
        }
    }
}
