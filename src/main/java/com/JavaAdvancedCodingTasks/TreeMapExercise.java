package com.JavaAdvancedCodingTasks;
//Create a method that accepts TreeMap and prints the first and last EntrySet in the console.

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExercise {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        populateTree(treeMap);
        firstAndLast(treeMap);


    }

    private static void firstAndLast(TreeMap<Integer, String> treeMap){
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
    private static void populateTree(TreeMap<Integer, String> treeMap){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of the map");
        int length = input.nextInt();
        for(int i =0; i < length;i++){
            System.out.println("Put the key of map");
            Integer key = input.nextInt();
            System.out.println("Put the value of map");
            String value = input.next();

            treeMap.put(key, value);

        }

    }
}
