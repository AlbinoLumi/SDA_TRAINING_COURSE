package com.sda.loops;
//Write a Java program to find the common elements between two arrays (string values).
public class ArrayUshtrimi7 {

    public static void main(String[] args) {
        String [] emrat = {"Albino", "lumi", "SDA", "Albania"};
        String [] teDhenat = {"Shkoder", "SDA", "IT","Albania"};

        common(emrat, teDhenat);


    }
    static void common(String[]emrat, String[]teDhenat){
        for (int i = 0; i<emrat.length;i++)
            for (int j = 0; j<teDhenat.length; j++)
                if(emrat[i] == teDhenat[j])
                    System.out.println("Common elements are : " + teDhenat[j]);
    }

}
