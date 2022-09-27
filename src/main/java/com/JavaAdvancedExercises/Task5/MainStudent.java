package com.JavaAdvancedExercises.Task5;

import com.JavaAdvancedExercises.Task5.Student;

public class MainStudent {

    public static void main(String[] args) {
        Student student1 = new Student(5,"Albino", "Lumi", 12, 9);
        Student student2 = new Student(8,"Richard", "Delvin", 20, 8);
        Student student3 = new Student(12,"Michael", "Corse", 25  , 7);

        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getSurname());
        System.out.println(student1.getNumberOfCredits());
        System.out.println(student1.getGrades());

        System.out.println("--------------------------------------------------");

        System.out.println(student2.getId());
        System.out.println(student2.getName());
        System.out.println(student2.getSurname());
        System.out.println(student2.getNumberOfCredits());
        System.out.println(student2.getGrades());

        System.out.println("--------------------------------------------------");

        System.out.println(student3.getId());
        System.out.println(student3.getName());
        System.out.println(student3.getSurname());
        System.out.println(student3.getNumberOfCredits());
        System.out.println(student3.getGrades());



    }
}
