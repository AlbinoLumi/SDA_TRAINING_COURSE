package com.FirstandSecondDay;

public class CastingExample {

    public static void main(String[] args) {
        byte vleraByte = 21;
        short vleraShort = vleraByte;

        int vlera = vleraShort;
        float vleraFloat = vlera;
        float vleraFloat1 = vleraByte;
        System.out.println(vleraFloat);
        char character = 'a';
        int numberOfCharacter= (int) character;
        System.out.println(numberOfCharacter);
        long vleraLong = vleraByte;
        int vlera2 = (int) vleraFloat;
        char vlera4 = (char) numberOfCharacter;
        System.out.println(vlera2);
        System.out.println(vlera4);

        long vlera6 = 1l;
        short vlera7 = (short) vlera6;
        System.out.println(vlera7);
    }

}

