package com.ClassExercise;
//Write an application that will take a positive number from the user (type int) and draw a
//wave with a given length and height of 4 lines, according to the following example (fill
//empty spaces with spaces):

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Fut numrin e rreshtave");
            int rreshta = scan.nextInt();
            System.out.println("Fut numrin e V-ve");
            int kulme = scan.nextInt();

            for (int i = 0; i < rreshta; i++) {
                for (int n = 1; n <= kulme; n++) {
                    for (int j = 0; j < rreshta - 1; j++) {
                        if (j == i) {
                            System.out.print(" *");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    for (int k = rreshta - 1; k > 0; k--) {
                        if (k == i) {
                            System.out.print(" *");
                        } else {
                            System.out.print("  ");
                        }
                    }

                }

                System.out.println();
            }

        }
    }

