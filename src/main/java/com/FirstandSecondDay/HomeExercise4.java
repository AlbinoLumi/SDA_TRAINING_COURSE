package com.FirstandSecondDay;

public class HomeExercise4 {

    public static void main(String[] args) {
        System.out.println("Ne kete program do te testojme nese personi eshte me Covid ose jo");

        double tempPersoni1 = 36.6d;
        double tempPersoni2 = 38.1d;
        double tempPersoni3 = 37.0d;

        if (tempPersoni1 >=37.0d){
            System.out.println("Personi i pare eshte me Covid");
        }else {
            System.out.println("Personi i pare nuk eshte me Covid");
        }
        if (tempPersoni2 >= 37.0d) {
            System.out.println("Personi i dyte eshte me covid");
        }else {
            System.out.println("personi i dyte nuk eshte me covid");
        }
        if (tempPersoni3 >= 37.0d){
            System.out.println("Personi i trete eshte me covid");
        }else {
            System.out.println("Personi i trete nuk eshte me covid");
        }
        if (tempPersoni1 >=37.0d && tempPersoni2 >=37.0d){
            System.out.println("Personi eshte me covid");
        }else {
            System.out.println("Personi mund te leviz i qete");
        }
        System.out.println("ky eshte fundi i programit tone");
    }
}
