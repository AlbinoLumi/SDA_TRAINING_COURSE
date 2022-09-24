package com.JavaAdvancedCodingTasks;
//Create a Storage class that will have a private Map field, a public constructor, and methods:
//addToStorage(String key, String value) → adding elements to the storage
//printValues(String key) → displaying all elements under a given key
//findValues(String value) → displaying all keys that have a given value
//The Storage class should allow you to store multiple values under one key.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private static Map<String, List<String>> map = new HashMap<>();


    public Storage(Map map) {
        this.map = map;

    }

    public static void addToStorage(String key, String value) {
        List<String> values = new ArrayList<>();
        if (map.containsKey(key)) {
            values = map.get(key);
            values.add(value);
        } else {
            values.add(value);
        }
        map.put(key, values);

    }
    public static void printValues(String key){
        if(map.containsKey(key)){
            System.out.println(key);
        }else {
            System.out.println("Key " + key + " nuk ekziston ne mapin e programit tone");
        }

    }

}
