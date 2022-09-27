package com.JavaAdvancedCodingTasks;

//Create a method that takes the map as a parameter,
// where the key is string and the value number, and then
//prints each map element to the console in the format: Key: <k>, Value: <v>.
// There should be a comma at the
//end of every line except the last, and a period at the last.

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Albino", 29);
        hashMap.put("Eriselda", 20);

        afishoMap(hashMap);
    }

    public static void afishoMap(HashMap<String, Integer> hashMap) {
        int i = 0;
        for (Map.Entry<String, Integer> x : hashMap.entrySet()) {
            String k = x.getKey();
            Integer v = x.getValue();
            System.out.print("\n" + "key: " + k + ", value: " + v);

            if (i == hashMap.entrySet().size() - 1) {
                System.out.println(",");
            } else
                System.out.println(".");
        }
    }



}

