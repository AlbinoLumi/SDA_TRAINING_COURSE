package com.CollectionsExercises.ArrayListTasks;

// Write a Java program to clone an array list to another array list.
//Write a Java program to empty an array list.
//Write a Java program to test an array list is empty or not.
//Write a Java program to trim the capacity of an array list the current list size.
// Write a Java program to increase the size of an array list.


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Task12 {

    public static void main(String[] args) {

         ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        trimToSize(c1);

        cloneArray(c1);

        emptyArray(c1);

        isEmptyOrNot(c1);

        increaseCapacity(c1);





    }

    public static void cloneArray(ArrayList<String> c1){
        ArrayList<String> newc1 = (ArrayList<String>) c1.clone();
        System.out.println("Cloned array list is : " + newc1);
    }

    public static void emptyArray(ArrayList<String> c1){
        c1.clear();
        System.out.println("After emptiness" +c1);
    }
    public static void isEmptyOrNot(ArrayList<String> c1){
        if(c1.isEmpty()){
            System.out.println("The list is empty");
        }else
            System.out.println("The list is not empty");
    }
    public static void trimToSize(ArrayList<String> c1){
        c1.trimToSize();
        System.out.println("Size of this list is " +c1.size());
    }

    public static void increaseCapacity(ArrayList<String> c1){
        c1.ensureCapacity(300);

        System.out.println("The capacity of this list is increased to 300");
    }
}
