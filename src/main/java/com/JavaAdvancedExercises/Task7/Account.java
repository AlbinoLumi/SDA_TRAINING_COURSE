package com.JavaAdvancedExercises.Task7;

public class Account {

    int balance;
    static int amount = 5000;

    public Account(){}

    public Account(int balance, int amount) {

        this.balance = balance;
        this.amount  = amount;
    }

    public void initiate()
    {
        Login l1 = new Login();
        try{
            l1.acceptInput();
            l1.verify();

        }catch(Exception e)
        {
            try{
                l1.acceptInput();
                l1.verify();

            }catch(Exception f)
            {

            }
        }
    }

    public int getBalance(){
        return amount;
    }
    public void add(int amt){
        amount = amount + amt;
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +amount);
        System.out.println(" ");
    }
    public static void withdraw(int amt){
        System.out.println(" ");
        if(amount < amt ){
            invalid_transaction invalidWithDraw = new invalid_transaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt + " Euros");
            System.out.println(" ");
            System.out.println("Available Balance: " +amount);
            System.out.println(" ");
        }


    }

