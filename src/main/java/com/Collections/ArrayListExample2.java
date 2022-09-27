package com.Collections;

import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);

        System.out.println("Original numbers = " + number);
        replace(number);


    }

    public static void replace(ArrayList<Integer> number){
        number.set(1, 3);
        int num = number.size();
        System.out.println("Replace second element with '3'.");
        for(int i=0;i<num;i++)
            System.out.println(number.get(i));
    }
}
