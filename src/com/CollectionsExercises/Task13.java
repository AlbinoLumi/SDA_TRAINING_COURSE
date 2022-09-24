package com.CollectionsExercises;

//Write a Java program to append the specified element to the end of a linked list.
// Write a Java program to iterate through all elements in a linked list.
//Write a Java program to iterate through all elements in a linked list starting at the specified position.
//Write a Java program to iterate a linked list in reverse order.
// Write a Java program to insert the specified element at the specified position in the linked list.
//Write a Java program to insert elements into the linked list at the first and last position.
//Write a Java program to insert the specified element at the front of a linked list.
//Write a Java program to insert the specified element at the end of a linked list.

import java.util.Iterator;
import java.util.LinkedList;

public class Task13 {

    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("white");
        colors.add("black");
        colors.add("yellow");
        colors.add("green");


        lastOfList(colors);
        frontOfList(colors);
        firstAndLastPosition(colors);
        specifiedElement(colors);
        reverseOrder(colors);
        printUsingIterator(colors);

        for (String color : colors) {

        }

        System.out.print("Iterating through all elements : " + colors);
    }

    public static void printUsingIterator(LinkedList<String> colors) {
        Iterator a = colors.listIterator(1);


        System.out.println("Printing using iterator :");
        while (a.hasNext()) {
            System.out.println(a.next());
        }

    }

    public static void reverseOrder(LinkedList<String> colors) {

        Iterator a = colors.descendingIterator();


        System.out.println("Printing in reverse order ");
        while (a.hasNext()) {
            System.out.println(a.next());
        }

    }

    public static void specifiedElement(LinkedList<String> colors) {
        colors.add(1, "skycolor");
    }

    public static void firstAndLastPosition(LinkedList<String> colors){
        colors.addFirst("Blue");
        colors.addLast("nocolor");
    }

    public static void frontOfList(LinkedList<String> colors){
        colors.offerFirst("white");
    }
    public static void lastOfList(LinkedList<String> colors){
        colors.offerLast("red");
    }
}
