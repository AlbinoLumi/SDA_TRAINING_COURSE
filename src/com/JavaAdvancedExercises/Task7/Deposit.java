package com.JavaAdvancedExercises.Task7;

import java.util.Scanner;

public class Deposit {
    int amt = 0;

    public int userInput() {
        System.out.print("Enter the amount to be deposited: ");
        Scanner input = new Scanner(System.in);
        amt = input.nextInt();
        if (amt <= 0) {
            invalid_transaction depositnegativeError = new invalid_transaction("Invalid Deposit Amount");

            System.out.println(depositnegativeError.getMessage());
            userInput();


        } else {
            return amt;
        }
        return amt;
    }


}
