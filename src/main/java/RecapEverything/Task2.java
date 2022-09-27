package RecapEverything;
//Populloni arrayin me emrat e studentatve dhe me printoni Studentin qe ka emrin me te gjate

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni sa emra do te fusesh");
        int gjatesiaArray = input.nextInt();
        String[] emra = new String[gjatesiaArray];


        for(int i=0; i< emra.length;i++){
            System.out.println("Vendosni emrat e studentave me rradhe " + (i+1));
            emra[i] = input.next();


        }
        emriMeIGjate(emra);
    }
    public static void emriMeIGjate(String[]emra){
        int max = emra[0].length();
        String names = emra[0];
        for(int i=1; i < emra.length;i++){
            if(emra[i].length() > max){
                max = emra[i].length();
                names = emra[i];


            }
        }
        System.out.println("Emri me i gjate eshte: " + names);
    }
}
