package com.FirstandSecondDay;

import java.util.Scanner;

public class HomeExercise7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ne kete program do te testojm ndryshimin e temperaturave dhe cilesimin nese nje person eshte me covid ose jo");
        System.out.println(" Ju lutem vendosni temperaturen e personit");

        float temperatura = input.nextFloat();

        if (temperatura <= 36.9f && temperatura >= 34.0f) {
            System.out.println("Personi nuk eshte me Covid");
        } else if (temperatura > 36.9f && temperatura <= 40.3f) {
            System.out.println("Personi eshte me covid");
        } else if (temperatura <= 34.0f || temperatura >= 40.3f) {
            System.out.println("Ju lutem kontrolloni termometrin se mund te jet i prishur");
        }
        else {
            System.out.println("SHIKONI TE GJITHA HAPAT");
        }
    }
}
