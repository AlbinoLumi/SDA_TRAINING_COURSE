package com.CollectionsExercises;
//Write a Java program to get the first and last occurrence of the specified elements in a linked list.
// Write a Java program to display the elements and their positions in a linked list.
//Write a Java program to remove a specified element from a linked list.

import java.util.LinkedList;

public class Task15 {

    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        removePosition(l_list);
        firstAndLastOccurrence(l_list);
        displayPosition(l_list);
       for(String list : l_list){

       }
        System.out.println("Original LinkedList is : "+l_list);
    }

    public static void firstAndLastOccurrence(LinkedList<String> l_list){
     Object first_element =   l_list.getFirst();
        System.out.println("First element is :" +first_element);

        Object last_element = l_list.getLast();
        System.out.println("Last element is :" + last_element);
    }

    public static void displayPosition(LinkedList<String> l_list){
        for(int i = 0; i < l_list.size();i++){
            System.out.println("element at position " + i + " is : " + l_list.get(i));
        }
    }
    public static void removePosition(LinkedList<String> l_list){
        l_list.remove(1);
        l_list.removeFirst();
        l_list.removeLast();
    }
}
