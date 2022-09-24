package com.FirstandSecondDay;

public class StatementExample2 {


        public static void main(String[] args){
            System.out.println("Ne kete program ne do te kalkulojme me ane te vlerave te temperatures" +
                    "nese personi eshte me covid apo jo");

            double temperatura =36.9d;
            double temperaturaPersonit2 = 37.9d;
            double temperaturaPersonit3 = 40.5d;

            if (temperatura > 37.0d){
                System.out.println("Personi i pare eshte me covid");
            } else{
                System.out.println("Personi i pare mund te levizi i qete");
            }

            if(temperaturaPersonit2 > 37.0d){
                System.out.println("Personi i dyte eshte me covid");
            } else{
                System.out.println("Personi i dyte mund te iki ne velipoje");
            }

            if(temperaturaPersonit3 >37.0d){
                System.out.println("Personi i 3 eshte me covid");
            } else{
                System.out.println("Shko ne velipoje");
            }

            System.out.println("Tani eshte fundi i programit tone");

        }
    }