package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> age = new ArrayList<>();
        age.add(2);
        age.add(211);
        age.add(22);
        age.add(3);

        System.out.println(age.get(1));


        for (Integer numer : age) {
            System.out.println(numer);
        }

        for (int i = 0; i < age.size(); i++) {
            System.out.println(age.get(i));
        }
        maxList(age);
        numberIsInArrayList(age);
        gjatesimeEmadhese4();


    }



    public static void maxList(List<Integer> age) {
        int maximum = age.get(0);
        for (int i = 1; i < age.size(); i++) {
            if (maximum < age.get(i))
                maximum = age.get(i);
        }
        System.out.println("Maximum Element in ArrayList = "
                + maximum);


    }

    public static void numberIsInArrayList(List<Integer> age) {
        for (int i = 1; i < age.size(); i++) {
            if (age.contains(22)) {

            }

        }
        System.out.println("the number already exists");
    }
    public static  void gjatesimeEmadhese4(){

        List<String> names = new ArrayList<>();
        names.add("albino");
        names.add("lejrat");
        names.add("iv");



        for(int i = 0; i< names.size(); i ++){

            if (names.get(i).length() >  4 ){
                System.out.println(names.get(i));





            }


        }


    }

}

