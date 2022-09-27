package com.ClassExercise;
//Write an application that implements a simple calculator. The application should:
//a. read first number (type float)
//b. read one of following symbols: + - / *
//c. read second number (type float)
//d. return a result of given mathematical operation
//If the user provides a symbol other than supported, the application should print "Invalid
//symbol". If the entered action cannot be implemented (i.e. it is inconsistent with the
//principles of mathematics), the application should print "Cannot calculate".

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float number1 = input.nextFloat();
        System.out.println("Enter the symbol  +    -   /    *  ");
        char symb = input.next().charAt(0);
        System.out.println("Enter the second number");
        float number2 = input.nextFloat();


        switch (symb){
            case '+' :
                llogaritMbledhjen(number1,number2);
                break;
            case '-':
                llogaritZbritjen(number1, number2);
                break;
            case '/':
                llogaritPjestimin(number1, number2);
                break;
            case '*':
                llogaritShumezimin(number1, number2);
                break;
            default:
                System.out.println("Invalid symbol");
                break;

        }





    }
   static void  llogaritMbledhjen(float number1, float number2){
        System.out.println(number1+number2);
    }
    static  void llogaritZbritjen(float number1, float number2){
        System.out.println(number1-number2);

    }
    static void llogaritShumezimin(float number1, float number2){
        System.out.println(number1*number2);
    }
    static void llogaritPjestimin(float number1, float number2){
        if (number2 == 0){
            System.out.println("Cannot calculate");
        }
        System.out.println(number1/number2);
    }

   }


