package com.StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainKlasaPerson {

    public static void main(String[] args) {

        List<Klasa_Person> people = getPeople();


//Filter
        List<Klasa_Person> females = people.stream().
                filter(Klasa_Person ->  Klasa_Person.getGeneder().equals(Gjinia.FEMALE))
                .collect(Collectors.toList());
      females.forEach(System.out::println);
        System.out.println();

        List<Klasa_Person> males = people.stream().
                filter(klasa_person -> klasa_person.getGeneder().equals(Gjinia.MALE))
                .collect(Collectors.toList());
        males.forEach(System.out::println);

        System.out.println();
        System.out.println("We are sorting now by the age");

//Sort
        List<Klasa_Person> sortingList  = people.stream().sorted(Comparator.comparing(Klasa_Person::getAge).reversed())
                 .collect(Collectors.toList());

        sortingList.forEach(System.out::println);
        System.out.println();
        System.out.println("We are finding now who is the oldest man");

//max

        people.stream().filter(klasa_person -> klasa_person.getGeneder().equals(Gjinia.MALE)).
                max(Comparator.comparing(Klasa_Person::getAge)).ifPresent(System.out::println);

        System.out.println();
        System.out.println("We are finding now who is the oldest Woman");

        people.stream().filter(Klasa_Person-> Klasa_Person.getGeneder().equals(Gjinia.FEMALE)).
                max(Comparator.comparing(Klasa_Person::getAge)).ifPresent(System.out::println);

        System.out.println();
        System.out.println("We are finding now who is the youngest person");

        people.stream().min(Comparator.comparing(Klasa_Person::getAge)).ifPresent(System.out::println);
        System.out.println();
        System.out.println("We are finding now if its true that all persons are bigger than 18 years old");
//All Match/AnyMatch
        boolean biggerThan18 = people.stream().allMatch(Klasa_Person-> Klasa_Person.getAge() > 18);
        System.out.println("Computer now will say whether is true or fales : " + biggerThan18);
        System.out.println();
        System.out.println("We are finding now if its true or false that all persons are under 30");
        boolean under30 = people.stream().anyMatch(Klasa_Person -> Klasa_Person.getAge() < 30);
        System.out.println("Computer now will say whether is true or false: " + under30);

        System.out.println();
        System.out.println("We are finding now whether name 'Richard' is on the List");

//Non Match
        boolean nameRichard = people.stream().noneMatch(Klasa_Person -> Klasa_Person.getName().equalsIgnoreCase("Richard"));
        System.out.println("Computer now will say whether is true or false: " + nameRichard);

//Group
        System.out.println();
        System.out.println("We are diving the class now in two groups males and females");

        Map<Gjinia, List<Klasa_Person>> groupByGjinia =
                people.stream().collect(Collectors.groupingBy(Klasa_Person::getGeneder));

        groupByGjinia.forEach((gjinia, klasa_people) -> {
            System.out.println(gjinia);
            klasa_people.forEach(System.out::println);
        });




    }

    private static List<Klasa_Person> getPeople(){
        return List.of(
                new Klasa_Person("Albino Lumi", 29, Gjinia.MALE),
                new Klasa_Person("Richard Johnson", 32, Gjinia.MALE),
                new Klasa_Person("Martina Smith", 25, Gjinia.FEMALE),
                new Klasa_Person("Ana Vajovic", 35, Gjinia.FEMALE),
                new Klasa_Person("Lucas Manzano", 37, Gjinia.MALE),
                new Klasa_Person("Marco Ramazzotti", 24, Gjinia.MALE),
                new Klasa_Person("Elena Kilarova", 45, Gjinia.FEMALE)
        );

        }


        }




