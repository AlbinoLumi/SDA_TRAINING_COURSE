package com.sda.loops;

//Write a Java program to find the duplicate values of an array of integer values

import java.util.Scanner;

public class ArrayUshtrimi5 {

    public static void main(String[] args){

        int number[] = {5,8,10,5,4,7,10,8};



        value(number);
    }

    static void value (int[] number){
        for (int i = 0; i <number.length; i++ ) {
                for (int j = i +1; j<number.length;j++ ){
                    if(number[i] == number[j])
                        System.out.println("The duplicate is: " +number[j]);
                }

            }

        }
    }


