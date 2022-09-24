package com.CollectionsExercises.ArrayListTasks;
//Write a Java program to copy one array list into another.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

        List<String> clothes = new ArrayList<String>();

        clothes.add("Zara");
        clothes.add("Luis Vuiton");
        clothes.add("Balenciaga");
        clothes.add("H&M");

        System.out.println("First List"+clothes);


        ArrayList<String> clothes2 =new ArrayList<>();
        clothes2.addAll(clothes);
        System.out.println("Copied List" + clothes2);

        }


    }

