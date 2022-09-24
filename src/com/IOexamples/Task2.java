package com.IOexamples;

//Derisa useri te shkruaje string QUIT! te merrni fjalet dhe ti shkruani tek file me emrin qe ju deshironi
// perdoruesi do shkruaje QUIT!
//dhe nuk fillon me germen e pare te emrin tuaj
import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws Exception {

        try {
                Scanner input = new Scanner(System.in);
                System.out.println("Shkruani nje fjale ju lutem : ");
                String word = input.next();
                BufferedWriter writer = new BufferedWriter(new FileWriter("ushtrimi2Shkoder.txt"));

                while (!word.equalsIgnoreCase("quit!")){
                    if(findTheSizeOFWordAndWithWatStarts(word)){
                        writer.write(word);
                        writer.newLine();
                    }
                    System.out.println("Ju lutem shkruani nje fjale ( QUIZ! per te ndaluar programin)");
                    word = input.next();
                }

                writer.flush();
                writer.close();
            } catch (Exception e) {
                System.out.println("Something went wrong during the application" + e.getCause());
            }

        }

        private static boolean findTheSizeOFWordAndWithWatStarts(String word) {
            if (word.length() > 4 && !word.startsWith("L")){
                return true;
            }
            return false;
        }
    }





