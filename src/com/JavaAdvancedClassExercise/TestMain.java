package com.JavaAdvancedClassExercise;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        //* // Test constructor and toString()

        Llogaria a1 = new Llogaria("A101", "Tan Ah Teck", 88);
        Llogaria a2 = new Llogaria("A102", "Kumar"); // default balance
        Llogaria a3 = new Llogaria("23", "Kot", 123);
        Llogaria a4 = new Llogaria("123", "kot1", 222);
        Llogaria a5 = new Llogaria("111", "kot3", 333);

        List<Llogaria> account = new ArrayList<Llogaria>();
        account.add(a1);
        account.add(a2);
        account.add(a3);
        account.add(a4);
        account.add(a5);




        // Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getEmri());
        System.out.println("Balance: " + a1.getBalanca());
        // Test credit() and debit()
        a1.credit(100);

        a1.debit(50);

        // a1.debit(500);  // debit() error

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);

        findTheHighestBalance(account);
        findAtLeast500LekeInBalance(account);
        findTheLowestBalance(account);
        sortArray(account);
        printArray(account);

        nesetedFor();
    }

    public static void findTheHighestBalance(List<Llogaria> account ){
        int max = account.get(0).getBalanca();
        for(int i = 1; i < account.size();i++){
            if(max < account.get(i).getBalanca()){
                max = account.get(i).getBalanca();
            }
        }

        System.out.println(max);
    }

    public static void findTheLowestBalance(List<Llogaria> account){
        int min = account.get(0).getBalanca();
        for(int i = 1; i < account.size();i++){
            if(min >account.get(i).getBalanca()){
                min = account.get(i).getBalanca();
            }
        }

        System.out.println(min);
    }

    public static void findAtLeast500LekeInBalance(List<Llogaria> account){
        for(int i = 0; i < account.size();i++){
            if( account.get(i).getBalanca() > 500){
                System.out.println("Acounti me id " + account.get(i).getID() + " ka balancen me te madhe se 500");
            }
        }
    }

    public static void printArray(List<Llogaria> account){
        for(int i = 0; i < account.size();i++){
            System.out.println(account.get(i));
        }
    }

    public static void sortArray(List<Llogaria> account){
        for(int i = 0; i < account.size();i++){
            for (int j = i +1 ; j<account.size(); j++){
                if(account.get(i).getBalanca() > account.get(j).getBalanca()){
                    int temp = account.get(i).getBalanca();
                   account.get(i).setBalanca(account.get(j).getBalanca());
                   account.get(j).setBalanca(temp);
                }
            }
        }
    }


    public static void nesetedFor(){
        for(int i = 0; i < 7;i++){
            System.out.println(i);
            for (int j = i +1 ; j<7; j++){
                System.out.print( " " + j);
            }
            System.out.println();
        }
    }

    public static void nameStartWithA(List<Llogaria> account){
       for(int i = 0; i < account.size(); i++){
           if (account.get(i).getEmri().startsWith("A")){
               System.out.println("Emri që fillon me A është në llogarinë me ID: " + account.get(i).getID() + " me emer: " + account.get(i).getEmri());

           }
       }
    }

}




