package RecapEverything;
/*Krijoni nje array qe mban notat e klases
notat do futen ne array nga perdoruesi
ju do me printoni noten me te larte ne klase.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vendos sa nota do vendosesh ? ");
        int gjatesiaArrayeNotave = input.nextInt();
        int[] nota = new int[gjatesiaArrayeNotave];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Vendos noten e studentit : " + (i + 1));
            nota[i] = input.nextInt();




        }
        notaMax(nota);
    }

    public static void notaMax(int[] nota){
        int max = nota[0];
        for(int i =1;i < nota.length;i++){
            if(nota[i] > max){
                max = nota[i];

             }

        }
             System.out.println("Nota me e larte eshte " + max);

    }
}
