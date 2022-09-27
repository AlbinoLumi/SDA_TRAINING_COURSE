package com.HomeExercise3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Albino", "Lumi",29,1.80f,'M',"Juridik","IT", 12f,"Beqar", true, new Date(1993-02-03),true,true );
        Person person2 = new Person("Etjon", "Lumi",36,1.78f,'M',"Historia","Admin", 132f,"I martuar", true, new Date(1986-05-13),true,true );
        Person person3 = new Person("Marketin", "Lumi",26,1.74f,'M',"Historia","Admin", 26f,"I martuar", true, new Date(1986-06-13),true,true );


       Person[] personat = new Person[]{person1, person2, person3};

       Familja familja = new Familja(personat);
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni datëlindjen tuaj në formatin yyyy-mm-dd");
        String datelindjaString = input.next();
        LocalDate datelindja = LocalDate.parse(datelindjaString);





        System.out.println(familja.gjatesiaMaEmadheSe5());
        System.out.println(familja.emriMeIvogel());
        System.out.println(familja.longestName());
        System.out.println(familja.moshaMesatare());
        System.out.println(familja.meIshkruti());
        System.out.println(familja.meIgjati());
        System.out.println(familja.gjatesiaMesatare());
        System.out.println(familja.manAndWomen());
        System.out.println(familja.rrogaMeEvogel());
        System.out.println(familja.rrogaMeEmadhe());
        System.out.println(familja.rrogaMesatare());
        System.out.println(familja.llogaritDitetEKaluara(datelindja));



    }



}
