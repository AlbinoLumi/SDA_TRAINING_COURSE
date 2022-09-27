package com.sda.loops;

public class ForExample {

    public static void main(String[] args) {
        for (int counter = 0; counter < 10; counter ++) {
            if (counter%2==1){
                System.out.println(counter + "-> tek");
            }else {
                System.out.println((counter + " -> cift"));
            }

        }
    }
}
