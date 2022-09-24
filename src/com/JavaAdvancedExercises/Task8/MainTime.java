package com.JavaAdvancedExercises.Task8;

import java.util.Scanner;

public class MainTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hours");
        int hours = input.nextInt();
        System.out.println("Enter the minutes");
        int min = input.nextInt();
        System.out.println("Enter the seconds");
        int seconds = input.nextInt();

      Time time = new Time(hours, min, seconds);
        System.out.println(time.timeToString());







    }
}
