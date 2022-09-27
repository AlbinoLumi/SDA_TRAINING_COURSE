package com.JavaAdvancedExercises.Task7;

import java.util.Scanner;

public class Login {
    int ac_number = 1908;

    int ac;
    public void acceptInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter My Bank Account PIN: ");
        ac = input.nextInt();

    }
    public void verify() throws Exception{

        if(ac == ac_number)
        {
            System.out.println("Your  Bank Account Login Successfully !");
            Account account = new Account();
            System.out.println(" ");
            System.out.println("Your Account Balance is: "+account.getBalance()+" Euros");
            System.out.println(" ");
            Menu m1 = new Menu();
            m1.showMenu();
        }else{
            invalid_transaction loginfailed = new invalid_transaction("Incorrect Login Credentials !");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }
}

