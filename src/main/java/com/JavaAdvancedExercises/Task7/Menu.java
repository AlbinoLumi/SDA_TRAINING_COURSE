package com.JavaAdvancedExercises.Task7;

import java.util.Scanner;

public class Menu {
    int selectedOption;
    Account account = new Account();
    public void showMenu()
    {
        System.out.println("Please Select an option below:");
        System.out.println("Press 1 to Deposit Amount.");
        System.out.println("Press 2 to Withdraw Amount.");
        System.out.println("Press 3 to View Balance");
        System.out.println("Press any key to Exit");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("Press any key: ");
        selectedOption = input.nextInt();
        switch (selectedOption) {
            case 1:
                Deposit d = new Deposit();
                int depamt =  d.userInput();
                account.add(depamt);
                showMenu();
                break;
            case 2:
                System.out.print("Please Enter the amount to withdraw: ");
                int withamt=input.nextInt();
               account.withdraw(withamt);
                showMenu();
                break;
            case 3:
                System.out.println("Your Account Balance is "+account.getBalance()+" Euros");
                System.out.println(" ");
                showMenu();
                break;

            default:
                System.out.println("Transaction Ended, Your ABC Bank Account Logout Successfully !");
                System.exit(0);
                break;
        }

    }
}

