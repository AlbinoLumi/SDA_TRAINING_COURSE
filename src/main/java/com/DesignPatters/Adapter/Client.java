package com.DesignPatters.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Java java = new Java("Albino Lumi", 8.1);
        NetStudent NetStudent = new NetStudent("Richard Delvin", 7.0);
        Nxenes nxenes = new Nxenes("Michael ", "Row", 4);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(java);
        studentList.add(NetStudent);
        NxenesToStudentAdapter adapter = new NxenesToStudentAdapter(nxenes);
        studentList.add(adapter);

        for(Student student: studentList){
            student.printFullName();
            System.out.println(student.getGrade());
        }
    }
}
