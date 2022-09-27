package com.NewExercises;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        NumberHolder numberHolder1 = new NumberHolder();
        numberHolder.anInt = 2;
        numberHolder.aFloat = 3.3f;
        numberHolder1.anInt = 4;
        numberHolder1.aFloat = 4.4f;
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);
        System.out.println(numberHolder1.anInt);
        System.out.println(numberHolder1.aFloat);
    }
}
