package com.sda.loops;

public class HomeExercise3 {

    public static void main(String[] args) {

        for (int counter = 0; counter < 100; counter ++) {
            if (counter == 3 || counter == 5 ) {
                continue;
            } else if (counter == 25){
                break;
            } else if (counter % 2 == 0){
                System.out.println(" Numri "+ counter + " eshte cift ");
            }else
                System.out.println(" Numri " + counter + " eshte tek ");


        }
    }
}
