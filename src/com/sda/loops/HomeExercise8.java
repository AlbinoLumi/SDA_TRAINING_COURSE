package com.sda.loops;

import java.util.Scanner;

public class HomeExercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vlera[] = new int[1];
        pyetja1(vlera, input);
        pyetja2(vlera, input);
        pyetja3(vlera, input);
        pyetja4(vlera, input);






    }

    static void pyetja1(int[] vlera, Scanner input) {
        System.out.print("Pyetja e pare : Ne cilin vit Inter fitoj champions leaguen e fundit: 1)2010  2)2020  3)2005  4)2007");
        for (int i = 0; i < vlera.length; i++) {
            int vlera1 = input.nextInt();
            if (vlera1 == 1) {
                System.out.println("Pergjigja juaj eshte e sakte");

            } else
                System.out.println("Pergjigja juaj eshte e gabuar");


        }
    }

    static void pyetja2(int[] vlera, Scanner input) {
        System.out.println("Pyetja e dyte eshte: Sa here e ka fituar AC MILAN CHAMPIONS LEAGUEN: 1) 2 HERE 2) 5 HERE  3)7 HERE 4 )10 HERE : ");
        for (int i = 0; i < vlera.length; i++) {
            int vlera2 = input.nextInt();
            if (vlera2 == 3) {
                System.out.println("Pergjigja juaj eshte e sakte");
            } else
                System.out.println("Pergjigja juaj eshte e gabuar");

        }
    }


    static void pyetja3(int[] vlera, Scanner input) {
        System.out.println("Pyetja e trete eshte: Ne cilin vit Gjermania fitoj boterorin e fundit: " +
                "1) 2020 2) 2018 3) 2014 4) 2010");
        for (int i = 0; i < vlera.length; i++) {
            int vlera3 = input.nextInt();
            if (vlera3 == 3) {
                System.out.println("Pergjigja juaj eshte e sakte");
            } else
                System.out.println("Pergjigja juaj eshte e gabuar");
        }
    }

    static void pyetja4(int[] vlera, Scanner input) {
        System.out.println("Pyetja e katert eshte: Cili ekip futbolli e fitoj e fundit Champions Leaguen: " +
                "1) Real Madrit  2) Chelsea FC  3) PSG  4) MAN CITY");
        for (int i = 0; i < vlera.length; i++) {
            int vlera4 = input.nextInt();
            if (vlera4 == 1) {
                System.out.println("Pergjigja juaj eshte e sakte");
            } else
                System.out.println("Pergjigja juaj eshte e gabuar");

        }
    }
}












