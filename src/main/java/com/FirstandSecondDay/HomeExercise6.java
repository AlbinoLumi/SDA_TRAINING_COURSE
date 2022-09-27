package com.FirstandSecondDay;

import java.util.Scanner;

public class HomeExercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni noten e studentit");

        int nota = input.nextInt();
        switch (nota){

            case 10:
            case 9:
                System.out.println("Nota juaj eshte A");
                break;
            case 8:
            case 7:
                System.out.println("Nota juaj eshte B");
                break;
            case 6:
            case 5:
                System.out.println("Nota juaj eshte C");
              break;
            case 4:
                System.out.println("Nota juaj eshte D");
                break;
            default:
                System.out.println("Jepni nje note tjeter");

        }
    }
}
