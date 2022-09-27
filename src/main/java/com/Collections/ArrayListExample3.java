package com.Collections;

import java.util.ArrayList;

public class ArrayListExample3 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original position" + numbers);

        printAllElementsUsingIndex(numbers);

    }
    public static void printAllElementsUsingIndex(ArrayList<Integer> numbers){

        int no_of_elements = numbers.size();
        for (int i = 0; i < no_of_elements; i++)
            System.out.println(numbers.get(i));
    }
}
