package com.CollectionsExercises.ArrayListTasks;

//Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.List;

public class Task11 {

    public static void main(String[] args) {

        List<String> clothes = new ArrayList<String>();

        clothes.add("Zara");
        clothes.add("Luis Vuiton");
        clothes.add("Balenciaga");
        clothes.add("H&M");

        List<String> clothes2 = new ArrayList<>();
        clothes2.add("Springfield");
        clothes2.add("Zaful");
        clothes2.add("Bershka");

        joinTwoArrays(clothes, clothes2);



    }
    public static void joinTwoArrays(List<String> clothes, List<String> clothes2){
        clothes.addAll(clothes2);
        System.out.println("Joint Array list" + clothes);
    }
}
