package com.sda.loops;

import com.sda.Person;

import java.util.Date;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Albino", "Lumi", 29, (float) 1.80, 'M', "Juridik","IT",1,"Beqar",true,new Date(1993,03,02),true, true);
        Person person1 = new Person("Eltioni", "Kupritja", 30, (float) 1.79, 'M', "Juridik","IT",1500,"Martuar",true,new Date(1990,03,02),false, true);

        Person[] personat = new Person[]{person, person1};

        Familja familja = new Familja(personat);

        System.out.println("Emri personit qe eshte me i madhi: "+ familja.longestName());
        System.out.println("Gjatesia mesatare eshte"+familja.gjatesiaMesatare());
        System.out.println(familja.rrogaMeElarte());




    }
}
