package com.DesignPatters.Adapter;

public class NxenesToStudentAdapter implements Student{

   private Nxenes nxenes;

    public NxenesToStudentAdapter(Nxenes nxenes) {
        this.nxenes = nxenes;
    }

    @Override
    public double getGrade() {
        return this.nxenes.getMark();
    }

    @Override
    public void printFullName() {
        System.out.println(this.nxenes.getName() + " " + this.nxenes.getSurname());

    }
}
