package com.DesignPatters.Adapter;

public class NetStudent implements Student {
    private String fullName;
    private double grade;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public NetStudent(String fullName, double grade) {
        this.fullName = fullName;
        this.grade = grade;
    }
    @Override
    public double getGrade() {
        return this.grade;
    }

    @Override
    public void printFullName() {
        System.out.println(this.fullName);

    }

    public void printVersion(){
        System.out.println("1.0");
    }
}
