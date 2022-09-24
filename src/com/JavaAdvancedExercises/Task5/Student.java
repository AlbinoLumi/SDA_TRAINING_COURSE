package com.JavaAdvancedExercises.Task5;

public class Student {
   private int id;
  private  String name;
   private String surname;
   private int numberOfCredits;

   private int grades;

   public Student(){};

   public Student(int id, String name, String surname, int numberOfCredits, int grades ){
       this.id= id;
       this.name = name;
       this.surname = surname;
       this.numberOfCredits = numberOfCredits;
       this.grades = grades;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}


