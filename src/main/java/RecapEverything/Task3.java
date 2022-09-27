package RecapEverything;
//Shkruani nje program qe gjatesine dhe vlerat e array i merr nga perdoruesi
// ndertoni nje metode qe ben popoullimin e array me input nga useri
// ndertoni nje metode qe ben printimin e array
// nderoni nje metode qe gjen shumen e gjith array.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the Array");
        int gjatesiaArray= input.nextInt();
        String [] names = new String[gjatesiaArray];

        populloArray(names,input);
        printoArray(names);
        shumaArray(names);
    }
        public static void populloArray(String[] names, Scanner input){
        for(int i = 0; i <names.length; i++ ){
            System.out.println("Please enter the name : "+ (i+1));
            names[i] = input.next();

        }

        }
        public static void printoArray(String[] names){
        for(int i =0; i< names.length;i++){
            System.out.println("The names in the array are : " + names[i]);
        }
        }
        public static void shumaArray(String[] names){
        int sum = 0;
        for(int i =0; i < names.length; i++){
            sum += names[i].length();
        }
            System.out.println("The sum calculated is : " + sum);
        }
    }

