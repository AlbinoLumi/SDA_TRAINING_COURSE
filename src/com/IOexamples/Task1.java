package com.IOexamples;

import java.io.*;
import java.util.Scanner;
//Ndertoni nje program qe ruajni ne file te dhenat qe merrni nga scanneri

public class Task1 {

    public static void main(String[] args) throws IOException {

       Scanner input = new Scanner(System.in);
       FileOutputStream outputStream = new FileOutputStream("Shkodra.txt");
        System.out.println("Shkruani nje fjale");
        outputStream.write(input.nextInt());
        }
    }



